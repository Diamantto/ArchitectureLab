package controller;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
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
public final class AppModule_ProvideWindowServiceFactory implements Factory<WindowService> {
  private final AppModule module;

  public AppModule_ProvideWindowServiceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public WindowService get() {
    return provideWindowService(module);
  }

  public static AppModule_ProvideWindowServiceFactory create(AppModule module) {
    return new AppModule_ProvideWindowServiceFactory(module);
  }

  public static WindowService provideWindowService(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideWindowService());
  }
}
