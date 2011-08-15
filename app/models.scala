package models

import play.db.anorm._
import play.db.anorm.defaults._
import java.util.{Date}

// Need a secure password hash field
case class User (
    id:Pk[Long], name:String, email:String, joined:Date
)
object User extends Magic[User]

case class Journal(
    id: Pk[Long], release:Long, action:String, date:Date, user:Long, ip:String
)
object Journal extends Magic[Journal]

case class Release (
  id:Pk[Long], packageParent:Long, name:String, version:String,
  author:Long, authorEmail:String, maintainer:Long, maintainerEmail:String,
  summary:String, description:Option[String],
  keywords:Option[String],
  requirements:Option[String],
  provides:Option[String],
  obsoletes:Option[String],

  homePage:Option[String],
  downloadUrl:Option[String],
  hidden:Boolean,

  license:Option[String],
  platform:Option[String]
);
object Release extends Magic[Release]

case class Package (
  id:Pk[Long],  name:String, release:Long, admin:Long
);
object Package extends Magic[Package]

case class ReleaseDiscriminator (
    id:Pk[Long],
    release:Long,
    discriminator:Long
)
object ReleaseDiscriminator extends Magic[ReleaseDiscriminator]

case class TroveDiscriminator(
    id:Pk[Long],
    discriminator:String
)
object TroveDiscriminator extends Magic[TroveDiscriminator]

