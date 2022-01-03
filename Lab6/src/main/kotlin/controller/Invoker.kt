package controller

class Invoker(private val command: Command) {
    fun execute() {
        command.execute()
    }
}