package domain.account

import java.util.UUID

final case class AccountNumber(num:UUID) {}

object AccountNumber {
  def apply(num: Option[UUID]): Either[DomainErrors, AccountNumber] = {
      num match {
        case Some(ident) => Right(new AccountNumber(ident))
        case _ => Left(EmptyAccountNumber())
      }
    }
}