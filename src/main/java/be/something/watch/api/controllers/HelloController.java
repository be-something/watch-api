package be.something.watch.api.controllers;

import be.something.watch.api.dto.HelloMessageDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    @GetMapping
    public HelloMessageDto get() {
        var dto = new HelloMessageDto();
        dto.setMessage("Hello!");
        return dto;
    }

}
