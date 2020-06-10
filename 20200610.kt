fun main(args: Array<String>) {
  val pet = Pet()
  pet.print()
  pet.print2()
  Pet.staticPrint()

}


interface Printable {
  fun print()
}

interface Printable2 : Printable {
  fun print2()
}

class Pet : Printable2 {
  override fun print() {
    println("Printable!")
  }

  override fun print2() {
    println("Printable2!")
  }
  // static見たく値や関数を使える
  companion object {
    fun staticPrint() {
        println("StaticPrint!")
    }
    // Pet.staticPrint() が使えるようになる
  }

}
