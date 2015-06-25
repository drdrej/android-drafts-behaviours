package com.touchableheroes.drafts.behaviours;

import android.app.Activity;

import com.touchableheroes.drafts.behaviours.lifecycle.IActivityLifecycle;

/**
 * Created by asiebert on 15.12.14.
 */public class ActivityBehavioursContainer
            extends AndroidUILifecycleContainer<Activity>
            implements IActivityLifecycle {

    public ActivityBehavioursContainer(final Activity owner) {
        super(owner);
    }

}
