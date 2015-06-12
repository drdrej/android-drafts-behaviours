package com.touchableheroes.drafts.behaviours;

import com.touchableheroes.drafts.behaviours.lifecycle.ICreateSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.IsEnableSupported;

/**
 * Created by asiebert on 29.11.14.
 */
public interface IActivityBehaviour extends IsEnableSupported, ICreateSupported {

    public void onResume();

    public void onPause();


}
