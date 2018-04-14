package domain.account

trait DomainErrors {
  val description:String
}

final case class EmptyAccountNumber(description:String = "There are no parameters to build the accountNumber") extends DomainErrors
final case class EmptyAddress(description:String = "There are no parameters to build the address") extends DomainErrors
final case class EmptyAccountHolder(description:String = "There are no parameters to build the accountNumber") extends DomainErrors
final case class EmptyBalance(description:String = "There are no parameters to build the balance") extends DomainErrors
final case class EmptyNameAccount(description:String = "There are no parameters to build the nameAccount") extends DomainErrors
final case class IncorrectCodeByTypeAccount(description:String = "The code to create the account type is incorrect") extends DomainErrors
final case class IncorrectCodeByTypePerson(description:String = "The code to create the Person type is incorrect") extends DomainErrors