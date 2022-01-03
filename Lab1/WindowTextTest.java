import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindowTextTest {

    @Test
    void getText() {
        WindowText testWindow = new WindowText(0, 0, 0, 0, Color.Blue, "Hello", Color.White);
        assertEquals("Hello", testWindow.getText());
    }

    @Test
    void setText() {
        WindowText testWindow = new WindowText(0, 0, 0, 0, Color.Blue, "Hello", Color.White);
        String testString = "Bye bye";
        testWindow.setText(testString);
        assertEquals(testString, testWindow.getText());
    }

    @Test
    void getTextColor() {
        WindowText testWindow = new WindowText(0, 0, 0, 0, Color.Blue, "Hello", Color.White);
        assertEquals(Color.White, testWindow.getTextColor());
    }

    @Test
    void setTextColor() {
        WindowText testWindow = new WindowText(0, 0, 0, 0, Color.Blue, "Hello", Color.White);
        Color testColor = Color.Yellow;
        testWindow.setTextColor(testColor);
        assertEquals(testColor, testWindow.getTextColor());
    }

    @Test
    void closeWindow() {
        WindowText testWindow = new WindowText(0, 0, 0, 0, Color.Blue, "Hello", Color.White);
        int testStatus = 0;
        assertEquals(testStatus, testWindow.closeWindow());
    }

    @Test
    void openWindow() {
        WindowText testWindow = new WindowText(0, 0, 0, 0, Color.Blue, "Hello", Color.White);
        int testStatus = 1;
        assertEquals(testStatus, testWindow.openWindow());
    }
}