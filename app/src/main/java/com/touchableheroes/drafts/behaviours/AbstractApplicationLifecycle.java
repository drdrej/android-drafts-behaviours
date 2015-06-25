package com.touchableheroes.drafts.behaviours;

import android.app.Application;
import android.content.Context;

import com.touchableheroes.drafts.behaviours.lifecycle.IApplicationLifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IContextSupported;

/**
 * Created by asiebert on 30.12.14.
 */
public abstract class AbstractApplicationLifecycle
        extends AndroidUILifecycleContainer<Application>
        implements IApplicationLifecycle, IContextSupported {

    public AbstractApplicationLifecycle(final Application owner) {
        super(owner);
    }

    @Override
    public Context context() {
        return this.owner().getApplicationContext();
    }
}
