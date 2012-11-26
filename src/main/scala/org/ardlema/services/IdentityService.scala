package org.ardlema.services

import org.ardlema.model.User
import org.ardlema.repository.UserRepository

trait IdentityService extends AnyRef {

    def isRegisteredUser(userName: String, password: String) : Boolean

}
