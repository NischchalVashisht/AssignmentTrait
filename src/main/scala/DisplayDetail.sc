class FirstName(val name:String) {
  override def toString: String = " " + name
}
  class LastName(val last:String)
   {
     override def toString: String = " "+last

   }
  class Age(val age:Int)
  {
    override def toString: String = " "+age

  }

  def displayDetail(a:FirstName,b:LastName,c:Age)=" "+a+"  "+b+" is of  "+c+" year"


println(displayDetail(new FirstName("Nishchal"),new LastName("Vashisht"),new Age(24)))
