package domain.account

final case class FormatDate(date:String){}

object FormatDate {
  def apply(date: Option[String]): Either[DomainErrors, FormatDate] = {
    date match {
      case Some(dat) => Right(new FormatDate(dat))
        // Aquí deberían las demás validaciones para que la fecha tenga el formato adecuado
    }
  }
}


