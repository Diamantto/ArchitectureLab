package controller

class CounterCommand(val receiver: Receiver, val userText: String): Command {
    override fun execute() {
        receiver.wordsCounter(userText)
    }
}