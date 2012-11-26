package org.ardlema.services

import org.ardlema.config.Dependencies._

class IdentityServiceCassandra
  extends AnyRef
  with IdentityService
   {

    def isRegisteredUser(userName: String, password: String) : Boolean = {
        userRepository.isRegisteredUser(userName, password)

   }
}


