package com.touchableheroes.drafts.behaviours;

import android.content.res.Configuration;

import com.touchableheroes.drafts.behaviours.lifecycle.IApplicationLifecycle;

/**
 * Created by asiebert on 30.12.14.
 */
@Deprecated
public class AppBehavioursContainer
             extends AbstractBehaviourContainer<IApplicationLifecycle>
             implements IApplicationLifecycle {

    @Override
    public void onCreate() {
        for( final IApplicationLifecycle behaviour : bevahoirs()) {
            behaviour.onCreate();
        }
    }

    @Override
    public void onLowMemory() {
        for( final IApplicationLifecycle behaviour : bevahoirs()) {
            behaviour.onLowMemory();
        }
    }

    @Override
    public void onTerminate() {
        for( final IApplicationLifecycle behaviour : bevahoirs()) {
            behaviour.onTerminate();
        }
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        for( final IApplicationLifecycle behaviour : bevahoirs()) {
            behaviour.onConfigurationChanged(newConfig);
        }
    }
}





