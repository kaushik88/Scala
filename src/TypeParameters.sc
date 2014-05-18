/**
 * @author Kaushik Rangadurai
 */

case class Currency(implicit val symbol:String)

object TypeParameters {

  def printAmount(amount :Double)(implicit currency: Currency) = {
    println(currency.symbol + amount)
  }
}

object Dollar {
  implicit val dollarCurrency = Currency("$")

  def printDollar(value :Double) = {
    TypeParameters.printAmount(value)
  }
}

Dollar.printDollar()



