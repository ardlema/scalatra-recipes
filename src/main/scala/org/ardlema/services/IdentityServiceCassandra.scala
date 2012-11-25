package org.ardlema.services

import org.ardlema.model.User
import org.ardlema.repository.UserRepository

class IdentityServiceCassandra
  extends AnyRef
  with IdentityService
   {

    def isRegisteredUser(userRepository: UserRepository, userName: String, password: String) : Boolean = {
        userRepository.isRegisteredUser(userName, password)

   }
}


