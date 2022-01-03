package controller

import java.lang.IllegalArgumentException

object CommandFactory {
    fun getCommand(com: String, list: List<Any?>): Command {
        val rec: Receiver = list[0] as Receiver
        return when (com){
            "close" -> CloseCommand(rec)
            "open" -> OpenCommand(rec)
            "counter" -> CounterCommand(rec, list[1] as String)
            else -> throw IllegalArgumentException()
        }
    }
}