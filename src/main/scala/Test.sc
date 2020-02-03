class Person(val name:String,val age:Int) extends Ordered[Person]{

  override def  <(that: Person): Boolean = {
    println("inside func")
    val x: Boolean = this.name == that.name
    if (x) {
      this.age1(that)
    }
    else {
        this.name.length() < that.name.length()

    }
  }


    override def compare(that: Person): Int = 0


   def  age1 (that: Person): Boolean = {
        this.age < that.age
  }
}
val m=new Person("abc1",24)
val m1=new Person("def34",25)
m < m1
