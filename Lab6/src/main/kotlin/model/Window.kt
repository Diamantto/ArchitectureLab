package model

abstract class Window(
    val points: Points,
    val windowColor: Color,
    var status: Int
) : MyInterface {

    override fun openWindow() {
        println("\nSuccessfully opened the window")
        status = 1
    }

    override fun closeWindow() {
        println("\nSuccessfully closed the window")
        status = 0
    }
}