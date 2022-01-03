package controller

class CloseCommand(val receiver: Receiver): Command {
    override fun execute() {
        receiver.closeWindow()
    }

}