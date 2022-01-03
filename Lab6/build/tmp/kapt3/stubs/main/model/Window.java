package model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lmodel/Window;", "Lmodel/MyInterface;", "points", "Lmodel/Points;", "windowColor", "Lmodel/Color;", "status", "", "(Lmodel/Points;Lmodel/Color;I)V", "getPoints", "()Lmodel/Points;", "getStatus", "()I", "setStatus", "(I)V", "getWindowColor", "()Lmodel/Color;", "closeWindow", "", "openWindow", "Lab6"})
public abstract class Window implements model.MyInterface {
    @org.jetbrains.annotations.NotNull
    private final model.Points points = null;
    @org.jetbrains.annotations.NotNull
    private final model.Color windowColor = null;
    private int status;
    
    public Window(@org.jetbrains.annotations.NotNull
    model.Points points, @org.jetbrains.annotations.NotNull
    model.Color windowColor, int status) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final model.Points getPoints() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final model.Color getWindowColor() {
        return null;
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @java.lang.Override
    public void openWindow() {
    }
    
    @java.lang.Override
    public void closeWindow() {
    }
}