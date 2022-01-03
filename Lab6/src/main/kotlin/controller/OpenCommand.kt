package controller

class OpenCommand(val receiver: Receiver): Command {
    override fun execute() {
        receiver.openWindow()
    }
}