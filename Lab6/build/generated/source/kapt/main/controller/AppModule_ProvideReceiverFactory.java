package controller;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import model.WindowService;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideReceiverFactory implements Factory<Receiver> {
  private final AppModule module;

  private final Provider<WindowService> winProvider;

  public AppModule_ProvideReceiverFactory(AppModule module, Provider<WindowService> winProvider) {
    this.module = module;
    this.winProvider = winProvider;
  }

  @Override
  public Receiver get() {
    return provideReceiver(module, winProvider.get());
  }

  public static AppModule_ProvideReceiverFactory create(AppModule module,
      Provider<WindowService> winProvider) {
    return new AppModule_ProvideReceiverFactory(module, winProvider);
  }

  public static Receiver provideReceiver(AppModule instance, WindowService win) {
    return Preconditions.checkNotNullFromProvides(instance.provideReceiver(win));
  }
}
