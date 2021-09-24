package com.batutinhas.backloginfinito.external.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GameImageResponse {

    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("medium_url")
    private String mediumUrl;
    @JsonProperty("screen_url")
    private String screenUrl;
    @JsonProperty("screen_large_url")
    private String screenLargeUrl;
}
