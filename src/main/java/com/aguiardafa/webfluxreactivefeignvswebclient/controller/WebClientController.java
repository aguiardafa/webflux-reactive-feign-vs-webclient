package com.aguiardafa.webfluxreactivefeignvswebclient.controller;

import com.aguiardafa.webfluxreactivefeignvswebclient.client.WebClient;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.FilmResponse;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.ListOfFilmsResponse;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.PeopleResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/webclient")
public class WebClientController {

    WebClient webClient;

    @GetMapping("/peoples/{id}")
    public Mono<PeopleResponse> getPeopleById(@PathVariable String id){
        return webClient.findPeopleById(id);
    }

    @GetMapping("/films/{id}")
    public Mono<FilmResponse> getEpisodeById(@PathVariable String id){
        return webClient.findFilmById(id);
    }

    @GetMapping("/films")
    public Flux<ListOfFilmsResponse> getAllEpisodes(){
        return webClient.findAllFilms();
    }

}
