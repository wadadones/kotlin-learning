

fun main(args: Array<String>) {
  val user = User("john", 23)
  user.print()
  println(user.disable())
}


interface Disable {
  fun print()
  fun disable(): String;
}

class User(val name: String, val age: Int) : Disable {
  override fun print() {
    println(name)
  }

  override fun disable(): String {
    return "disabled!"
  }

}
