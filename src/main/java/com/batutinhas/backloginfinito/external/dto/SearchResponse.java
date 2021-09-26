package com.batutinhas.backloginfinito.external.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SearchResponse {

    private String error;
    private int limit;
    private int offset;
    @JsonProperty("number_of_page_results")
    private int numberOfPageResults;
    @JsonProperty("number_of_total_results")
    private int numberOfTotalResults;
    @JsonProperty("status_code")
    private int statusCode;
    private List<GameResponse> results;
}
