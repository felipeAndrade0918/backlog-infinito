package com.batutinhas.backloginfinito.external.gateway.impl

import br.com.six2six.fixturefactory.Fixture
import com.batutinhas.backloginfinito.external.client.GiantBombClient
import com.batutinhas.backloginfinito.external.dto.SearchResponse
import com.batutinhas.backloginfinito.external.gateway.SearchGamesGateway
import com.batutinhas.backloginfinito.template.BaseUnitTest
import com.batutinhas.backloginfinito.template.external.dto.SearchResponseTemplate

class SearchGamesGatewayImplSpec extends BaseUnitTest {

    SearchGamesGateway searchGamesGateway
    GiantBombClient giantBombClient = Mock()
    SearchResponse searchResponseFixture

    def setup() {
        searchGamesGateway = new SearchGamesGatewayImpl(giantBombClient)
    }

    def "Dado uma query enviada como parâmetro, deve buscar um jogo na GB API"() {
        given: "Uma query"
        String query = "Metal Gear Solid"

        and: "Um SearchResponse válido da API"
        searchResponseFixture = Fixture.from(SearchResponse).gimme(SearchResponseTemplate.VALID_SEARCH_RESPONSE)
        1 * giantBombClient.searchGames(query) >> searchResponseFixture

        when: "Invocar searchGames"
        def searchResponse = searchGamesGateway.searchGames(query)

        then: "Deve retornar o resultado da pesquisa"
        searchResponse == searchResponseFixture
    }
}
