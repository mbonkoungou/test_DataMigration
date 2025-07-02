object TicketPriceCalculator {
  def main(args: Array[String]): Unit = {
    println("Enter your age:")

    // Read user input
    val input = scala.io.StdIn.readLine()
    try {
      val age = input.toInt
      val price = calculateTicketPrice(age)
      println(s"Ticket price: $$${price}")
    } catch {
      case _: NumberFormatException => println("Invalid input. Please enter a valid number.")
    }
  }

  def calculateTicketPrice(age: Int): Int = {
    if (age < 5) {
      0
    } else if (age <= 17) {
      8
    } else if (age <= 64) {
      12
    } else {
      6
    }
  }
}
