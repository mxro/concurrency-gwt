package de.mxro.concurrency.gwt;

import de.mxro.concurrency.Concurrency;

public class GwtConcurrency {

    public static Concurrency newGwtConcurrency() {
        return new GwtConcurrencyImpl();
    }

}
