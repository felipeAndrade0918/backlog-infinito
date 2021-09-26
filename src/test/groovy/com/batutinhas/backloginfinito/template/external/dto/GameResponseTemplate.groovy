package com.batutinhas.backloginfinito.template.external.dto

import br.com.six2six.fixturefactory.Fixture
import br.com.six2six.fixturefactory.Rule
import br.com.six2six.fixturefactory.loader.TemplateLoader
import com.batutinhas.backloginfinito.external.dto.GameImageResponse
import com.batutinhas.backloginfinito.external.dto.GameResponse
import com.batutinhas.backloginfinito.external.dto.PlatformResponse

class GameResponseTemplate implements TemplateLoader {

    static final String VALID_GAME_RESPONSE = "VALID_GAME_RESPONSE"

    @Override
    void load() {
        Fixture.of(GameResponse).addTemplate(VALID_GAME_RESPONSE, new Rule(){{
            add("deck", "Um jogo muito bacana!")
            add("name", "Incidente em Varginha")
            add("id", 1996L)
            add("image", one(GameImageResponse, GameImageResponseTemplate.VALID_GAME_IMAGE_RESPONSE))
            add("platforms", has(1)
                    .of(PlatformResponse, PlatformResponseTemplate.VALID_PLATFORM_RESPONSE))
        }})
    }
}
