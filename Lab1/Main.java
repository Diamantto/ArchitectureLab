import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Window defaultWindow = new Window(20, 20, 0, 0, Color.White);
        defaultWindow.setColor(Color.Blue);
        //System.out.println(defaultWindow);

        WindowText extendedWindow = new WindowText(100, 100, 10, 10, Color.Black, "Hey mum, i am rockstar", Color.White);
        //extendedWindow.openWindow();
        //System.out.println(extendedWindow);
        //extendedWindow.closeWindow();


//        // Рефлексия + анотация
//        for (Method method : extendedWindow.getClass().getDeclaredMethods()) {
//            if (method.isAnnotationPresent(MyAnnotation.class)) {
//                try {
//                    method.setAccessible(true);
//                    method.invoke(extendedWindow);
//                } catch (InvocationTargetException | IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        // Рефлексия по методам
//        for (Method method : extendedWindow.getClass().getMethods()) {
//            System.out.println(method.getName());
//            System.out.println(Modifier.toString(method.getModifiers()) + " ");
//            System.out.println("Parameter types:");
//            for (Class<?> t : method.getParameterTypes()) {
//                System.out.println(t.getName() + " ");
//            }
//            System.out.println("\n");
//        }
//
//        // СуперКлас
//        System.out.println("\n" + defaultWindow.getClass().getSuperclass().getName());

        MyInterface window = (MyInterface) WindowProxy.newProxyInstance(defaultWindow);
        try {
            window.setColor(Color.Violet);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(window.getColor());
        System.out.println(window.closeWindow());

    }
}
