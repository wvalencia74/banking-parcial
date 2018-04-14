package domain.account

sealed trait TypePerson {}

final case class Natural() extends TypePerson
final case class Juridica() extends TypePerson


object TypePerson {
  def apply(code:Option[Int]): Either[DomainErrors, TypePerson] = {
    code match {
      case Some(1) => Right(new Natural())
      case Some(2) => Right(new Juridica())
      case _       => Left(IncorrectCodeByTypeAccount())
    }
  }
}


