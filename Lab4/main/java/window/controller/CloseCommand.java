package window.controller;


public class CloseCommand implements Command {
    private Receiver receiver;

    public CloseCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.closeWindow();
    }
}
