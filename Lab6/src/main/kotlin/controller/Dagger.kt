package controller

import dagger.Component
import dagger.Module
import dagger.Provides
import model.Color
import model.Points
import model.WindowService
import view.WindowView

@Component(modules = [AppModule::class])
interface ApplicationComponent {
    fun inject(controller: Controller)
}

@Module
class AppModule {
    @Provides
    fun provideReceiver(win: WindowService) = Receiver(win)

    @Provides
    fun provideWindowService(): WindowService {
        return WindowService(Points(0, 0, 0, 0,), Color.White, 0, "Kotlin with Dagger time", Color.Black)
    }

    @Provides
    fun provideWindowView() = WindowView()
}