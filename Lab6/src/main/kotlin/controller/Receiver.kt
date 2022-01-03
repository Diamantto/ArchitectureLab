package controller

import model.MyInterface
import model.WindowService
import kotlin.system.exitProcess

class Receiver(val win: WindowService): MyInterface {
    override fun closeWindow() {
        win.closeWindow()
        exitProcess(0)
    }

    override fun openWindow() {
        win.openWindow()
        println(win)
    }

    override fun wordsCounter(userText: String) {
        win.wordsCounter(userText)
    }
}