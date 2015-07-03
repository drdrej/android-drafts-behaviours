package com.touchableheroes.drafts.behaviours;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.touchableheroes.drafts.behaviours.lifecycle.IFragmentLifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsFragmentExtSupported;

/**
 * Created by asiebert on 03.07.15.
 */
public class FragmentBehavioursContainer extends AbstractAndroidUILifecycleBehavioursContainer<Fragment, IFragmentLifecycle> implements  IFragmentLifecycle{

    public FragmentBehavioursContainer(final Fragment owner) {
        super(owner);
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        return execute(new Function() {
            boolean when() {
                return match(IsFragmentExtSupported.class);
            }

            View then() {
                return ((IsFragmentExtSupported) behaviour()).onCreateView(inflater, container, savedInstanceState);
            }
        }, View.class);
    }

}
