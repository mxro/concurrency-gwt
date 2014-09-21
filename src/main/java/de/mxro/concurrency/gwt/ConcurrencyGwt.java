package de.mxro.concurrency.gwt;

import de.mxro.concurrency.Concurrency;
import de.mxro.concurrency.gwt.internal.GwtConcurrencyFactory;
import de.mxro.factories.Factory;

public class ConcurrencyGwt {

    public static Concurrency create() {
        return new GwtConcurrencyImpl();
    }

    public static Factory<?, ?, ?> createFactory() {
        return new GwtConcurrencyFactory();
    }

}
