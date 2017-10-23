package app.andrey_voroshkov.chorus_laptimer.binding;

/**
 * Created by Gleb on 10/20/2017.
 */

import android.support.v4.app.Fragment;

import javax.inject.Inject;

/**
 * Binding adapters that work with a fragment instance.
 */
public class FragmentBindingAdapters {
    final Fragment fragment;

    @Inject
    public FragmentBindingAdapters(Fragment fragment) {
        this.fragment = fragment;
    }
}