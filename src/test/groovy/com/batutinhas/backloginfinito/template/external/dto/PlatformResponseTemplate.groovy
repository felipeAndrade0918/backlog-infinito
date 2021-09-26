package com.batutinhas.backloginfinito.template.external.dto

import br.com.six2six.fixturefactory.Fixture
import br.com.six2six.fixturefactory.Rule
import br.com.six2six.fixturefactory.loader.TemplateLoader
import com.batutinhas.backloginfinito.external.dto.PlatformResponse

class PlatformResponseTemplate implements TemplateLoader {

    static final String VALID_PLATFORM_RESPONSE = "VALID_PLATFORM_RESPONSE"

    @Override
    void load() {
        Fixture.of(PlatformResponse).addTemplate(VALID_PLATFORM_RESPONSE, new Rule(){{
            add("id", 20L)
            add("name", "Personal Computer")
            add("abbreviation", "PC")
        }})
    }
}
