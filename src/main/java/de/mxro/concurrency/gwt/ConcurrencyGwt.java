package de.mxro.concurrency.gwt;

import de.mxro.concurrency.Concurrency;

public class ConcurrencyGwt {

    public static Concurrency create() {
        return new GwtConcurrencyImpl();
    }

}
