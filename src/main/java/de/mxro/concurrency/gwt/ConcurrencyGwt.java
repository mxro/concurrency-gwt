package de.mxro.concurrency.gwt;

import delight.factories.Factory;

import de.mxro.concurrency.Concurrency;
import de.mxro.concurrency.gwt.internal.GwtConcurrencyFactory;

public class ConcurrencyGwt {

    public static Concurrency create() {
        return new GwtConcurrencyImpl();
    }

    public static Factory<?, ?, ?> createFactory() {
        return new GwtConcurrencyFactory();
    }

}
