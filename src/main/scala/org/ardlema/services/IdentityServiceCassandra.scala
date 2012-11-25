package org.ardlema.services

import org.ardlema.model.User
import org.ardlema.repository.UserRepository

class IdentityServiceCassandra
  extends AnyRef
  with IdentityService
   {

    def get(userRepository: UserRepository, userName: String, password: String) : Option[User] = {
        val usuario = userRepository.get(userName, password)
        Some(usuario.get)
   }
}


