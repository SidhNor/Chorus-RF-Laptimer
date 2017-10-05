package app.andrey_voroshkov.chorus_laptimer.di;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import app.andrey_voroshkov.chorus_laptimer.AppPreferences;
import app.andrey_voroshkov.chorus_laptimer.ChorusApp;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Gleb on 10/5/2017.
 */

@Module(includes = ViewModelModule.class)
class AppModule {

    @Provides @Singleton
    AppPreferences providesAppPreferences(SharedPreferences preferences) {
        return new AppPreferences(preferences);
    }

    @Provides @Singleton
    SharedPreferences providePrefs(Application application) {
        return application.getSharedPreferences(ChorusApp.class.getName(), Context.MODE_PRIVATE);
    }
}
