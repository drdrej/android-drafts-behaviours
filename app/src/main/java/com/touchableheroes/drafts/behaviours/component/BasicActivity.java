package com.touchableheroes.drafts.behaviours.component;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.touchableheroes.drafts.behaviours.ActivityBehavioursContainer;
import com.touchableheroes.drafts.behaviours.config.IActivityConfig;
import com.touchableheroes.drafts.behaviours.config.IHasConfiguration;
import com.touchableheroes.drafts.core.Log;

/**
 * Kümmert sich um akkumulierte ActivityBehaviours.
 * Behaviours werden der Reihe nach abgearbeitet.
 *
 * Created by asiebert on 15.12.14.
 */
public abstract class BasicActivity extends  ActionBarActivity implements IHasConfiguration<IActivityConfig> {

    private static final Log LOGGER = Log.instance("APP");

    private final ActivityBehavioursContainer behaviours = new ActivityBehavioursContainer(this);


    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);

        setContentView( config().getLayoutId() );

        LOGGER.debug("onCreate() called");

        onConfigBehaviours();

        behaviours.onCreate();
    }

    protected abstract void onConfigBehaviours();

    public ActivityBehavioursContainer behaviours() {
        return this.behaviours;
    }

    @Override
    public void onPause() {
        super.onPause();

        behaviours.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();

        behaviours.onResume();
    }

}
