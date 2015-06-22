package com.touchableheroes.drafts.behaviours.impl;

import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsOwnerSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsEnableSupported;

/**
 * Created by asiebert on 22.06.15.
 */
public class BasicBehaviour<O> implements IsEnableSupported, IsOwnerSupported<O> {

    private final O owner;

    public BasicBehaviour(final O owner) {
        this.owner = owner;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public void setEnabled(boolean isEnabled) {
        ;
    }

    @Override
    public O owner() {
        return owner;
    }
}
