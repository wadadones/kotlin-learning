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
  println(person.fullName)

  var person2 = PersonWithPrimaryConstructor("mark", "john")
  println(person2.info)

  var personDetail = PersonDetail("sdf", "sdfs", 3)
  println(personDetail)


}


open class Person {
  open val firstName: String
  open val lastName: String
  open var age: Int

// 'val' on secondary constructor parameter is not allowed <- secondary constructorの引数にvalをつけるとこうなる
  constructor(firstName: String, lastName: String, age: Int) {
    this.firstName = firstName
    this.lastName = lastName
    this.age = age
  }

  val fullName: String
    get() = firstName + " " + lastName
}

class PersonDetail(override val firstName: String, override val lastName: String, override var age: Int) : Person(firstName, lastName, age) {

  // overrideとopenがセットになって必要
}
    

  // fun getFullName(): String {
  //   return firstName + " " + lastName
  // }

class PersonWithPrimaryConstructor(val firstName: String, val lastName: String, var age: Int = 0) {
  // error: property must be initialized or be abstract
  // 定義したプロパティはちゃんとinitialze or abstractにしないといけない？
  val info: String
  get() = firstName + "_" + lastName + "_" + age
  
  // fun info(): String {
  //   return firstName + "_" + lastName + "_" + age
  // }
}
