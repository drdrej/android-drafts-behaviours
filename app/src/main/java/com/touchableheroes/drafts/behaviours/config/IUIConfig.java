package com.touchableheroes.drafts.behaviours.config;

import java.lang.annotation.Annotation;

/**
 * Created by asiebert on 03.07.15.
 */
public interface IUIConfig {

    public int getLayoutId();

    public <A extends Annotation> A get(final Class<A> key);
}
