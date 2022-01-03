package controller;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import view.WindowView;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideWindowViewFactory implements Factory<WindowView> {
  private final AppModule module;

  public AppModule_ProvideWindowViewFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public WindowView get() {
    return provideWindowView(module);
  }

  public static AppModule_ProvideWindowViewFactory create(AppModule module) {
    return new AppModule_ProvideWindowViewFactory(module);
  }

  public static WindowView provideWindowView(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideWindowView());
  }
}
