package com.batutinhas.backloginfinito.template

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader
import spock.lang.Specification

class BaseUnitTest extends Specification {

    def setupSpec() {
        FixtureFactoryLoader.loadTemplates("com.batutinhas.backloginfinito.template");
    }
}
