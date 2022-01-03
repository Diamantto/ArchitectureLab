package window.view;

public class WindowView {
    public void printStartMenu() {
        System.out.println("\nEnter a number to do a command:");
        System.out.println("1. Create sentence by yourself");
        System.out.println("2. Create sentence by Lorem");
        System.out.println("3. Open window and show its properties");
        System.out.println("4. Proxy example");
        System.out.println("0. Close window");
        System.out.print("\nInput a number: ");
    }

    public void printErrorMessage() {
        System.out.println("Type correct number!");
    }

    public void printSelfCreation() {
        System.out.println("Enter you sentence");
    }

    public void printLoremCreation() {
        System.out.print("Input a number of words: ");
    }

}
