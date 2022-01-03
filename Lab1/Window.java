import java.util.Objects;

public class Window implements MyInterface {
    protected double left;
    protected double top;
    protected double right;
    protected double bottom;
    protected Color color;
    protected int Status;

    Window(double left, double top, double right, double bottom, Color color) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.color = color;
    }

    Window() {
        left = top = right = bottom = 0;
        color = Color.Black;
        Status = 0;
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


    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Window{" +
                "left=" + left +
                ", top=" + top +
                ", right=" + right +
                ", bottom=" + bottom +
                ", color='" + color + '\'' +
                '}';
    }

    @MyAnnotation
    public int openWindow() {
        System.out.println("\n" + "Successfully opened the window");
         return Status = 1;
    }

    @MyAnnotation
    @Override
    public int closeWindow() {
        System.out.println("\n" + "Successfully closed the window");
        return Status = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Double.compare(window.left, left) == 0 && Double.compare(window.top, top) == 0 && Double.compare(window.right, right) == 0 && Double.compare(window.bottom, bottom) == 0 && Objects.equals(color, window.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, top, right, bottom, color);
    }
}
