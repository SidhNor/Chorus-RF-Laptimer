package app.andrey_voroshkov.chorus_laptimer;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import app.andrey_voroshkov.chorus_laptimer.di.AppInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Gleb on 10/5/2017.
 */

public class ChorusApp extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        AppInjector.init(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
