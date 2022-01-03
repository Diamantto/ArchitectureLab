import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.*;

class WindowProxyTest {

    @Test
    void invoke() {
        Window defaultWindow = new Window(20, 20, 0, 0, Color.White);
        MyInterface window = (MyInterface) Proxy.newProxyInstance(defaultWindow.getClass().getClassLoader(), defaultWindow.getClass().getInterfaces(), new WindowProxy(defaultWindow));
        window.setColor(Color.Violet);
    }
}