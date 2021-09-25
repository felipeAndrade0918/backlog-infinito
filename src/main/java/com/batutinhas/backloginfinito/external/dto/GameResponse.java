package com.batutinhas.backloginfinito.external.dto;

import lombok.Data;

import java.util.List;

@Data
public class GameResponse {

    private String deck;
    private String name;
    private Long id;
    private GameImageResponse image;
    private List<PlatformResponse> platforms;
}
