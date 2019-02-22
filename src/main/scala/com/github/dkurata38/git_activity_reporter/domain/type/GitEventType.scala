package com.github.dkurata38.git_activity_reporter.domain.`type`

sealed abstract class GitEventType

object GitEventType {
  case object Push extends GitEventType
  case object PullRequest extends GitEventType
}
