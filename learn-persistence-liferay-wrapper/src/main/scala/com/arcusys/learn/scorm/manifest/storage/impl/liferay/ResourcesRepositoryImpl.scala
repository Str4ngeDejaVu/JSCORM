package com.arcusys.learn.scorm.manifest.storage.impl.liferay

import com.arcusys.learn.persistence.liferay.model.LFResource
import com.arcusys.learn.persistence.liferay.service.LFResourceLocalServiceUtil
import com.arcusys.learn.scorm.manifest.model.{ AssetResource, ScoResource, Resource }
import com.arcusys.learn.scorm.manifest.storage.ResourcesStorage
import scala.collection.JavaConverters._

/**
 * Created by mminin on 15.10.14.
 */
class ResourcesRepositoryImpl extends ResourcesStorage {

  override def renew(): Unit = {
    LFResourceLocalServiceUtil.removeAll()
  }

  override def createForPackageAndGetID(packageID: Int, entity: Resource): Int = {
    val newEntity = LFResourceLocalServiceUtil.createLFResource()

    newEntity.setResourceID(entity.id)
    newEntity.setBase(entity.base.getOrElse(null))
    newEntity.setHref(entity.href.getOrElse(null))

    newEntity.setScormType(entity match {
      case s: ScoResource   => "sco"
      case a: AssetResource => "asset"
      case _                => throw new UnsupportedOperationException("Unknown resource type")
    })

    newEntity.setPackageID(packageID)
    LFResourceLocalServiceUtil.addLFResource(newEntity).getPrimaryKey.toInt
  }

  override def delete(packageID: Int): Unit = {
    LFResourceLocalServiceUtil.deleteLFResource(packageID)
  }

  override def getAll: Seq[Resource] = {
    LFResourceLocalServiceUtil.getLFResources(-1, -1).asScala map extract
  }

  override def getByID(packageID: Int, resourceID: String): Option[Resource] = {
    LFResourceLocalServiceUtil.findByPackageIDAndResourceID(packageID, resourceID, 0, 1).asScala
      .headOption.map(extract)
  }

  override def getByPackageID(packageID: Int): Seq[Resource] = {
    LFResourceLocalServiceUtil.findByPackageID(packageID).asScala
      .map(extract)
  }

  private def extract(entity: LFResource) = {
    import com.arcusys.learn.storage.impl.liferay.LiferayCommon._
    val id = entity.getResourceID
    val href = entity.getHref.toOption
    val base = entity.getBase.toOption
    if (entity.getScormType.equalsIgnoreCase("sco")) new ScoResource(id, href.get, base, Nil, Nil)
    else new AssetResource(id, href, base, Nil, Nil)
  }
}
