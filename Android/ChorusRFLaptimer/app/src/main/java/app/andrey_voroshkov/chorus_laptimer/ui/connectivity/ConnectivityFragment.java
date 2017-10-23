package app.andrey_voroshkov.chorus_laptimer.ui.connectivity;

import android.arch.lifecycle.ViewModelProvider;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import app.andrey_voroshkov.chorus_laptimer.R;
import app.andrey_voroshkov.chorus_laptimer.binding.FragmentDataBindingComponent;
import app.andrey_voroshkov.chorus_laptimer.databinding.ConnectivityFragmentBinding;
import app.andrey_voroshkov.chorus_laptimer.di.Injectable;
import app.andrey_voroshkov.chorus_laptimer.ui.common.NavigationController;
import app.andrey_voroshkov.chorus_laptimer.util.AutoClearedValue;

/**
 * Created by Gleb on 10/20/2017.
 */

public class ConnectivityFragment extends Fragment implements Injectable {

    @Inject
    ViewModelProvider.Factory viewModelFactory;

    @Inject
    NavigationController navigationController;

    AutoClearedValue<ConnectivityFragmentBinding> binding;

    DataBindingComponent dataBindingComponent = new FragmentDataBindingComponent(this);

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ConnectivityFragmentBinding dataBinding = DataBindingUtil
                .inflate(inflater, R.layout.connectivity_fragment, container, false,
                        dataBindingComponent);
        binding = new AutoClearedValue<>(this, dataBinding);
        return dataBinding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
