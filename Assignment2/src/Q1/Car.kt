package Q1

import jdk.swing.interop.SwingInterOpUtils

class Car {
    private val start = "start"
    private val off = "off"
    private var model: String
    private var seatsNo: Int
    private var averageSpeed: Int
    private var state: String = off

    constructor(model: String, seatsNo: Int, averageSpeed: Int){
        this.model = model
        this.seatsNo = seatsNo
        this.averageSpeed = averageSpeed
    }

    fun engineStart(){
        if (state == off){
            println("starting the engine")
            state = start
        }
        else
            println("the engine is running")
    }

    fun accelerating(){
        if (state == start)
            println("the car speed now is $averageSpeed")
        else
            println("the engine is off")
    }

    fun stop(){
        if (state == start)
            println("the car stopped")
        else
            println("the engine is off")
    }

    fun engineOff(){
        if (state == start)
            println("the engine is turned off")
        else
            println("the engine is off")
    }

}

fun main(){
    var car = Car("Renult", 5, 120)
    car.accelerating()
    car.stop()
    car.engineStart()
    car.accelerating()
    car.stop()
    car.engineOff()

}