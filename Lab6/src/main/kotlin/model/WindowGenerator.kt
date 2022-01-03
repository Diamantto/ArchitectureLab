package model

import com.thedeanda.lorem.LoremIpsum

object WindowGenerator {
    fun generate(count: Int): String {
        if (count > 0) {
            return LoremIpsum.getInstance().getWords(count)
        } else return "error..."
    }
}