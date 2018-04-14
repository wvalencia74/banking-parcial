package domain.services

import application.dto.AccountDTO
import domain.account.{Account, DomainErrors}

object AccountService {

  def createAccount(acDto: AccountDTO): Either[DomainErrors, Account] = {
    Account(acDto.id, acDto.holderId ,acDto.typePerson, acDto.holderName ,acDto.address, acDto.typeAccount, acDto.balance, acDto.startDate, acDto.closeDate)
  }

  def transferToAccount(va:BigDecimal, account: Account) ={
    //conservamos el nuevo valor
    val account1 = transferAccount(va, account)
  }

  def transferAccount[A](value: A)(account: Account)(implicit ts: Transfer[A]): Either[DomainErrors, Account]  = {
    ts.perfomTransfer(value, account)
  }

}
