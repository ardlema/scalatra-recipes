package org.ardlema.repository

import org.ardlema.model.User

class UserRepositoryCassandra extends AnyRef with UserRepository {

  def isRegisteredUser(userName: String, password: String) : Boolean = {
     //todo: chequear valores en Cassandra
     (userName, password) match {
       case ("alberto","12345") => true
       case _ => false
     }
  }

}
