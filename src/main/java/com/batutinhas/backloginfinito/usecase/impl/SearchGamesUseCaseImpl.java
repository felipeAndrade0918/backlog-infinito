package com.batutinhas.backloginfinito.usecase.impl;

import com.batutinhas.backloginfinito.external.client.GiantBombClient;
import com.batutinhas.backloginfinito.external.dto.SearchResponse;
import com.batutinhas.backloginfinito.external.gateway.SearchGamesGateway;
import com.batutinhas.backloginfinito.usecase.SearchGamesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SearchGamesUseCaseImpl implements SearchGamesUseCase {

    private final SearchGamesGateway searchGamesGateway;

    @Override
    public SearchResponse execute(String query) {
        return searchGamesGateway.searchGames(query);
    }
}
