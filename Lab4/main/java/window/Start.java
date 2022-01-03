package window;

import window.controller.Controller;
import window.model.Color;
import window.model.WindowService;
import window.view.WindowView;

public class Start {
    public static void main(String[] args) {
        WindowService model = new WindowService(10, 20, 20, 10, Color.White, "Okay, google: GoF patterns", Color.Black);
        WindowView view = new WindowView();
        Controller controller = new Controller(model, view);
        controller.userInput();
    }
}


// Singleton, Strategy, Command, Proxy, Fabric Method
