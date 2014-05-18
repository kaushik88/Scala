/**
 * @author Kaushik Rangadurai.
 */

object TypeConversion {

  implicit def itoa(a :Int) :String = {
    a.toString
  }

  /*
   Example 1 -
      In this example, the Scala compiler first checks if there is a concat()
   method for Integers. If there is no such method, it checks if there is an implicit
   method defined that takes integer as an parameter.
    */
  val thirtyFour :String = 3.concat(4)

  /*
  Example 2 -
    In this example, the Scala compiler doesn't do an implicit conversion from Integer to
    String as the expression is a valid expression.
   */
  val thirtySix :Int = 3 * 12 // this works too

}

println(TypeConversion.thirtyFour)
println(TypeConversion.thirtySix)