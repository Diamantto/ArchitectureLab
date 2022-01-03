package window.controller;

public class OpenCommand implements Command {
    private Receiver receiver;

    public OpenCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.openWindow();
    }
}
