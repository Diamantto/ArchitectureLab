package window.model;

import java.util.Objects;

public abstract class Window implements MyInterface {
    protected double left;
    protected double top;
    protected double right;
    protected double bottom;
    protected Color windowColor;
    protected int status;

    Window(double left, double top, double right, double bottom, Color color) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.windowColor = color;
    }

    Window() {
        left = top = right = bottom = 0;
        windowColor = Color.Black;
        status = 0;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getTop() {
        return top;
    }

    public void setTop(double top) {
        this.top = top;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public Color getWindowColor() {
        return windowColor;
    }

    @Override
    public void setWindowColor(Color windowColor) {
        this.windowColor = windowColor;
    }

    @Override
    public String toString() {
        return "Window{" +
                "left=" + left +
                ", top=" + top +
                ", right=" + right +
                ", bottom=" + bottom +
                ", color='" + windowColor + '\'' +
                '}';
    }

    public void openWindow() {
        System.out.println("\n" + "Successfully opened the window");
        status = 1;
    }

    @Override
    public void closeWindow() {
        System.out.println("\n" + "Successfully closed the window");
        status = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Double.compare(window.left, left) == 0 && Double.compare(window.top, top) == 0 && Double.compare(window.right, right) == 0 && Double.compare(window.bottom, bottom) == 0 && Objects.equals(windowColor, window.windowColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, top, right, bottom, windowColor);
    }
}