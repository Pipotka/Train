import java.lang.Exception
import kotlin.random.Random

class Wagon {
    var Capacity = Random.nextInt(5, 25)
        set(value){
            if(value <= 0)
            {
                throw Exception("Capacity не может быть меньше или равно нулю")
            }
            field = value
        }
        get() = field

    var NumberOfPeople = 0
        set(value){
            if(value > Capacity)
            {
                throw Exception("Попытка вместить в ваго больше людей, чем он вмещает")
            }
            field = value
        }
        get() = field

    fun Print(){
        print(".[Вместимость=$Capacity;Количество людей=$NumberOfPeople].")
    }
}