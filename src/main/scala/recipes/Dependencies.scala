package recipes

import com.escalatesoft.subcut.inject.NewBindingModule
import org.ardlema.repository.{UserRepository, UserRepositoryCassandra}
import org.ardlema.services.{IdentityServiceCassandra, IdentityService}

object Dependencies extends NewBindingModule (module => {
      // can now use bind directly
  import module._

  // in our example we only need to bind to singletons, all bindings will
    // return the same instance.
    bind [UserRepository] toSingle new UserRepositoryCassandra
    bind [IdentityService] toSingle new IdentityServiceCassandra

    // with subcut however, we have many binding option as an example we bind the keyrepo and want a new
    // instance every time the binding is injected. We'll use the toProvider option for this
    //bind [KeyRepo] toProvider {new KeyRepository}
  })


