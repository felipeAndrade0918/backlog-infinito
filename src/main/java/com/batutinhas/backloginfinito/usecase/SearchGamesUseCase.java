package com.batutinhas.backloginfinito.usecase;

import com.batutinhas.backloginfinito.external.dto.SearchResponse;

public interface SearchGamesUseCase {

    SearchResponse execute(String query);
}
