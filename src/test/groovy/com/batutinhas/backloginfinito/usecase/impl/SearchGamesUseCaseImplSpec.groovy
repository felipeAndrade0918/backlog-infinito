package com.batutinhas.backloginfinito.usecase.impl

import br.com.six2six.fixturefactory.Fixture
import com.batutinhas.backloginfinito.external.dto.SearchResponse
import com.batutinhas.backloginfinito.external.gateway.SearchGamesGateway
import com.batutinhas.backloginfinito.template.BaseUnitTest
import com.batutinhas.backloginfinito.template.external.dto.SearchResponseTemplate
import com.batutinhas.backloginfinito.usecase.SearchGamesUseCase

class SearchGamesUseCaseImplSpec extends BaseUnitTest {

    SearchGamesUseCase searchGamesUseCase
    SearchGamesGateway searchGamesGatewayMock = Mock()
    SearchResponse searchResponseFixture

    def setup() {
        searchGamesUseCase = new SearchGamesUseCaseImpl(searchGamesGatewayMock)
    }

    def "Dado uma query enviada como parâmetro, deve buscar um jogo na GB API"() {
        given: "Uma query"
        String query = "Metal Gear Solid"

        and: "Um SearchResponse válido do Gateway"
        searchResponseFixture = Fixture.from(SearchResponse).gimme(SearchResponseTemplate.VALID_SEARCH_RESPONSE)
        1 * searchGamesGatewayMock.searchGames(query) >> searchResponseFixture

        when: "Invocar execute"
        def searchResponse = searchGamesUseCase.execute(query)

        then: "Deve retornar o resultado da pesquisa"
        searchResponse == searchResponseFixture
    }
}
