package com.batutinhas.backloginfinito.external.gateway.impl;

import com.batutinhas.backloginfinito.external.client.GiantBombClient;
import com.batutinhas.backloginfinito.external.dto.SearchResponse;
import com.batutinhas.backloginfinito.external.gateway.SearchGamesGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class SearchGamesGatewayImpl implements SearchGamesGateway {

    private final GiantBombClient giantBombClient;

    @Override
    public SearchResponse searchGames(String query) {
        return giantBombClient.search(query);
    }
}
