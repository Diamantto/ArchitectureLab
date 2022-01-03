package controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcontroller/AppModule;", "", "()V", "provideReceiver", "Lcontroller/Receiver;", "win", "Lmodel/WindowService;", "provideWindowService", "provideWindowView", "Lview/WindowView;", "Lab6"})
@dagger.Module
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final controller.Receiver provideReceiver(@org.jetbrains.annotations.NotNull
    model.WindowService win) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final model.WindowService provideWindowService() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Provides
    public final view.WindowView provideWindowView() {
        return null;
    }
}