package app.andrey_voroshkov.chorus_laptimer.ui.common;

import android.support.v4.app.FragmentManager;

import javax.inject.Inject;

import app.andrey_voroshkov.chorus_laptimer.NMainActivity;
import app.andrey_voroshkov.chorus_laptimer.R;
import app.andrey_voroshkov.chorus_laptimer.ui.connectivity.ConnectivityFragment;

/**
 * Created by Gleb on 10/20/2017.
 */

public class NavigationController {
    private final int containerId;
    private final FragmentManager fragmentManager;

    @Inject
    public NavigationController(NMainActivity mainActivity) {
        this.containerId = R.id.container;
        this.fragmentManager = mainActivity.getSupportFragmentManager();
    }

    public void navigateToTransportSelection() {
        ConnectivityFragment connectivityFragment = new ConnectivityFragment();
        fragmentManager.beginTransaction()
                .replace(containerId, connectivityFragment)
                .commitAllowingStateLoss();
    }
}

