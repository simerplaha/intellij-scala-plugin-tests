object OverloadedMethodTest {

  def makeString(chars: Char*): String =
    makeString(
      chars = chars.toSeq,
      sep = "\n"
    )

  def makeString(chars: Seq[Char],
                 sep: String): String =
    chars.mkString(sep)

  def main(args: Array[String]): Unit =
    println(makeString('A', 'B', 'C'))

}
