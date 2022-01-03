package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcontroller/CounterCommand;", "Lcontroller/Command;", "receiver", "Lcontroller/Receiver;", "userText", "", "(Lcontroller/Receiver;Ljava/lang/String;)V", "getReceiver", "()Lcontroller/Receiver;", "getUserText", "()Ljava/lang/String;", "execute", "", "Lab6"})
public final class CounterCommand implements controller.Command {
    @org.jetbrains.annotations.NotNull
    private final controller.Receiver receiver = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userText = null;
    
    public CounterCommand(@org.jetbrains.annotations.NotNull
    controller.Receiver receiver, @org.jetbrains.annotations.NotNull
    java.lang.String userText) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final controller.Receiver getReceiver() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserText() {
        return null;
    }
    
    @java.lang.Override
    public void execute() {
    }
}