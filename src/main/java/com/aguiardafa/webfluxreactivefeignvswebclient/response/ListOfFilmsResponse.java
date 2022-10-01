package com.aguiardafa.webfluxreactivefeignvswebclient.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ListOfFilmsResponse {

    private List<FilmResponse> results;

}
