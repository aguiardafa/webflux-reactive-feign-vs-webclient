# Projeto Spring Web FLux - Star Wars API

Projeto criado com fins acadêmicos, demonstrando o uso básico do Spring Webflux com Reactive Feign e com Web Client no consumo da API do Star Wars [SWAPI](https://swapi.dev/).

<a href="#backers" alt="Last Commit">
<img src="https://img.shields.io/github/last-commit/aguiardafa/webflux-reactive-feign-vs-webclient" /></a>
<a href="https://github.com/aguiardafa/webflux-reactive-feign-vs-webclient/pulse" alt="Activity">
<img src="https://img.shields.io/github/commit-activity/y/aguiardafa/webflux-reactive-feign-vs-webclient" /></a>
<a href="#backers" alt="Repository Size">
<img src="https://img.shields.io/github/repo-size/aguiardafa/webflux-reactive-feign-vs-webclient" /></a>
<a href="#backers" alt="License MIT">
<img src="https://img.shields.io/badge/license-MIT-green" /></a>
<a href="#backers" alt="Languege Portuguese">
<img src="https://img.shields.io/badge/language-Portuguese-yellow" /></a>

## Projeto Web - Star Wars API

Trata-se de uma <b>API Web Spring Reativa</b> que disponibiliza dados sobre Star Wars expostos por implementação Rest em formato JSON, consumidos da API pública [SWAPI](https://swapi.dev/), utilizando o [Reactive feign](https://github.com/PlaytikaOSS/feign-reactive) e o [Webclient](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html#webflux-client) (Client que já vem embutido no [Webflux](https://docs.spring.io/spring-framework/docs/current/reference/html/web-reactive.html#webflux)).

O projeto foi gerado com [Spring Initializr](https://start.spring.io/) - Spring Boot version 2.7.4 - Java version 17.

### 🛒 Requisitos do Projeto:

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:

- [Git](https://git-scm.com/);
- [Java JDK](https://www.oracle.com/java/technologies/downloads/);
- [Apache Maven](https://maven.apache.org/guides/index.html).

<b>Dica:</b> Caso queira customizar o Projeto, é recomendado utilizar algum editor especializado em código como: [VSCode com Java](https://code.visualstudio.com/docs/languages/java) e [IntelliJ IDEA](https://www.jetbrains.com/pt-br/idea/download/).

### 📀 Para executar o Projeto:

1. Baixe este Repositório, executando o comando Git: `git clone https://github.com/aguiardafa/webflux-reactive-feign-vs-webclient`;
2. Execute o comando Maven `mvn clean install` pelo terminal, aberto na raiz da pasta do Repositório, para baixar as dependências do projeto através do Maven;
3. Ainda pelo terminal, aberto na raiz da pasta do Repositório, execute o comando Maven `mvn spring-boot:run` para executar a aplicação; e
4. Acesse a url `http://localhost:8080/entregas` pelo navegador para visualizar o Sistema.
   - <b>Obs.: </b>Após executar o passo 3, a mensagem que aparece no final da execução no terminal será <b>"Netty started on port 8080"</b>, que significa que a Aplicação Web foi inciada e está acessível na porta 8080.
   - <b>Dica 1: </b>Caso queira uma melhor experiência de acesso aos Endpoints da API, é recomendado utilizar algum API Client, que facilita a interação e visualização de APIs. Exemplo o [Postman](https://www.getpostman.com/).
   - <b>Dica 2: </b>Importe o arquivo `StarWars API.postman_collection.json` no Postman, que todos Endpoints da API serão disponibilizados para interação.

### 🛠 Tecnologias utilizadas:

As seguintes ferramentas foram usadas na construção do projeto:

- [Spring](https://spring.io/)
- [Lombok](https://projectlombok.org/)
- [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/2.7.4/reference/htmlsingle/#web.reactive)
- [Reactive feign](https://github.com/PlaytikaOSS/feign-reactive)
- [Springdoc-openapi](https://springdoc.org/)

## 👨‍💻Autor

<a href="https://github.com/aguiardafa" style="text-decoration: none;">
<img style="border-radius: 50% !important;" src="https://avatars.githubusercontent.com/u/16319889?v=4" width="48px" height="48px" alt="Diego Aguiar"/>
<br />
<span> Feito por Diego Aguiar 👋 Entre em contato! </span> 
</a>

