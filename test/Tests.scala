import play._
import play.test._
import play.db.anorm._

import models._
import java.util.{Date}

import org.scalatest._
import org.scalatest.junit._
import org.scalatest.matchers._

class BasicTests extends UnitFlatSpec with ShouldMatchers {

    it should "run this dumb test" in {
        (1 + 1) should be (2)
    }

    it should "create and retrieve a User" in {
        User.create(User(NotAssigned, "Bob", "bob@gmail.com", new Date()))

        val bob = User.find(
            "email={email}").on("email" -> "bob@gmail.com"
        ).first()

        bob should not be (None)
        bob.get.name should be ("Bob")
   }

   it should "create a release for a package" in {
        // integrety errors stop the creation i think
        // this causes my tests to fail

        Package.create(Package(NotAssigned, "Package Uno", 0, 0))
        val uno = Package.find(
            "name={name}").on("name" -> "Uno"
        ).first()

        //Release.create()
        uno should not be (None)

        // TODO Finish writing test
   }

}

