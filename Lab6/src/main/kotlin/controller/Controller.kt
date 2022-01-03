package controller

import model.WindowGenerator
import view.WindowView
import javax.inject.Inject

class Controller {
    @Inject
    lateinit var receiver: Receiver
    @Inject
    lateinit var view: WindowView
    init {
        DaggerApplicationComponent.create().inject(this)
    }
    fun userInput() {
        var condition = true
        while (condition) {
            view.printStartMenu()
            when (readLine()) {
                "1" -> selfCreation()
                "2" -> loremCreation()
                "3" -> openWindow()
                "0" -> {
                    closeWindow()
                    condition = false
                }
                else -> view.printErrorMessage()
            }
        }
    }

    private fun closeWindow() {
        val invoker = Invoker(CommandFactory.getCommand("close", listOf(receiver)))
        invoker.execute()
    }

    private fun openWindow() {
        val invoker = Invoker(CommandFactory.getCommand("open", listOf(receiver)))
        invoker.execute()
    }

    private fun loremCreation() {
        view.printLoremCreation()
        val num = readLine()?.toInt()
        val str = num?.let { WindowGenerator.generate(it) }
        val invoker = Invoker(CommandFactory.getCommand("counter", listOf(receiver, str)))
        invoker.execute()
    }

    private fun selfCreation() {
        view.printSelfCreation()
        val str = readLine()
        val invoker = Invoker(CommandFactory.getCommand("counter", listOf(receiver, str)))
        invoker.execute()
    }
}