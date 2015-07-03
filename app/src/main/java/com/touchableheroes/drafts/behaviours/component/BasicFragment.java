package com.touchableheroes.drafts.behaviours.component;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.touchableheroes.drafts.Logger;
import com.touchableheroes.drafts.behaviours.AndroidUILifecycleBehavioursContainer;

/**
 * Created by asiebert on 19.06.15.
 */
public abstract class BasicFragment extends Fragment {

    private static final Logger LOGGER = Logger.create(BasicFragment.class);

    private final AndroidUILifecycleBehavioursContainer<Fragment> behaviours = new AndroidUILifecycleBehavioursContainer<Fragment>(this);

    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);

        LOGGER.debug("onCreate() called");

        onConfigBehaviours();

        behaviours.onCreate();
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        final View root = super.onCreateView(inflater, container, savedInstanceState);

        //final View root = inflater.inflate(
        //        getRootLayoutId(), container, false);

        return root;
    }

    protected abstract void onConfigBehaviours();


    public AndroidUILifecycleBehavioursContainer behaviours() {
        return this.behaviours;
    }

    @Override
    public void onPause() {
        super.onPause();

        behaviours.onPause();
    }


    @Override
    public void onResume() {
        super.onResume();

        behaviours.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
        behaviours.onStop();
    }
}
