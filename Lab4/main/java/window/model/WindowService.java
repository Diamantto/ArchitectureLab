package window.model;

import java.util.Objects;

public class WindowService extends Window implements MyInterface {
    protected String text;
    protected Color textColor;

    public WindowService() {
        super();
        text = "";
        textColor = Color.White;
    }

    public WindowService(double left, double top, double right, double bottom, Color windowColor, String text, Color textColor) {
        super(left, top, right, bottom, windowColor);
        this.text = text;
        this.textColor = textColor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Color getTextColor() {
        return textColor;
    }

    public void setTextColor(Color textColor) {
        this.textColor = textColor;
    }

    @Override
    public void wordsCounter(String userText) {
        String[] words = userText.split(" ");
        System.out.println("Your sentence: " + userText);
        System.out.println("Words count: " + words.length);
    }

    @Override
    public void openWindow() {
        status = 1;
        System.out.println("Successfully opened the window");
        System.out.println("Window status is " + status);
    }

    @Override
    public void closeWindow() {
        status = 0;
        System.out.println("\n" + "Successfully closed the window");
        System.out.println("Window status is " + status);
    }

    @Override
    public String toString() {
        return "WindowService{" +
                "left=" + left +
                ", top=" + top +
                ", right=" + right +
                ", bottom=" + bottom +
                ", status=" + status +
                ", color='" + windowColor + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WindowService that = (WindowService) o;
        return Objects.equals(text, that.text) && Objects.equals(textColor, that.textColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text, textColor);
    }
}
