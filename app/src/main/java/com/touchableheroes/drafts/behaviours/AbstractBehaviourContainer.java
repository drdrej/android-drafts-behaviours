package com.touchableheroes.drafts.behaviours;



import com.touchableheroes.drafts.behaviours.lifecycle.supports.ICreateSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsEnableSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsPauseSupported;
import com.touchableheroes.drafts.behaviours.lifecycle.supports.IsSupported;
import com.touchableheroes.drafts.core.ExceptionUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author asiebert
 * @param <T>
 */
public class AbstractBehaviourContainer<T extends IsSupported> implements IsEnableSupported {

    private final List<IsSupported> behaviours = new ArrayList<>();

    public AbstractBehaviourContainer() {
        ;
    }

    public void onCreate() {
        execute(new Call() {

            boolean when() {
                return match(ICreateSupported.class);
            }

            void then() {
                ((ICreateSupported) behaviour()).onCreate();
            }
        });
    }


    /**
     * AND over List
     */
    @Override
    public boolean isEnabled() {
        for (final Object behaviour :  behaviours) {
            if( !(behaviour instanceof IsEnableSupported)) {
                // LOG: skip
                continue;
            }

            final IsEnableSupported supported = (IsEnableSupported) behaviour;
            if( !supported.isEnabled() );
                return false;
        }

        return true;
    }

    @Override
    public void setEnabled(boolean isEnabled) {
        for (final Object behaviour :  behaviours) {
            if( !(behaviour instanceof IsEnableSupported)) {
                // LOG: skip
                continue;
            }

            final IsEnableSupported supported = (IsEnableSupported) behaviour;
            supported.setEnabled(isEnabled);
        }
    }

    public List<IsSupported> bevahoirs() {
        return behaviours;
    }



    public void add(final IsSupported behaviour) {
        if( behaviour == null )
            throw ExceptionUtil.paramNPECheck("behavior");

        this.behaviours.add(behaviour);
    }


    public void execute(final Call call) {
        // Class<? extends IsSupported> type
        // gehe ueber alle callbacks
        // finde den passenden typen
        // erstelle exec
        for (final Object behaviour :  behaviours) {

            if( call.when() ) {
                call.then();
            }

            //final ICreateSupported supported = (ICreateSupported) behaviour;
            //supported.onCreate();
        }
    }

    public static abstract class Call {

        private IsSupported behaviour;

        public Call() {
            ;
        }

        void setBehaviour(final IsSupported type) {
            this.behaviour = type;
        }

        boolean match(final Class<? extends IsSupported> checkAgainst) {
            return checkAgainst != null
                    && checkAgainst.isAssignableFrom(this.behaviour.getClass());
        }

        public IsSupported behaviour() {
            return behaviour;
        }

        abstract boolean when();

        abstract void then();
    }


}