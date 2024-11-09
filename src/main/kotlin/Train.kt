class Train {
    var startCity : String = ""
        set(value){
            field = value
        }
        get() = field

    var endCity : String = ""
        set(value){
            field = value
        }
        get() = field


    fun printSity(){
        print("$startCity - $endCity")
    }

    fun printTrain(){

    }
}