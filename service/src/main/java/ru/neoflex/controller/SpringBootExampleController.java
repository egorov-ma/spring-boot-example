package ru.neoflex.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/example/v1")
public class SpringBootExampleController {

//    @GetMapping("/test")
//    private Mono<String> getTest() {
//        return Mono.just("test - getTest");
//    }
//
//    @PostMapping("/test/{param}")
//    private Flux<String> postTest(
//            @PathVariable String input,
//            @RequestBody String body,
//            @RequestParam String param
//    ) {
//        return Flux.just("test1 ", "test2 ", "test3" + input);
//    }

    @GetMapping("/test")
    private Mono<String> getTestRequestParam(
            @RequestParam String input
    ) {
        return Mono.just("test1 " + input);
    }

    @GetMapping("/test/{input}")
    private Mono<String> getTestPathParam(
            @PathVariable String input
    ) {
        return Mono.just("test2 " + input);
    }
}
