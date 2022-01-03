package controller;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
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
public final class Controller_MembersInjector implements MembersInjector<Controller> {
  private final Provider<Receiver> receiverProvider;

  private final Provider<WindowView> viewProvider;

  public Controller_MembersInjector(Provider<Receiver> receiverProvider,
      Provider<WindowView> viewProvider) {
    this.receiverProvider = receiverProvider;
    this.viewProvider = viewProvider;
  }

  public static MembersInjector<Controller> create(Provider<Receiver> receiverProvider,
      Provider<WindowView> viewProvider) {
    return new Controller_MembersInjector(receiverProvider, viewProvider);
  }

  @Override
  public void injectMembers(Controller instance) {
    injectReceiver(instance, receiverProvider.get());
    injectView(instance, viewProvider.get());
  }

  @InjectedFieldSignature("controller.Controller.receiver")
  public static void injectReceiver(Controller instance, Receiver receiver) {
    instance.receiver = receiver;
  }

  @InjectedFieldSignature("controller.Controller.view")
  public static void injectView(Controller instance, WindowView view) {
    instance.view = view;
  }
}
