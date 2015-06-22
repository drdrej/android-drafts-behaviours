package com.touchableheroes.drafts.behaviours;

import android.app.Activity;

import com.touchableheroes.drafts.behaviours.lifecycle.IActivityLifecycle;

/**
 * Created by asiebert on 15.12.14.
 */
@Deprecated
public class ActivityBehavioursContainer
            extends AbstractBehaviourContainer<IActivityLifecycle>
            implements IActivityLifecycle {

    private final Activity owner;

    public ActivityBehavioursContainer(final Activity owner) {
        this.owner = owner;
    }

    public void onCreate() {
        for (final IActivityLifecycle behaviour :  bevahoirs()) {
            behaviour.onCreate();
        }
    }

    @Override
    public void onResume() {
        for (final IActivityLifecycle behaviour :  bevahoirs()) {
            behaviour.onResume();
        }
    }

    @Override
    public void onPause() {
        for (final IActivityLifecycle behaviour :  bevahoirs()) {
            behaviour.onPause();
        }
    }

}
