package domain.account

sealed trait TypeAccount {
  val description: String
}

final case class Check(description:String) extends TypeAccount
final case class Saving(description:String) extends TypeAccount
final case class Fiduciary(description:String) extends TypeAccount

object TypeAccount {
  def apply(code:Option[Int]): Either[DomainErrors, TypeAccount] = {
    code match {
      case Some(1) => Right(new Check("Check Account"))
      case Some(2) => Right(new Saving("Saving Account"))
      case Some(3) => Right(new Fiduciary("Fiduciary Account"))
      case _       => Left(IncorrectCodeByTypePerson())
    }
  }
}