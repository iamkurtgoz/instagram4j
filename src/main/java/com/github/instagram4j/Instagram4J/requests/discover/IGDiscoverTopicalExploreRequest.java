package com.github.instagram4j.Instagram4J.requests.discover;

import com.github.instagram4j.Instagram4J.requests.IGGetRequest;
import com.github.instagram4j.Instagram4J.responses.discover.IGDiscoverTopicalExploreResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class IGDiscoverTopicalExploreRequest extends IGGetRequest<IGDiscoverTopicalExploreResponse> {
    private String _cluster_id;

    @Override
    public String getQueryString() {
        return mapQueryString("cluster_id", _cluster_id, "module", "explore_popular", "use_sectional_payload", "true", "omit_cover_media", "true");
    }

    @Override
    public String path() {
        return "discover/topical_explore/";
    }

    @Override
    public Class<IGDiscoverTopicalExploreResponse> getResponseType() {
        return IGDiscoverTopicalExploreResponse.class;
    }
}
