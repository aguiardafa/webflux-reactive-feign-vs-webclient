package com.aguiardafa.webfluxreactivefeignvswebclient.controller;

import com.aguiardafa.webfluxreactivefeignvswebclient.client.FeignClient;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.FilmResponse;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.ListOfFilmsResponse;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.PeopleResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@RequestMapping("/reactive-feign")
public class FeignController {

    FeignClient feignClient;

    @GetMapping("/peoples/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<PeopleResponse> findPeopleById(@PathVariable String id){
        return feignClient.findPeopleById(id);
    }

    @GetMapping("/films/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<FilmResponse> findFilmById(@PathVariable String id){
        return feignClient.findFilmById(id);
    }

    @GetMapping("/films")
    @ResponseStatus(HttpStatus.OK)
    public Flux<ListOfFilmsResponse> findAllFilms(){
        return feignClient.findAllFilms();
    }

}
