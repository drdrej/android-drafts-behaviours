package com.touchableheroes.drafts.behaviours;

import android.app.Activity;

import com.touchableheroes.drafts.behaviours.lifecycle.IActivityLifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.SimpleUILifecycle;

/**
 * Created by asiebert on 15.12.14.
 */

public class ActivityBehavioursContainer
            extends AbstractAndroidUILifecycleBehavioursContainer<Activity, IActivityLifecycle>
            implements IActivityLifecycle {

    public ActivityBehavioursContainer(final Activity owner) {
        super(owner);
    }

}
