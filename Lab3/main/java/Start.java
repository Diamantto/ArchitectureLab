import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Controller.chooseCreation();
    }

    public static class Controller {
        public static void chooseCreation() {
            System.out.println("Choose type of creation sentence:");
            System.out.println("1. Self-creation");
            System.out.println("2. Creation by Lorem");
            Scanner in = new Scanner(System.in);
            System.out.print("Input a number: ");
            int num = in.nextInt();
            if (num == 1) selfCreation();
            else if (num == 2) loremCreation();
            else System.out.println("Type correct number!");
        }

        public static void selfCreation() {
            System.out.println("Enter your sentence:");
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            WindowView view = new WindowView(new WindowText());
            System.out.println(view.show(str));
        }

        public static void loremCreation() {
            System.out.print("Input a number of words: ");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            WindowGenerator gen = new WindowGenerator();
            String str = gen.generate(num);
            WindowView view = new WindowView(new WindowText());
            System.out.println(view.show(str));
        }
    }
}
