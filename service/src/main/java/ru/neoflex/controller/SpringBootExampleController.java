package ru.neoflex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.neoflex.MessageService;
import ru.neoflex.domain.Message;

@RestController
@RequestMapping("/example/v1")
public class SpringBootExampleController {
    private final MessageService messageService;

    @Autowired
    public SpringBootExampleController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping
    public Flux<Message> list(
            @RequestParam(defaultValue = "0") Long start,
            @RequestParam(defaultValue = "0") Long count
    ) {
        return messageService.list();
    }

    @PostMapping
    public Mono<Message> add(@RequestBody Message message) {
        return messageService.addOne(message);
    }

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
