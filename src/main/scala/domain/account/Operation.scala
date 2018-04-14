package domain.account

sealed trait Operation {

}

final case class Credit extends Operation
final case class Debit extends Operation
