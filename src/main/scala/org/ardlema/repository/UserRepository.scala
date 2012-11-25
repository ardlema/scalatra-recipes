package org.ardlema.repository

import org.ardlema.model.User

trait UserRepository {

    def isRegisteredUser(userName: String, password: String) : Boolean

}
