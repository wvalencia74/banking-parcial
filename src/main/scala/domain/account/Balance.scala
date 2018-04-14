package domain.account

final case class Balance(balance: BigDecimal) {}

object Balance {
  def apply(bal:Option[BigDecimal]): Either[DomainErrors, Balance] = {
    bal match {
      case Some(balanc) => Right(new Balance(balanc))
      case _ => Left(EmptyBalance())
    }
  }
}
