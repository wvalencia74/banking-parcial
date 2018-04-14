package domain.account

import java.util.UUID

final case class Account(id:AccountNumber, holder: AccountHolder, address: Address, typeAccount: TypeAccount, balance: Balance, startDate:FormatDate, closeDate:FormatDate) {}

object Account {
  def apply(id: Option[UUID], holderId:Option[UUID],typePerson: Option[Int], holderName:Option[String],address: Option[String], typeAccount: Option[Int], balance: Option[BigDecimal], startDate:Option[String], closeDate: Option[String]) = {
    for {
      ident   <- AccountNumber(id)
      hold    <- AccountHolder(holderId, holderName, typePerson)
      addr    <- Address(address)
      typeAcc <- TypeAccount(typeAccount)
      balanc  <- Balance(balance)
      stDate  <- FormatDate(startDate)
      clDate  <- FormatDate(closeDate)
    } yield {
      new Account(ident,hold,addr,typeAcc,balanc,stDate,clDate)
    }
  }
}
