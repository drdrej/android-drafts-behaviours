package com.touchableheroes.drafts.behaviours;

import com.touchableheroes.drafts.behaviours.lifecycle.AndroidSimpleUILifecycle;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IOwner;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsPauseSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsResumeSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsStopSupported;

/**
 * Created by asiebert on 19.06.15.
 */
public class AndroidUILifecycleContainer<C> extends AbstractBehaviourContainer<AndroidSimpleUILifecycle> implements AndroidSimpleUILifecycle, IOwner<C> {

    private final C owner;

    public AndroidUILifecycleContainer( final C owner ) {
        this.owner = owner;
    }


    @Override
    public C getOwner() {
        return owner;
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
}
