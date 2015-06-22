package com.touchableheroes.drafts.behaviours.lifecycle.supports;

import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsSupported;

/**
 * Created by asiebert on 21.06.15.
 */
public interface IsOwnerSupported<T> extends IsSupported {

    public T owner();

}
