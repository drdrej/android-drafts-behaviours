package com.touchableheroes.drafts.behaviours.lifecycle;

import android.content.res.Configuration;

import com.touchableheroes.drafts.behaviours.lifecycle.supports.ICreateSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsLowMemorySupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsPauseSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsResumeSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsStopSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsTerminateSupported;

/**
 * Created by asiebert on 30.12.14.
 */
public interface IApplicationLifecycle
        extends SimpleUILifecycle {

}
