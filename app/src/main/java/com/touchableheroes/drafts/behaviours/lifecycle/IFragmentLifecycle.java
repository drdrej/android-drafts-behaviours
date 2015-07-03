package com.touchableheroes.drafts.behaviours.lifecycle;

import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsEnableSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsFragmentExtSupported;

/**
 * Created by asiebert on 03.07.15.
 */
public interface IFragmentLifecycle
        extends  SimpleUILifecycle,
                 IsEnableSupported,

                 IsFragmentExtSupported {

}
