package Q5

class Book : Publication{
    private var noOfPages: Int
    constructor(){
        noOfPages = 0
    }
    constructor(noOfPages: Int){
        this.noOfPages = noOfPages
    }

    //setters
    fun setNoOfPages(noOfPages: Int){
        this.noOfPages = noOfPages
    }
    //getters
    fun getNoOfPages(): Int {
        return noOfPages
    }

    fun printBookData(){
        println("Book Title: ${getTitle()}, Book price: ${getPrice()}, Book has ${getNoOfPages()} pages")
    }
}