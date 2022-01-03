package model

class WindowService(
    points: Points,
    windowColor: Color,
    status: Int,
    val text: String,
    val textColor: Color
) : Window(points, windowColor, status), MyInterface {

    override fun wordsCounter(userText: String) {
        val words = userText.split(" ")
        println("Your sentence: $userText")
        println("Words count: ${words.size}")
    }

    override fun openWindow() {
        super.openWindow()
        println("Window status is $status")
    }

    override fun closeWindow() {
        super.closeWindow()
        println("Window status is $status")
    }

    override fun toString(): String {
        return "WindowService(text='$text', textColor=$textColor)"
    }
}