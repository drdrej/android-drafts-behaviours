package com.touchableheroes.drafts.behaviours;

import com.touchableheroes.drafts.behaviours.lifecycle.SimpleUILifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsOwnerSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsPauseSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsResumeSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsStopSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsSupported;

/**
 * Created by asiebert on 25.06.15.
 */
public class AbstractOwnerBehavioursContainer<C, T extends IsSupported>
        extends AbstractBehaviourContainer<T>
        implements IsOwnerSupported<C> {

    private final C owner;

    public AbstractOwnerBehavioursContainer(final C owner) {
        this.owner = owner;
    }

    @Override
    public C owner() {
        return owner;
    }

}
