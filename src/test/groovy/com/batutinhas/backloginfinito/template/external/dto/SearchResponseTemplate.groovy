package com.batutinhas.backloginfinito.template.external.dto

import br.com.six2six.fixturefactory.Fixture
import br.com.six2six.fixturefactory.Rule
import br.com.six2six.fixturefactory.loader.TemplateLoader
import com.batutinhas.backloginfinito.external.dto.GameResponse
import com.batutinhas.backloginfinito.external.dto.SearchResponse

class SearchResponseTemplate implements TemplateLoader {

    static final String VALID_SEARCH_RESPONSE = "VALID_SEARCH_RESPONSE"

    @Override
    void load() {
        Fixture.of(SearchResponse).addTemplate(VALID_SEARCH_RESPONSE, new Rule(){{
            add("error", "OK")
            add("limit", 10)
            add("numberOfPageResults", 10)
            add("numberOfTotalResults", 100)
            add("statusCode", 1)
            add("results", has(1)
                    .of(GameResponse, GameResponseTemplate.VALID_GAME_RESPONSE))
        }})
    }
}
