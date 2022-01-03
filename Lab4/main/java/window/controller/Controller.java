package window.controller;

import window.model.*;
import window.view.WindowView;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private WindowService model;
    private WindowView view;

    public Controller(WindowService model, WindowView view) {
        this.model = model;
        this.view = view;
    }

    public void userInput() {
        boolean condition = true;
        while (condition) {
            view.printStartMenu();
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            Receiver receiver = new Receiver(model);
            if (num == 1) selfCreation(receiver);
            else if (num == 2) loremCreation(receiver);
            else if (num == 3) openWindow(receiver);
            else if (num == 4) proxyExample(receiver);
            else if (num == 0) {
                closeWindow(receiver);
                condition = false;
            } else view.printErrorMessage();
        }
    }

    public void proxyExample(Receiver rec) {
        Invoker inv = new Invoker(CommandFactory.getCommand("proxy", Arrays.asList(rec, Color.Blue)));
        inv.execute();
    }

    public void selfCreation(Receiver rec) {
        view.printSelfCreation();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Invoker inv = new Invoker(CommandFactory.getCommand("counter", Arrays.asList(rec, str)));
        inv.execute();
    }

    public void loremCreation(Receiver rec) {
        view.printLoremCreation();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        WindowGenerator gen = WindowGenerator.getInstance();
        String str = gen.generate(num);
        Invoker inv = new Invoker(CommandFactory.getCommand("counter", Arrays.asList(rec, str)));
        inv.execute();
    }

    public void openWindow(Receiver rec) {
        Invoker inv = new Invoker(CommandFactory.getCommand("open", List.of(rec)));
        inv.execute();
    }

    public void closeWindow(Receiver rec) {
        Invoker inv = new Invoker(CommandFactory.getCommand("close", List.of(rec)));
        inv.execute();
    }

}
