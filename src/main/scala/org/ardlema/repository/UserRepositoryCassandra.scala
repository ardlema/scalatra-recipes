package org.ardlema.repository

import org.ardlema.model.User

class UserRepositoryCassandra extends AnyRef with UserRepository {

  def get(userName: String, password: String) : Option[User] = {
     val usuario = new User()
     usuario.name = "amparo!!!"
     usuario.age = 20
     Some(usuario)
  }

}
