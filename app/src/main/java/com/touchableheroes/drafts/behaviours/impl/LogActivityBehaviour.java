package com.touchableheroes.drafts.behaviours.impl;

import android.app.Activity;

import com.touchableheroes.drafts.behaviours.AbstractActivityLifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.IActivityLifecycle;
import com.touchableheroes.drafts.log.Logger;

/**
 * Created by asiebert on 15.12.14.
 */
public class LogActivityBehaviour extends AbstractActivityLifecycle implements IActivityLifecycle {

    private static Logger LOG = Logger.create(LogActivityBehaviour.class);

    private final Logger logger;

    public LogActivityBehaviour(Activity owner) {
        super(owner);

        this.logger = Logger.create(owner.getClass());
    }

    @Override
    public void onCreate() {
        logger.debug( "call activity.onCreate()" );
    }

    @Override
    public void onResume() {
        logger.debug( "call activity.onResume()" );
    }

    @Override
    public void onPause() {
        logger.debug( "call activity.onPause()" );
    }

}
