package com.touchableheroes.drafts.behaviours.lifecycle.supports;

import android.content.Context;

import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsSupported;

/**
 * Created by asiebert on 30.12.14.
 */
public interface IContextSupported extends IsSupported {

    // public void bind(final Context context);

    public Context context();

}
