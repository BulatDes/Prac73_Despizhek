fun main(){
    // задание 4.5
    try{
        println("Введите Координаты x,y")
        var x:Double
        var y:Double
        x= readLine()!!.toDouble()
        y= readLine()!!.toDouble()
        println("Введите радиус")
        val r:Double
        r= readLine()!!.toDouble()
        if(r<=0){
            println("неправильное значение")
        }
        else{
        var dl:Double
        dl=Math.sqrt(Math.pow(x,2.0)+Math.pow(y,2.0))
        when{
            (dl>r)->println("Не принадлежит")
            (dl<=r)->println("Принадлежит")
        }
        }
    }catch (ex:Exception){
        println(ex.message)
    }
}
