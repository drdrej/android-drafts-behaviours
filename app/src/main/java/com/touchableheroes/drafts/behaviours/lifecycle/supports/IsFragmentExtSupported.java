package com.touchableheroes.drafts.behaviours.lifecycle.supports;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by asiebert on 03.07.15.
 */
public interface IsFragmentExtSupported extends IsSupported {

    public View onCreateView(final LayoutInflater inflater,
                             final ViewGroup container,
                             final Bundle savedInstanceState);

}
