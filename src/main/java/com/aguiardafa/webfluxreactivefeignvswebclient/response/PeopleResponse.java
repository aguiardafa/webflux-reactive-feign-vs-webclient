package com.aguiardafa.webfluxreactivefeignvswebclient.response;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class PeopleResponse {

    private String name;
    private String gender;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String eye_color;
    private String birth_year;
    private String homeworld;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> films;

}
