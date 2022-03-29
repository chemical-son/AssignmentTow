package Q4

import kotlin.math.min

class Time {
    private var hours: Int = 0
    private var minutes: Int = 0
    private var seconds: Int = 0

    constructor() {
        this.hours = 0
        this.minutes = 0
        this.seconds = 0
    }

    constructor(/*hours*/hours: Int,/*minutes*/ minutes: Int,/*seconds*/ seconds: Int) {
        setSeconds(seconds)
        setMinutes(minutes)
        setHours(hours)
    }

    //setters
    public fun setSeconds(seconds: Int) {
//        seconds calculation
        this.seconds += seconds % 60 /*only in range seconds*/
        setMinutes(seconds / 60 /*minutes over the range of seconds*/)
    }

    public fun setMinutes(minutes: Int) {
//        minutes calculation
        this.minutes += minutes % 60 /*only in range minutes*/
        setHours(minutes / 60 /*hours over the range of minutes*/)
    }

    public fun setHours(hours: Int) {
        this.hours += hours
    }

    //getters
    public fun getSeconds(): Int {
        return this.seconds
    }
    public fun getMinutes(): Int {
        return this.minutes
    }
    public fun getHours(): Int {
        return this.hours
    }

    public fun printTimeInFormat(){
        println("${getHours()}h:${getMinutes()}m: ${getSeconds()}s")
    }
}

fun main(){
    var flag = true
    var seconds: Int = 0
    var minutes: Int = 0
    var hours: Int = 0
    do {//input seconds
        try {
            print("enter no. of seconds: ")
            seconds = readLine()!!.toInt()
            if (seconds > -1)
                flag = false
            else
                println("you should enter +ve. no")
        }
        catch (e: NumberFormatException){
            println("you should enter Integer no.")
        }
    }while (flag)

    flag = true
    do {//input minutes
        try {
            print("enter no. of minutes: ")
            minutes = readLine()!!.toInt()
            if (minutes > -1)
                flag = false
            else
                println("you should enter +ve. no")
        }
        catch (e: NumberFormatException){
            println("you should enter Integer no.")
        }
    }while (flag)

    flag = true
    do {//input hours
        try {
            print("enter no. of hours: ")
            hours= readLine()!!.toInt()
            if (hours > -1)
                flag = false
            else
                println("you should enter +ve. no")
        }
        catch (e: NumberFormatException){
            println("you should enter Integer no.")
        }
    }while (flag)

    var time: Time = Time(hours, minutes, seconds)
    time.printTimeInFormat()

}