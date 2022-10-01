package com.aguiardafa.webfluxreactivefeignvswebclient.client;

import com.aguiardafa.webfluxreactivefeignvswebclient.response.FilmResponse;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.ListOfFilmsResponse;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.PeopleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(url = "https://swapi.dev/api/", name = "star-wars")
public interface FeignClient {

    @GetMapping("/people/{id}")
    Mono<PeopleResponse> findPeopleById(@RequestParam(value = "id") String id);

    @GetMapping("/films/{id}")
    Mono<FilmResponse> findFilmById(@RequestParam(value = "id") String id);

    @GetMapping("/films")
    Flux<ListOfFilmsResponse> findAllFilms();
}
