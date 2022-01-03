package window.controller;

public class CounterCommand implements Command {
    private Receiver receiver;
    private String userText;

    public CounterCommand(Receiver receiver, String userText) {
        this.receiver = receiver;
        this.userText = userText;
    }

    @Override
    public void execute() {
        this.receiver.wordsCounter(userText);
    }
}
