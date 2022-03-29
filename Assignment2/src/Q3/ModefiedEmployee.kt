package Q3

import Q2.Employee
import jdk.jfr.FlightRecorder
import jdk.jfr.Name

class ModefiedEmployee {
    private var id: Int
    private var firstName: String
    private var lastName: String
    private var salary: Float

    private companion object {
        var totalNum: Int = 0
    }


    constructor(){
        this.id = totalNum
        this.firstName = ""
        this.lastName = ""
        this.salary = 0.0f
        totalNum++
    }
    constructor(id: Int, firstName: String, lastName: String, salary: Float){
        this.id = id
        this.firstName = firstName
        this.lastName = lastName
        this.salary = salary
        totalNum++
    }

    //setters
    fun setId(id: Int){
        this.id = id
    }
    fun setFirstName(firstName: String){
        this.firstName = firstName
    }
    fun setLastName(lastName: String){
        this.lastName = lastName
    }
    fun setSalary(salary: Float){
        this.salary = salary
    }

    //getters
    fun getId(): Int {
        return id
    }
    fun getFirstName(): String {
        return firstName
    }
    fun getLastName(): String {
        return lastName
    }
    fun getSalary(): Float {
        return salary
    }

    //calculate salary + bonus
    fun bonus(): Double {
        return 1.05 * salary
    }
}

fun main(){

    var e: ModefiedEmployee = ModefiedEmployee()
    e.setId(1)
    e.setFirstName("Mustafa")
    e.setLastName("Hussain")
    e.setSalary(3000.0f)
    println("Name: ${e.getFirstName()} ${e.getLastName()} hava salary: ${e.getSalary()} and salary with bonus: ${e.bonus()}")

}