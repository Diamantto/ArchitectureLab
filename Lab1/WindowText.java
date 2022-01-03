import java.util.Objects;

public class WindowText extends Window {
    protected String text;
    protected Color textColor;

    public WindowText(double left, double top, double right, double bottom, Color color, String text, Color textColor) {
        super(left, top, right, bottom, color);
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



    @MyAnnotation
    public int closeWindow() {
        super.closeWindow();
        return Status;
    }


    @Override
    @MyAnnotation
    public int openWindow() {
        super.openWindow();
        System.out.println(text + "\n");
        return Status = 1;
    }

    @Override
    public String toString() {
        return "WindowText{" +
                "left=" + left +
                ", top=" + top +
                ", right=" + right +
                ", bottom=" + bottom +
                ", color='" + color + '\'' +
                ", text='" + text + '\'' +
                ", textColor='" + textColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WindowText that = (WindowText) o;
        return Objects.equals(text, that.text) && Objects.equals(textColor, that.textColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), text, textColor);
    }
}
