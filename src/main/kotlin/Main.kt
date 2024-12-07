import kotlin.random.Random

fun main(args: Array<String>) {
 var isEnd = false
 while(!isEnd)
 {
  var isCorrect = false
  var userDecision = ""
  while(!isCorrect)
  {
   println("Хотите ли вы закончить работу или составить поезд?")
   print("Хотите ли вы составить поезд YES/EXIT:")
   userDecision = readln()
   userDecision = userDecision.toUpperCase()
   if(userDecision == "YES" || userDecision == "EXIT")
   {
    isCorrect = true
   }
   else
   {
    println("Такого выбора не существует! Попробуйте ещё раз.")
   }
  }

  if(userDecision == "YES")
  {
   var train = Train()
   train.startCity = GenerateCity()
   train.endCity = GenerateNonRepeatingCities(train.startCity)

   var sellTickets = Random.nextInt(5, 201)
   println("Количество проданных билетов: $sellTickets")
   train.loadingPassengers(sellTickets)

   println("Поезд ${train.direction()}, состоящий из ${train.wagons.count()} вагонов отправлен.")
   train.printTrain()
   println()
  }
  else if(userDecision == "EXIT")
  {
   isEnd = true
  }
 }
}

fun GenerateNonRepeatingCities(NonRecurringCity : String) : String{
 var isCorrect = false
 var result = ""
 while (!isCorrect)
 {
  result = GenerateCity()
  if(result != NonRecurringCity)
  {
   isCorrect = true
  }
 }
 return result
}

fun GenerateCity() : String{
 var numberOfCity = Random.nextInt(0, 14)
 var result = ""
 var listOfSity = listOf("Азов", "Алдан", "Амурск",
  "Балашиха", "Барыш", "Белогорск", "Верхнеуральск",
  "Демидов", "Дербент", "Донецк", "Елабуга", "Избербаш",
  "Изобильный", "Канск", "Карачеев", "Буйнакск")
 result = listOfSity.get(numberOfCity)
 return result
}