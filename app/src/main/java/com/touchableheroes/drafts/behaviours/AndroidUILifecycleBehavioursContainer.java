package com.touchableheroes.drafts.behaviours;

import android.content.res.Configuration;

import com.touchableheroes.drafts.behaviours.lifecycle.SimpleUILifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsConfigurationChangedSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsLowMemorySupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsPauseSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsResumeSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsStopSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsOwnerSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsTerminateSupported;

/**
 * Created by asiebert on 19.06.15.
 */
public class AndroidUILifecycleBehavioursContainer<C>
        extends AbstractAndroidUILifecycleBehavioursContainer<C, SimpleUILifecycle> {

    public AndroidUILifecycleBehavioursContainer(C owner) {
        super(owner);
    }
}
