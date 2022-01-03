package window.controller;

import window.model.Color;

import java.util.List;

public class CommandFactory {
    public static Command getCommand(String com, List<Object> list) {
        Receiver rec = (Receiver) list.get(0);
        if (com.startsWith("close")) return new CloseCommand(rec);
        else if (com.startsWith("open")) return new OpenCommand(rec);
        else if (com.startsWith("counter")) return new CounterCommand(rec, (String) list.get(1));
        else if (com.startsWith("proxy")) return new ProxyCommand(rec, (Color) list.get(1));
        return null;
    }
}
