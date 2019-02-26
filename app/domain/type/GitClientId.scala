package domain.`type`

sealed abstract class GitClientId(val value: String) {
  override def hashCode(): Int = value.hashCode

  override def equals(obj: Any): Boolean = {
    obj match {
      case obj: GitClientId => value == obj.value
      case _ => false
    }
  }
}

object GitClientId {

  case object GitHub extends GitClientId("GitHub")

  case object GitLab extends GitClientId("GitLab")

  case object BitBucket extends GitClientId("BitBucket")

}