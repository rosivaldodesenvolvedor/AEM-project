package com.adobe.aem.wknd.examples.core.adventures;

import org.osgi.annotations.versioning.ProviderType;

@ProvideType
public interface Activities {

    String getRandomActivity();

}