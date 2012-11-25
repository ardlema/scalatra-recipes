package org.ardlema.repository

import org.ardlema.model.User

class UserRepositoryCassandra extends AnyRef with UserRepository {

  def isRegisteredUser(userName: String, password: String) : Boolean = {
     (userName, password) match {
       case ("alberto","12345") => true
       case _ => false
     }
  }

}
