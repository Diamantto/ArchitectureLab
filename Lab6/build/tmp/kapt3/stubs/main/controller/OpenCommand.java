package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcontroller/OpenCommand;", "Lcontroller/Command;", "receiver", "Lcontroller/Receiver;", "(Lcontroller/Receiver;)V", "getReceiver", "()Lcontroller/Receiver;", "execute", "", "Lab6"})
public final class OpenCommand implements controller.Command {
    @org.jetbrains.annotations.NotNull
    private final controller.Receiver receiver = null;
    
    public OpenCommand(@org.jetbrains.annotations.NotNull
    controller.Receiver receiver) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final controller.Receiver getReceiver() {
        return null;
    }
    
    @java.lang.Override
    public void execute() {
    }
}