package com.aguiardafa.webfluxreactivefeignvswebclient.client;

import com.aguiardafa.webfluxreactivefeignvswebclient.response.FilmResponse;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.ListOfFilmsResponse;
import com.aguiardafa.webfluxreactivefeignvswebclient.response.PeopleResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@Slf4j
public class WebClient {
    private  final org.springframework.web.reactive.function.client.WebClient client;

    private static final String PARAMETER_ERRO_MSG = "Verifique os parâmetros informados";

    public WebClient(org.springframework.web.reactive.function.client.WebClient.Builder builder){
        client = builder.baseUrl("https://swapi.dev/api/").build();
    }

    public Mono<PeopleResponse> findPeopleById(String id){
        log.info("Buscando uma pessoa pelo id [{}]", id);
        return client
                .get()
                .uri("/people/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError,
                        error -> Mono.error(new RuntimeException()))
                .bodyToMono(PeopleResponse.class);
    }

    public Mono<FilmResponse> findFilmById(String id){
        log.info("Buscando um filme pelo id [{}]", id);
        return client
                .get()
                .uri("/films/" + id)
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError,
                        error -> Mono.error(new RuntimeException(PARAMETER_ERRO_MSG)))
                .bodyToMono(FilmResponse.class);
    }

    public Flux<ListOfFilmsResponse> findAllFilms(){
        log.info("Listando todos os filmes");
        return client
                .get()
                .uri("/films/")
                .accept(APPLICATION_JSON)
                .retrieve()
                .onStatus(HttpStatus::is4xxClientError,
                        error -> Mono.error(new RuntimeException(PARAMETER_ERRO_MSG)))
                .bodyToFlux(ListOfFilmsResponse.class);
    }

}
