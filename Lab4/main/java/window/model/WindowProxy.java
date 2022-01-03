package window.model;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WindowProxy implements InvocationHandler {
    private final WindowService window;

    public WindowProxy(WindowService window) {
        this.window = window;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        if( name.startsWith("get") ){
            return null;
        }
        else if( name.startsWith("set") ){
            throw new Exception();
        }
        else{
            return method.invoke(window, args);
        }
    }

    public static Object newProxyInstance(WindowService obj) {
        return java.lang.reflect.Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new WindowProxy(obj));
    }
}