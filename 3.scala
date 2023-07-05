def toUpper(str: String): String = {
  str.toUpperCase()
}

def toLower(str: String): String = {
  str.toLowerCase()
}

def formatNames(name: String)(formatFunc: String => String): String = {
  formatFunc(name)
}

@main def main() = {
    println(formatNames("Benny")(toUpper))
    println(formatNames("Ni")(toUpper)+"roshan")
    println(formatNames("Saman")(toLower))
    println("Kumar"+formatNames("a")(toUpper))
}
