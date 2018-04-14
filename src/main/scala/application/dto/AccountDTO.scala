package application.dto

import java.util.UUID

final case class AccountDTO (id: Option[UUID], holderId:Option[UUID],typePerson: Option[Int], holderName:Option[String],address: Option[String], typeAccount: Option[Int], balance: Option[BigDecimal], startDate:Option[String], closeDate: Option[String]){
}



