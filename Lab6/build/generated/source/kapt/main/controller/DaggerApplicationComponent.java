package controller;

import dagger.internal.DaggerGenerated;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerApplicationComponent implements ApplicationComponent {
  private final AppModule appModule;

  private final DaggerApplicationComponent applicationComponent = this;

  private DaggerApplicationComponent(AppModule appModuleParam) {
    this.appModule = appModuleParam;

  }

  public static Builder builder() {
    return new Builder();
  }

  public static ApplicationComponent create() {
    return new Builder().build();
  }

  private Receiver receiver() {
    return AppModule_ProvideReceiverFactory.provideReceiver(appModule, AppModule_ProvideWindowServiceFactory.provideWindowService(appModule));
  }

  @Override
  public void inject(Controller controller) {
    injectController(controller);
  }

  private Controller injectController(Controller instance) {
    Controller_MembersInjector.injectReceiver(instance, receiver());
    Controller_MembersInjector.injectView(instance, AppModule_ProvideWindowViewFactory.provideWindowView(appModule));
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public ApplicationComponent build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      return new DaggerApplicationComponent(appModule);
    }
  }
}
