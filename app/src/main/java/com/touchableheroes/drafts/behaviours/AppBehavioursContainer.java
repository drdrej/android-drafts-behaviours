package com.touchableheroes.drafts.behaviours;

import android.app.Application;

import com.touchableheroes.drafts.behaviours.lifecycle.IApplicationLifecycle;

/**
 * Created by asiebert on 30.12.14.
 */
public class AppBehavioursContainer
             extends AbstractAndroidUILifecycleBehavioursContainer<Application, IApplicationLifecycle>
             implements IApplicationLifecycle {


    public AppBehavioursContainer(final Application owner) {
        super(owner);
    }

}





