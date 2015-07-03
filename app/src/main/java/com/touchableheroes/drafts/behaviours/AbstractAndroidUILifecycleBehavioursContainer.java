package com.touchableheroes.drafts.behaviours;

import android.content.res.Configuration;

import com.touchableheroes.drafts.behaviours.lifecycle.SimpleUILifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsConfigurationChangedSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsLowMemorySupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsOwnerSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsPauseSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsResumeSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsStopSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsTerminateSupported;

/**
 * Created by asiebert on 19.06.15.
 */
public class AbstractAndroidUILifecycleBehavioursContainer<C, L extends IsSupported>
        extends AbstractOwnerBehavioursContainer<C, L>
        implements SimpleUILifecycle, IsOwnerSupported<C> {


    public AbstractAndroidUILifecycleBehavioursContainer(final C owner) {
        super(owner);
    }

    @Override
    public void onPause() {
        execute(new Call() {

            boolean when() {
                return match(IsPauseSupported.class);
            }

            void then() {
                ((IsPauseSupported) behaviour()).onPause();
            }
        });
    }

    @Override
    public void onResume() {
        execute(new Call() {

            boolean when() {
                return match(IsResumeSupported.class);
            }

            void then() {
                ((IsResumeSupported) behaviour()).onResume();
            }
        });
    }


    @Override
    public void onStop() {
        execute(new Call() {

            boolean when() {
                return match(IsStopSupported.class);
            }

            void then() {
                ((IsStopSupported) behaviour()).onStop();
            }
        });
    }



    @Override
    public void onLowMemory() {
        execute(new Call() {

            boolean when() {
                return match(IsLowMemorySupported.class);
            }

            void then() {
                ((IsLowMemorySupported) behaviour()).onLowMemory();
            }
        });
    }

    @Override
    public void onTerminate() {
        execute(new Call() {

            boolean when() {
                return match(IsTerminateSupported.class);
            }

            void then() {
                ((IsTerminateSupported) behaviour()).onTerminate();
            }
        });
    }

    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        execute(new Call() {

            boolean when() {
                return match(IsConfigurationChangedSupported.class);
            }

            void then() {
                ((IsConfigurationChangedSupported) behaviour()).onConfigurationChanged(newConfig);
            }
        });
    }


}
