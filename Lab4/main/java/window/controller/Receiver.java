package window.controller;

import window.model.Color;
import window.model.MyInterface;
import window.model.WindowProxy;
import window.model.WindowService;

public class Receiver implements MyInterface {
    private WindowService win;

    public Receiver(WindowService win) {
        this.win = win;
    }

    @Override
    public void openWindow() {
        win.openWindow();
        System.out.println(win);
    }

    @Override
    public void wordsCounter(String userText) {
        win.wordsCounter(userText);
    }

    @Override
    public void setWindowColor(Color color) {
        MyInterface window = (MyInterface) WindowProxy.newProxyInstance(win);
        try {
            window.setWindowColor(Color.Violet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void closeWindow() {
        win.closeWindow();
        System.exit(0);
    }
}
