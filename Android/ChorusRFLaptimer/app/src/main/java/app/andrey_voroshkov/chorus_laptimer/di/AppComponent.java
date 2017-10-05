package app.andrey_voroshkov.chorus_laptimer.di;

import android.app.Application;

import javax.inject.Singleton;

import app.andrey_voroshkov.chorus_laptimer.ChorusApp;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by Gleb on 10/5/2017.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class
})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
    void inject(ChorusApp application);
}