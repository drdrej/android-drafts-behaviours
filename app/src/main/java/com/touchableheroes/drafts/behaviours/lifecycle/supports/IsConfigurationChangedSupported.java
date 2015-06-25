package com.touchableheroes.drafts.behaviours.lifecycle.supports;

import android.content.res.Configuration;

/**
 * Created by asiebert on 25.06.15.
 */
public interface IsConfigurationChangedSupported extends IsSupported {

    public void onConfigurationChanged(Configuration newConfig);

}
