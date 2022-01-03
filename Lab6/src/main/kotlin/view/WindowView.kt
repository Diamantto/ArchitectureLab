package view

class WindowView {
    fun printStartMenu() {
        println("\nEnter a number to do a command:")
        println("1. Create sentence by yourself")
        println("2. Create sentence by Lorem")
        println("3. Open window and show its properties")
        println("0. Close window")
        print("\nInput a number: ")
    }

    fun printErrorMessage() {
        println("Type correct number!")
    }

    fun printSelfCreation() {
        println("Enter you sentence")
    }

    fun printLoremCreation() {
        print("Input a number of words: ")
    }
}