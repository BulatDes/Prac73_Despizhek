fun main(){
    try {
        println("Введите число к в уравнении (y=kx+b)")
        val k: Double
        k= readLine()!!.toDouble()
        println("Введите число b в уравнении (y=kx+b)")
        val b: Double
        b= readLine()!!.toDouble()
        println("Введите число к c уравнении (y=cx+d)")
        val c: Double
        c= readLine()!!.toDouble()
        println("Введите число к d уравнении (y=cx+d)")
        val d: Double
        d= readLine()!!.toDouble()
        var y:Double
        var x:Double
        if((k-c)==0.0){
            println("Прямые параллельны т.е не пересекаются")
        }
        else {
            x = (b - d) / (k - c) * -1
            y = (k * x) + b
            println("x=${(b - d) / (k - c) * -1} \ny=${k * x + b}")
            println("Координаты пересечения прямых:($x:$y)")
        }

    }catch (ex:Exception){
        println(ex.message)
    }
}