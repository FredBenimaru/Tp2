
import java.util.*

fun randomDay() : String {
    val week = arrayOf("Monday", "tuesday", "Wednesday", "Sunday")
    return week[Random().nextInt(week.size)]
}

fun fishFood (day : String) : String {
    return when(day) {
        "Monday" ->  "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "moskitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("change water: ${shouldChangeWater(day)}")
}

fun swim(speed: String = "fast"){
    println("swiming $speed")
}

fun shouldChangeWater (day: String, temperature: Int = 20, dirty :Int =20): Boolean{
    return when{
        isToohot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun isToohot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun main(args: Array<String>){
    feedTheFish()
    swim()
    swim("slow")
    swim(speed = "turtle-like")
}





