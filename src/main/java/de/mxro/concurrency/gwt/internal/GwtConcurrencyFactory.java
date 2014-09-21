package de.mxro.concurrency.gwt.internal;

import de.mxro.concurrency.Concurrency;
import de.mxro.concurrency.configuration.ConcurrencyConfiguration;
import de.mxro.concurrency.gwt.ConcurrencyGwt;
import de.mxro.factories.Configuration;
import de.mxro.factories.Dependencies;
import de.mxro.factories.Factory;

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
