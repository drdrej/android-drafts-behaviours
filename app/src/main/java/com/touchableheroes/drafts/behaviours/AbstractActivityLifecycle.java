package com.touchableheroes.drafts.behaviours;


import android.app.Activity;

import com.touchableheroes.drafts.behaviours.lifecycle.IActivityLifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsEnableSupported;


/**
 * Created by asiebert on 15.12.14.
 */
public class AbstractActivityLifecycle
       implements IsEnableSupported, IActivityLifecycle {

    private final Activity owner;

    protected AbstractActivityLifecycle(final Activity owner) {
        this.owner = owner;
    }


    private boolean isEnabled;

    @Override
    public void onCreate() {
        ;
    }

    @Override
    public void onResume() {
        ;
    }

    @Override
    public void onPause() {
        ;
    }

    @Override
    public boolean isEnabled() {
        // import static com.touchableheroes.mrdoorkeeper.Constants.Logger.ACTIVITY;
        // Logger.ACTIVITY.debug( "call behaviour.isEnabled():" + isEnabled );

        return false;
    }

    @Override
    public void setEnabled(boolean isEnabled) {
        // Logger.ACTIVITY.debug( "call setEnabled(" + isEnabled + ")" );
        this.isEnabled = isEnabled;
    }

    public Activity getActivity() {
        return owner;
    }
}
