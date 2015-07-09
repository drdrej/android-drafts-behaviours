package com.touchableheroes.drafts.behaviours.config;

/**
 * Created by asiebert on 05.07.15.
 */
public class ConfigUtil {

    /**
     * prüft ob config den typ unterstützt.
     *
     * @param config
     * @param check
     * @return
     */
    public static boolean is(final IUIConfig config, final Class<? extends IUIConfig> check) {
        return check.isAssignableFrom(config.getClass());
    }
}
