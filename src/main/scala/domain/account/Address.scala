package domain.account

final case class Address(numberAdress:String) {}

object Address{
  def apply(numAddress: Option[String]): Either[DomainErrors, Address] = {
    numAddress match {
      case Some(nAddress) => Right(new Address(nAddress))
      case _ => Left(EmptyAccountNumber())
    }
  }
}
