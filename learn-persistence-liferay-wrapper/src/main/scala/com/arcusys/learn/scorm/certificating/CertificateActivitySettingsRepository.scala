package com.arcusys.learn.scorm.certificating.impl

import com.arcusys.learn.persistence.liferay.service.{ LFCertificateActivityLocalServiceUtil }
import java.security.InvalidParameterException
import com.arcusys.learn.scorm.certificating.CertificateActivitySettingsRepositoryContract
import com.arcusys.learn.scorm.manifest.model.PeriodType

import com.arcusys.learn.persistence.liferay.service.LFCertificateActivityLocalServiceUtil
import com.arcusys.learn.scorm.tracking.model.certificating.models.CertificateActivitySettings

import scala.collection.JavaConverters._

/**
 * Created by Iliya Tryapitsin on 14.05.2014.
 */
class CertificateActivitySettingsRepository extends CertificateActivitySettingsRepositoryContract {

  override def get(keys: (String, Any)*): CertificateActivitySettings = keys match {
    case Seq(("certificateId", certificateId: Int), ("activityName", activityName: String)) => {
      val storageEntity = LFCertificateActivityLocalServiceUtil
        .findByCertificateIDAndActivityName(certificateId, activityName)

      CertificateActivitySettings(
        storageEntity.getCertificateID.toInt,
        storageEntity.getActivityName,
        storageEntity.getDatacount,
        Some(storageEntity.getPeriod),
        PeriodType(storageEntity.getPeriodType))
    }

    case _ => throw new InvalidParameterException()
  }

  override def delete(parameters: (String, Any)*) = parameters match {
    case Seq(("certificateId", certificateId: Int), ("activityName", activityName: String)) => {
      val storageEntity = LFCertificateActivityLocalServiceUtil
        .findByCertificateIDAndActivityName(certificateId, activityName)

      LFCertificateActivityLocalServiceUtil.deleteLFCertificateActivity(storageEntity)
    }

    case _ => throw new InvalidParameterException()
  }

  override def modify(entity: CertificateActivitySettings): CertificateActivitySettings = {
    val storageEntity = LFCertificateActivityLocalServiceUtil.findByCertificateIDAndActivityName(entity.certificateId, entity.activityName)

    storageEntity.setDatacount(entity.count)
    storageEntity.setPeriod(entity.value.get)
    storageEntity.setPeriodType(entity.periodType.toString)

    LFCertificateActivityLocalServiceUtil.updateLFCertificateActivity(storageEntity)
    entity.copy()
  }

  override def create(entity: CertificateActivitySettings): CertificateActivitySettings = {
    val storageEntity = LFCertificateActivityLocalServiceUtil.createLFCertificateActivity(entity.certificateId, entity.activityName)

    storageEntity.setPeriod(entity.value.getOrElse[Int](0))
    storageEntity.setPeriodType(entity.periodType.toString)
    storageEntity.setDatacount(entity.count)
    LFCertificateActivityLocalServiceUtil.addLFCertificateActivity(storageEntity)

    entity.copy()
  }

  override def select(keys: (String, Any)*): Seq[CertificateActivitySettings] = keys match {
    case Seq(("certificateId", certificateId: Int)) => getByCertificateId(certificateId).toSeq

    case Seq(("activityName", activityName: String)) => {
      LFCertificateActivityLocalServiceUtil
        .findByActivityName(activityName)
        .asScala
        .map(c => CertificateActivitySettings(
          c.getCertificateID.toInt,
          c.getActivityName,
          c.getDatacount,
          Some(c.getPeriod),
          PeriodType(c.getPeriodType)))
    }

    case _ => throw new InvalidParameterException()
  }

  def getByCertificateId(certificateId: Int): Seq[CertificateActivitySettings] = {
    LFCertificateActivityLocalServiceUtil
      .findByCertificateID(certificateId.toLong)
      .asScala
      .map(c => CertificateActivitySettings(
        c.getCertificateID.toInt,
        c.getActivityName,
        c.getDatacount,
        Some(c.getPeriod),
        PeriodType(c.getPeriodType)))
  }

  def getByCertificateIdCount(certificateId: Int): Int = {
    LFCertificateActivityLocalServiceUtil.findByCertificateID(certificateId.toLong).size()
  }
}
