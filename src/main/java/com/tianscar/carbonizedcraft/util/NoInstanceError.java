package com.tianscar.carbonizedcraft.util;

import java.io.Serial;

public class NoInstanceError extends AssertionError {

    @Serial
    private static final long serialVersionUID = 4513773813161903199L;

    public NoInstanceError(Class<?> clazz) {
        super("No " + clazz.getName() + " instances for you!");
    }

    public NoInstanceError(Class<?> clazz, Throwable cause) {
        super("No " + clazz.getName() + " instances for you!", cause);
    }

}
