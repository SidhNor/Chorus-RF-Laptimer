package app.andrey_voroshkov.chorus_laptimer.binding;

/**
 * Created by Gleb on 10/20/2017.
 */

import android.databinding.DataBindingComponent;
import android.support.v4.app.Fragment;

/**
 * A Data Binding Component implementation for fragments.
 */
public class FragmentDataBindingComponent implements DataBindingComponent {
    private final FragmentBindingAdapters adapter;

    public FragmentDataBindingComponent(Fragment fragment) {
        this.adapter = new FragmentBindingAdapters(fragment);
    }

}