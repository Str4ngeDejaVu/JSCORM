package com.arcusys.learn.scorm.tracking.model.certificating.models

import com.arcusys.learn.scorm.manifest.model.PeriodType
import PeriodType._

/**
 * Created by Iliya Tryapitsin on 27.05.2014.
 */
case class CertificateActivitySettings(certificateId: Int,
  activityName: String,
  count: Int,
  value: Option[Int] = None,
  periodType: PeriodType)
