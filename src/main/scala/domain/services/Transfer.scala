package domain.services

import domain.account._

trait Transfer [A]{
  def perfomTransfer(kind:A, value:BigDecimal, account:Account): Either[DomainErrors, Account]
}

object TransferInstances{
  implicit val debit = new Transfer[Credit] {
    override def perfomTransfer(value:BigDecimal, account: Account): Either[DomainErrors, Account] = {
      value match {
          //agregar las demás validaciones
        case _ => Right(account.copy(balance = Balance(account.balance.balance - value)))
      }
    }
  }

  implicit val credit = new Transfer [Debit]{
    override def perfomTransfer(value:BigDecimal, account: Account): Either[DomainErrors, Account] = {
      //agregar las demas validaciones
      value match {
        case _ => Right(account.copy(balance = Balance(account.balance.balance + value)))
      }
    }
  }
}
