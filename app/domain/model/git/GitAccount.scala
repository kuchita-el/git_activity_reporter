package domain.model.git

import domain.`type`.GitClientId
import domain.model.user.UserId

class GitAccount(private val userId: UserId, val clientId: GitClientId, val gitUserName: String, val accessToken: String) {

}