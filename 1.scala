def calculateInterest(depositAmount: Double): Double = {
  depositAmount match {
    case amount if amount <= 20000 => amount * 0.02
    case amount if amount <= 200000 => amount * 0.04
    case amount if amount <= 2000000 => amount * 0.035
    case amount => amount * 0.065
  }
}

@main def main() ={
    val deposit = 80000.0
    val interest = calculateInterest(deposit)
    println(s"Your interest is Rs. $interest")
}