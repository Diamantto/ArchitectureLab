import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTest {

    @Test
    void setColor() {
        Window testWindow = new Window(20, 20, 0, 0, Color.White);
        Color color = Color.Brown;
        testWindow.setColor(color);
        assertEquals(color, testWindow.getColor());
    }

    @Test
    void getColor() {
        Window testWindow = new Window(20, 20, 30, 40, Color.White);
        assertEquals(Color.White, testWindow.getColor());
    }

    @Test
    void openWindow() {
        Window testWindow = new Window();
        int testStatus = 1;
        assertEquals(testStatus, testWindow.openWindow());
    }

    @Test
    void closeWindow() {
        Window testWindow = new Window();
        int testStatus = 0;
        assertEquals(testStatus, testWindow.closeWindow());
    }

    @Test
    void getLeft() {
        Window testWindow = new Window(20, 20, 0, 0, Color.White);
        assertEquals(20, testWindow.getLeft());
    }

    @Test
    void setLeft() {
        Window testWindow = new Window(20, 20, 30, 40, Color.White);
        int newLeftValue = 50;
        testWindow.setLeft(newLeftValue);
        assertEquals(newLeftValue, testWindow.getLeft());
    }

    @Test
    void getTop() {
        Window testWindow = new Window(20, 20, 30, 40, Color.White);
        assertEquals(20, testWindow.getTop());
    }

    @Test
    void setTop() {
        Window testWindow = new Window(20, 20, 30, 40, Color.White);
        int newTopValue = 50;
        testWindow.setTop(newTopValue);
        assertEquals(newTopValue, testWindow.getTop());
    }

    @Test
    void getRight() {
        Window testWindow = new Window(20, 20, 30, 40, Color.White);
        assertEquals(30, testWindow.getRight());
    }

    @Test
    void setRight() {
        Window testWindow = new Window(20, 20, 30, 40, Color.White);
        int newRightValue = 50;
        testWindow.setRight(newRightValue);
        assertEquals(newRightValue, testWindow.getRight());
    }

    @Test
    void getBottom() {
        Window testWindow = new Window(20, 20, 30, 40, Color.White);
        assertEquals(40, testWindow.getBottom());
    }

    @Test
    void setBottom() {
        Window testWindow = new Window(20, 20, 30, 40, Color.White);
        int newBottomValue = 50;
        testWindow.setBottom(newBottomValue);
        assertEquals(newBottomValue, testWindow.getBottom());
    }
}