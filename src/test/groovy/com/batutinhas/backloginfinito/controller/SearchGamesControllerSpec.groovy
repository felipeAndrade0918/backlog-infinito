package com.batutinhas.backloginfinito.controller

import br.com.six2six.fixturefactory.Fixture
import com.batutinhas.backloginfinito.external.dto.SearchResponse
import com.batutinhas.backloginfinito.template.BaseUnitTest
import com.batutinhas.backloginfinito.template.external.dto.SearchResponseTemplate
import com.batutinhas.backloginfinito.usecase.SearchGamesUseCase

class SearchGamesControllerSpec extends BaseUnitTest {

    SearchGamesController searchGamesController
    SearchGamesUseCase searchGamesUseCaseMock = Mock()
    SearchResponse searchResponseFixture

    def setup() {
        searchGamesController = new SearchGamesController(searchGamesUseCaseMock)
    }

    def "Dado uma query enviada como parâmetro, deve buscar um jogo na GB API"() {
        given: "Uma query"
        String query = "Metal Gear Solid"

        and: "Um SearchResponse válido do UseCase"
        searchResponseFixture = Fixture.from(SearchResponse).gimme(SearchResponseTemplate.VALID_SEARCH_RESPONSE)
        1 * searchGamesUseCaseMock.execute(query) >> searchResponseFixture

        when: "Invocar searchGames"
        def searchResponse = searchGamesController.searchGames(query)

        then: "Deve retornar o resultado da pesquisa"
        searchResponse == searchResponseFixture
    }
}
