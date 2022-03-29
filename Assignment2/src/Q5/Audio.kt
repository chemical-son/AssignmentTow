package Q5

class Audio : Publication{
    private var audio: Float
    constructor(){
        audio = 0.0f
    }
    constructor(audio: Float){
        this.audio = audio
    }

    //setters
    fun setAudioDuration(audio: Float){
        this.audio = audio
    }
    //getters
    fun getAudioDuration(): Float {
        return audio
    }

    fun printBookData(){
        println("Book Title: ${getTitle()}, Book price: ${getPrice()}, Book has ${getAudioDuration()} Duration Minutes.")
    }
}