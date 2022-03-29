package Q5

open class Publication {
    private var title: String
    private var price: Float
    constructor(){
        title = ""
        price = 0.0f
    }
    constructor(title: String, price: Float){
        this.title = title
        this.price = price
    }

    //setters
    fun setTitle(title: String){
        this.title = title
    }
    fun setPrice(price: Float){
        this.price = price
    }
    //getters
    fun getTitle(): String {
        return title
    }
    fun getPrice(): Float {
        return price
    }
}