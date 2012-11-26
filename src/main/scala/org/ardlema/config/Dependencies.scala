package org.ardlema.config

import org.ardlema.services.IdentityServiceCassandra
import org.ardlema.repository.UserRepositoryCassandra

object Dependencies {

  val identityService = new IdentityServiceCassandra

  val userRepository = new UserRepositoryCassandra

}
