import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WindowViewTest {
    @Test
    void test() {
        WindowGenerator testGen = Mockito.mock(WindowGenerator.class);
        Mockito.when(testGen.generate(10)).thenReturn("ridiculus a congue lobortis tortor arcu anteetiam justo turpis anteetiam");
        Mockito.when(testGen.generate(-5)).thenReturn("error...");

        var textObj = Mockito.spy(WindowText.class);
        Mockito.when(textObj.wordsCounter("Hello there, i am Shrek")).thenReturn(5);
        Mockito.when(textObj.wordsCounter("")).thenReturn(0);

        WindowView viewObj = new WindowView(textObj);
        assertEquals(10, viewObj.show(testGen.generate(10)));

        viewObj = new WindowView(textObj);
        assertEquals(-1, viewObj.show(testGen.generate(-5)));

        Mockito.verify(testGen, Mockito.atLeastOnce()).generate(Mockito.anyInt());
        Mockito.verify(textObj, Mockito.atLeastOnce()).wordsCounter(Mockito.anyString());
        Mockito.verify(textObj, Mockito.never()).wordsCounter("");
    }
}