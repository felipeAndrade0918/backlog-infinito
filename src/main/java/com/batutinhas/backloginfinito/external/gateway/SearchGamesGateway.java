package com.batutinhas.backloginfinito.external.gateway;

import com.batutinhas.backloginfinito.external.dto.SearchResponse;

public interface SearchGamesGateway {

    SearchResponse searchGames(String query);
}
