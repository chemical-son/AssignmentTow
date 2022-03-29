package Q2

import jdk.jfr.FlightRecorder

class Employee {
    private var id: Int
    private var firstName: String
    private var lastName: String
    private var salary: Float

    private companion object {
        var totalNum: Int = 0
    }

    constructor(id: Int, firstName: String, lastName: String, salary: Float){
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.salary = salary
        totalNum++
        println(totalNum)
    }
}

fun main(){
    var e = Employee(1, "Mustafa", "Hussain", 1500.0f)
    e = Employee(1, "Mustafa", "Hussain", 1500.0f)
    e = Employee(1, "Mustafa", "Hussain", 1500.0f)
    e = Employee(1, "Mustafa", "Hussain", 1500.0f)
    e = Employee(1, "Mustafa", "Hussain", 1500.0f)
}