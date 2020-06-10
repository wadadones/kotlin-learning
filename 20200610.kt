
fun main(args: Array<String>) {
  val pet = Pet("sadan")
  pet.print()
  pet.print2()
  Pet.staticPrint()
  pet.printX("sdf", "ffff")
  pet.printName()

}


interface Printable {
  fun print()
}

interface Printable2 : Printable {
  fun print2()
}

class Pet(name: String) : Printable2 {
  private var name: String = name
  private var age: Int = 0

  constructor(name: String, age: Int) : this(name) {
    this.age = age
  }
  override fun print() {
    println("Printable!")
  }

  override fun print2() {
    println("Printable2!")
  }

  fun printX(arg1: String, arg2: String) {
    println(arg1+ "_____" +arg2)
  }

  fun printName() {
    println(name);
  }
  // static見たく値や関数を使える
  companion object {
    fun staticPrint() {
        println("StaticPrint!")
    }
    // Pet.staticPrint() が使えるようになる
  }

}
