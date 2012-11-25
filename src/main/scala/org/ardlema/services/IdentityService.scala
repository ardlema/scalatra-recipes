package org.ardlema.services

import org.ardlema.model.User
import org.ardlema.repository.UserRepository

trait IdentityService extends AnyRef {

    def get(userRepository: UserRepository, userName: String, password: String) : Option[User]

}
