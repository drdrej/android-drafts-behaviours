package com.touchableheroes.drafts.behaviours.lifecycle;

import com.touchableheroes.drafts.behaviours.lifecycle.supports.ICreateSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsEnableSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsPauseSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsResumeSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsStopSupported;

/**
 * Created by asiebert on 19.06.15.
 */
public interface SimpleUILifecycle extends ICreateSupported,
        IsPauseSupported,
        IsStopSupported,
        IsResumeSupported,
        IsEnableSupported {

}