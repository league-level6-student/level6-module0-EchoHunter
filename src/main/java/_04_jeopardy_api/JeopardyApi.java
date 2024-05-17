package _04_jeopardy_api;

import _04_jeopardy_api.data_transfer_objects.Clue;
import _04_jeopardy_api.data_transfer_objects.Clue2;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
Now lets use a Jeopardy API to make a (modified) game.
To simplify things a little bit, we will just ask the user one question from each available point category
 */

public class JeopardyApi {

    private final WebClient webClient;

    private static final String baseUrl = "https://opentdb.com/api.php";

    public JeopardyApi() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public Clue2 getClue(int value) {

        //1  Use the WebClient code from the previous exercises to make the request:
        //Note:
        //The base URL has already been provided, but we we need to take the "value" parameter passed into
        //this method and supply it as a query parameter with the name of "value".  This allows us to retrieve a question
        //with the specified point value.
        //
        //Make sure to save the response as type Clue[].class in the bodyToMono() method call
       Mono<Clue2[]> clues = webClient.get()
                .uri(uriBuilder -> uriBuilder
                                .queryParam("amount", value)
                        .build()
                ).retrieve()
                .bodyToMono(Clue2[].class);

       Clue2[] bigClue = clues.block();
        //2
        //Get a random number less than the size of the Clue array
        int randNum = (int) (Math.random() * bigClue.length);
        //3
        //return the clue at the random index you just created
        return bigClue[randNum];
    }
}
