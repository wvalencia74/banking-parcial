package domain.account

final case class NameAccount(name:String) {}

object NameAccount {
  def apply(name: Option[String]): Either[DomainErrors, NameAccount] = {
    name match {
      case Some(nam) => Right(new NameAccount(nam))
      case _ => Left(EmptyNameAccount())
    }
  }

}
