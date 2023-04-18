package Lesson20_Task1

fun main(){
    val getIntroduce: (String) -> String = fun(name:String):String = "С новым годом, $name!"
    println(getIntroduce("Миша"))
}


