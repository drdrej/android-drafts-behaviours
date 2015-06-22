package com.touchableheroes.drafts.behaviours.lifecycle;

import com.touchableheroes.drafts.behaviours.lifecycle.supports.ICreateSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsEnableSupported;

/**
 * Created by asiebert on 29.11.14.
 */
public interface IActivityLifecycle extends IsEnableSupported, ICreateSupported {

    public void onResume();

    public void onPause();


}
