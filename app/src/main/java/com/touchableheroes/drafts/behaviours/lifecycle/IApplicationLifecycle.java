package com.touchableheroes.drafts.behaviours.lifecycle;

import android.content.res.Configuration;

import com.touchableheroes.drafts.behaviours.lifecycle.supports.ICreateSupported;

/**
 * Created by asiebert on 30.12.14.
 */
public interface IApplicationLifecycle extends ICreateSupported {

    public void onLowMemory();

    public void onTerminate();

    public void onConfigurationChanged(final Configuration newConfig);

}
