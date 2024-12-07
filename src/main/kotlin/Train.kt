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

    var wagons = ArrayList<Wagon>()
        set(value){
            field = value
        }
        get() = field

    fun direction() : String{
        return "$startCity - $endCity"
    }

    fun printTrain(){
        print("/поезд|.")
        for(wagon in wagons)
        {
            wagon.Print()
        }
    }

    fun loadingPassengers(Passengers : Int){
        var passengers = Passengers

        while (passengers > 0)
        {
            var wagon = Wagon()
            if (passengers - wagon.Capacity > 0)
            {
                wagon.NumberOfPeople = wagon.Capacity
            }
            else
            {
                wagon.NumberOfPeople = passengers
            }
            wagons.add(wagon)
            passengers -= wagon.Capacity
        }
    }
}