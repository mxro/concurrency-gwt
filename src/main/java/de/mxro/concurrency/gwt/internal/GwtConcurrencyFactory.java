package de.mxro.concurrency.gwt.internal;

import delight.factories.Configuration;
import delight.factories.Dependencies;
import delight.factories.Factory;

import de.mxro.concurrency.Concurrency;
import de.mxro.concurrency.configuration.ConcurrencyConfiguration;
import de.mxro.concurrency.gwt.ConcurrencyGwt;

public class GwtConcurrencyFactory implements Factory<Concurrency, ConcurrencyConfiguration, Dependencies> {

    @Override
    public boolean canInstantiate(final Configuration conf) {
        return conf instanceof ConcurrencyConfiguration;
    }

    @Override
    public Concurrency create(final ConcurrencyConfiguration conf, final Dependencies dependencies) {
        return ConcurrencyGwt.create();
    }

}
