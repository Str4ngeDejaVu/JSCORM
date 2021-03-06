package com.arcusys.learn.tincan.storage

import com.arcusys.learn.tincan.model.{ AgentProfile, Agent }
import org.joda.time.DateTime

trait AgentProfileStorage {

  def get(profileId: String, agent: Agent): Option[AgentProfile]
  def getIds(agent: Agent, since: Option[DateTime]): Seq[String]
  def create(entity: AgentProfile)
  def modify(entity: AgentProfile)
  def delete(profileId: String, agent: Agent)
  def renew()
}
