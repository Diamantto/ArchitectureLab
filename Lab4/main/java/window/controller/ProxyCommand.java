package window.controller;

import window.model.Color;

public class ProxyCommand implements Command {
    private Receiver receiver;
    private Color color;

    public ProxyCommand(Receiver receiver, Color color) {
        this.receiver = receiver;
        this.color = color;
    }

    @Override
    public void execute() {
        this.receiver.setWindowColor(color);
    }
}