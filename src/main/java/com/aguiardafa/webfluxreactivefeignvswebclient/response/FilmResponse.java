package com.aguiardafa.webfluxreactivefeignvswebclient.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FilmResponse {

    private String title;
    private String director;
    private String episode_id;
    private String opening_crawl;
    private List<String> characters;

}
