fun main(args: Array<String>) {
  var x: String = "abc"; //String
  val y: String = "def"; //final String
  println("Hello, world");
  println(x);
  println(y);

  // var s = "sdf";

  val a = 2;
  val d = a.toString();

  println(d);
  
  val k = when (a) {
    0 -> "sdf"
    1,2 -> "sde"
    else -> "sdfs"
  }

  println(k)

  var person = Person("michael", "johnson", 34)
  println(person.getFullName())


}


// class Person(var name: String) {
//   init {
//     name += "xxx"
//   }
//   fun print() {
//     println("sdfsdfs" + name)
//   }  
// }

class Person {
  val firstName: String
  val lastName: String
  var age: Int

// 'val' on secondary constructor parameter is not allowed <- secondary constructorの引数にvalをつけるとこうなる
  constructor(firstName: String, lastName: String, age: Int) {
    this.firstName = firstName
    this.lastName = lastName
    this.age = age
  }

  fun getFullName(): String {
    return firstName + " " + lastName
  }
}
