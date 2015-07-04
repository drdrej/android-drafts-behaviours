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
        for (final IsSupported behaviour :  behaviours) {

            call.setBehaviour(behaviour);

            if( call.when() ) {
                call.then();
            }
        }
    }

    /**
     * Returns the last accepted by type value.
     *
     * @param call
     * @param typeCheck
     * @param <T>
     *
     * @return
     */
    public <T> T execute(final Function call, final Class<T> typeCheck) {
        T rval = null;

        for (final IsSupported behaviour :  behaviours) {
            call.setBehaviour(behaviour);

            if( call.when() ) {
                final Object result = call.then();

                if( result == null ) {
                    System.out.println( "Function name=" + call.behaviour() + " returns null result.");
                    rval = (T) result;
                }

                if( typeCheck == null ) {
                    System.out.println( "Function name=" + call.behaviour() + " returns null because no typechecker. skipped result = " + result);
                    rval = null;
                }

                if( typeCheck.isAssignableFrom(result.getClass()) ) {
                    System.out.println( "Function name=" + call.behaviour() + " returns result = " + result + ".");
                    rval = (T) result;
                }
            }
        }

        return (T) rval;
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


    public static abstract class Function {

        private IsSupported behaviour;

        public Function() {
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

        abstract <T> T then();
    }


}