import java.util.*

fun main(args: Array<String>){
//    println("Hello, ${args[0]}!")
//    val temperature = 10
//    val message = "Good ${ if (args[0].toInt() < 12) "morning" else "night"}, Kotlin"
//    println(message)
    //dayOfWeek()
//    feedTheFish()
//    getFortuneCookie()
//    println(canAddFish(10.0, arrayListOf(3,3,3)))
//    println(canAddFish(8.0, arrayListOf(2,2,2), hasDecorations = false))
//    println(canAddFish(9.0, arrayListOf(1,1,3), 3))
//    println(canAddFish(10.0, arrayListOf(), 7, true))
    sortList()
}

fun sortList(){
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    val sorted_spices = spices.sorted()
    val filter_sorted_spices = sorted_spices.filter { it[0] == 'c' && it[it.length-1] == 'e' }
    println(filter_sorted_spices)
}

fun getFortuneCookie(): String{
    val listOfFortunes = listOf("You will have a great day!", "Things will go well for you today.", "Enjoy a wonderful day of success.", "Be humble and all will turn out well.", "Today is a good day for exercising restraint.", "Take it easy and enjoy life!", "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    print(birthday)
    return ""
}

fun shouldChangeWater(
        day: String,
        temperature: Int = 22,
        dirty: Int = 20) : Boolean {

//    val isTooHot = temperature > 30
//    val isDirty = dirty > 30
//    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)

    if(shouldChangeWater(day)){
        println("Change the water today")
    }
}

fun canAddFish(
        tankSize: Double,
        currentFish: ArrayList<Int>,
        fishSize: Int = 2,
        hasDecorations: Boolean = true) : Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun randomDay() : String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day : String) : String {
    return when (day) {
        "Sunday" -> "plankton"
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        else -> "fasting"
    }
}

fun dayOfWeek(){
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    var dayName: String = ""
    when (day) {
        1 -> dayName = "Sunday"
        2 -> dayName = "Monday"
        3 -> dayName = "Tuesday"
        4 -> dayName = "Wednesday"
        5 -> dayName = "Thursday"
        6 -> dayName = "Friday"
        7 -> dayName = "Saturday"
    }
    println(dayName)
}