package com.batutinhas.backloginfinito.template.external.dto

import br.com.six2six.fixturefactory.Fixture
import br.com.six2six.fixturefactory.Rule
import br.com.six2six.fixturefactory.loader.TemplateLoader
import com.batutinhas.backloginfinito.external.dto.GameImageResponse

class GameImageResponseTemplate implements TemplateLoader {

    static final String VALID_GAME_IMAGE_RESPONSE = "VALID_GAME_IMAGE_RESPONSE"

    @Override
    void load() {
        Fixture.of(GameImageResponse).addTemplate(VALID_GAME_IMAGE_RESPONSE, new Rule(){{
            add("iconUrl", "https://www.giantbomb.com/a/uploads/square_avatar/0/7465/794840-varginha_logo.svg.png")
            add("mediumUrl", "https://www.giantbomb.com/a/uploads/scale_medium/0/7465/794840-300px_varginha_logo.svg.png")
            add("screenUrl", "https://www.giantbomb.com/a/uploads/screen_medium/0/7465/794840-300px_varginha_logo.svg.png")
            add("screenLargeUrl", "https://www.giantbomb.com/a/uploads/screen_kubrick/0/7465/794840-300px_varginha_logo.svg.png")
        }})
    }
}
