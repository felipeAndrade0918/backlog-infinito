package com.batutinhas.backloginfinito.external.client;

import com.batutinhas.backloginfinito.external.dto.SearchResponse;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "giantBomApi", url = "https://www.giantbomb.com/api")
public interface GiantBombClient {

    @GetMapping(value = "/search?api_key=${api.key}&format=json&resources=game",
            headers = {"User-Agent=BacklogInfinitoAPI"})
    SearchResponse search(@RequestParam String query);
}
