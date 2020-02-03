trait MyTrait{
  def enque(ele:List[Any],elem:Int):List[Any]
  def dequ(ele1:List[Any]):List[Any]
}

class DoubleQueue extends MyTrait
{
  override def dequ(ele1: List[Any]): List[Any] ={
   val new_list= ele1.drop(1)
    new_list
  }

  override def enque(ele: List[Any],elem:Int): List[Any] = {
    val new_list=ele:+ 2 * elem
     new_list
  }
}

class SquareQueue extends MyTrait
{
  override def dequ(ele1: List[Any]): List[Any] ={
    val new_list= ele1.drop(1)
    new_list
  }

  override def enque(ele: List[Any],elem:Int): List[Any] = {
    val new_list=ele:+ elem * elem
    new_list

    }
}


val sq=new SquareQueue

val dq=new DoubleQueue

val x1=sq.enque(List(1,2,3),4)

for(i <- x1){
  print(i)
}
println(" ")

val z=sq.dequ(x1)
  for(i1 <- z){
  print(i1)
}
println(" ")
val x2=dq.enque(List(1,2,3),4)

  for(i2 <- x2){
    print(i2)
  }
println(" ")
 val z1=dq.dequ(x2)

  for(i3 <- z1){
    print(i3)
  }


