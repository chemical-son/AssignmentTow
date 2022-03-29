package Q5
fun main() {
    var flag: Boolean = true
    var book: Book = Book()
    var audioBook: Audio = Audio()

    println("enter data of Readable Book")
    print("enter Book name: ")
    book.setTitle(readln())

    do {//input Book no. of pages
        try {
            print("enter Book no. of pages: ")
            book.setNoOfPages(readln().toInt())
            if (book.getNoOfPages() > 0)
                flag = false
            else
                println("you should enter +ve. no")
        }
        catch (e: NumberFormatException){
            println("you should enter Integer no.")
        }
    }while (flag)

    flag = true
    do {//input Book price
        try {
            print("enter Book price: ")
            book.setPrice(readln().toFloat())
            if (book.getPrice() > -1)
                flag = false
            else
                println("you should enter +ve. no")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no.")
        }
    }while (flag)


    println("enter data of Audio Book")
    print("enter Book name: ")
    audioBook.setTitle(readln())

    flag = true
    do {//input Book Audio Duration
        try {
            print("enter Book Audio Duration: ")
            audioBook.setAudioDuration(readln().toFloat())
            if (audioBook.getAudioDuration() > 0.0)
                flag = false
            else
                println("you should enter +ve. no of minutes")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no. of minutes")
        }
    }while (flag)

    flag = true
    do {//input Book price
        try {
            print("enter Book price: ")
            audioBook.setPrice(readln().toFloat())
            if (audioBook.getPrice() > -1)
                flag = false
            else
                println("you should enter +ve. no")
        }
        catch (e: NumberFormatException){
            println("you should enter Float no.")
        }
    }while (flag)

    println("your Input dat is")
    println("For Readable book")
    book.printBookData()
    println("For Audio book")
    audioBook.printBookData()

}