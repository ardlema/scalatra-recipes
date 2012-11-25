package org.ardlema.repository

import org.ardlema.model.User

trait UserRepository {

    def get(userName: String, password: String) : Option[User]

}
