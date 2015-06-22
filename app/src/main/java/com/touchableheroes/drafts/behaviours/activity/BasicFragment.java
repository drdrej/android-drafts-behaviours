package com.touchableheroes.drafts.behaviours.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.touchableheroes.drafts.Logger;
import com.touchableheroes.drafts.behaviours.AndroidUILifecycleContainer;

/**
 * Created by asiebert on 19.06.15.
 */
public abstract class BasicFragment extends Fragment {

    private static final Logger LOGGER = Logger.create(BasicFragment.class);

    private final AndroidUILifecycleContainer<Fragment> behaviours = new AndroidUILifecycleContainer<Fragment>(this);

    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);

        LOGGER.debug("onCreate() called");

        onConfigBehaviours();

        behaviours.onCreate();
    }

    abstract void onConfigBehaviours();


    public AndroidUILifecycleContainer behaviours() {
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
