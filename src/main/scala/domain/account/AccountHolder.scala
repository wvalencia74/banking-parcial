package domain.account

import java.util.UUID

final case class AccountHolder(id:UUID, name: NameAccount, typePerson: TypePerson) {}

object AccountHolder{
  def apply(num: Option[UUID], name: Option[String],pers:Option[Int]): Either[DomainErrors, AccountHolder] = {
    for {
      number    <- num
      nam       <- NameAccount(name)
      person    <- TypePerson(pers)
    } yield {
        AccountHolder(number, nam,person)
    }
  }
}