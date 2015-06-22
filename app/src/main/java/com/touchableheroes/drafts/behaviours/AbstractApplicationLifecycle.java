package com.touchableheroes.drafts.behaviours;

import android.content.Context;

import com.touchableheroes.drafts.behaviours.lifecycle.IApplicationLifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IContextSupported;

/**
 * Created by asiebert on 30.12.14.
 */
public abstract class AbstractApplicationLifecycle implements IApplicationLifecycle, IContextSupported {

    private Context ctx;

    @Override
    public void bind(final Context context) {
        if( context == null )
            return;

        this.ctx = context;
    }

    @Override
    public Context context() {
        return this.ctx;
    }
}
