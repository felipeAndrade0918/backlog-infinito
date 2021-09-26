package com.batutinhas.backloginfinito.controller;

import com.batutinhas.backloginfinito.external.dto.SearchResponse;
import com.batutinhas.backloginfinito.usecase.SearchGamesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SearchGamesController {

    private final SearchGamesUseCase searchGamesUseCase;

    @GetMapping("/search")
    public SearchResponse searchGames(@RequestParam String query) {
        return searchGamesUseCase.execute(query);
    }
}
