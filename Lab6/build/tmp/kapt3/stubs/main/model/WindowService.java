package model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\nH\u0016R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lmodel/WindowService;", "Lmodel/Window;", "Lmodel/MyInterface;", "points", "Lmodel/Points;", "windowColor", "Lmodel/Color;", "status", "", "text", "", "textColor", "(Lmodel/Points;Lmodel/Color;ILjava/lang/String;Lmodel/Color;)V", "getText", "()Ljava/lang/String;", "getTextColor", "()Lmodel/Color;", "closeWindow", "", "openWindow", "toString", "wordsCounter", "userText", "Lab6"})
public final class WindowService extends model.Window implements model.MyInterface {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String text = null;
    @org.jetbrains.annotations.NotNull
    private final model.Color textColor = null;
    
    public WindowService(@org.jetbrains.annotations.NotNull
    model.Points points, @org.jetbrains.annotations.NotNull
    model.Color windowColor, int status, @org.jetbrains.annotations.NotNull
    java.lang.String text, @org.jetbrains.annotations.NotNull
    model.Color textColor) {
        super(null, null, 0);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final model.Color getTextColor() {
        return null;
    }
    
    @java.lang.Override
    public void wordsCounter(@org.jetbrains.annotations.NotNull
    java.lang.String userText) {
    }
    
    @java.lang.Override
    public void openWindow() {
    }
    
    @java.lang.Override
    public void closeWindow() {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
}