package com.touchableheroes.drafts.behaviours;


import android.app.Activity;

import com.touchableheroes.drafts.behaviours.lifecycle.IActivityLifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsEnableSupported;


/**
 * Created by asiebert on 15.12.14.
 */
public class AbstractActivityLifecycle
    extends AndroidUILifecycleContainer<Activity>
       implements IsEnableSupported,
        IActivityLifecycle {

    protected AbstractActivityLifecycle(final Activity owner) {

        super(owner);
    }

}
