import Array._

object dojo{
  def main(args: Array[String]) {
    //Arreglo
    println("El valor es:" + dojo.suma(2,5))
    var array1=new Array[Int](2)

    array1(0)=1
    array1(1)=2

    for(i <- 0 to (array1.length-1)){
      println("Arreglo")
      println(array1(i))
    }

    //Matriz
    var nombre="Scala"
    var matriz=ofDim[Int](2,2)
    println("Matriz")

    for(i <- 0 to 1){
      for(j <- 0 to 1){
        println(matriz(i)(j))
      }
    }
    var array2=("Hola","Mundo")
    var array3=(1.2,1.4)

  }
  def suma(x:Int,y:Int)=x+y


}
