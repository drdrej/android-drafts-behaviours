package com.touchableheroes.drafts.behaviours;

import android.app.Application;
import android.content.res.Configuration;

import com.touchableheroes.drafts.behaviours.lifecycle.IApplicationLifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsConfigurationChangedSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsLowMemorySupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsMemoryManagementSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsResumeSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsTerminateSupported;

/**
 * Created by asiebert on 30.12.14.
 */
public class AppBehavioursContainer
             extends AndroidUILifecycleContainer<Application>
             implements IApplicationLifecycle {


    public AppBehavioursContainer(final Application owner) {
        super(owner);
    }

}





