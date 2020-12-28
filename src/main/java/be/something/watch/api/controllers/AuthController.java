package be.something.watch.api.controllers;

import be.something.watch.api.dto.UserDto;
import be.something.watch.core.models.UserEntity;
import be.something.watch.core.repositories.UserRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController("/auth")
public class AuthController {

    private final UserRepository repository;

    public AuthController(UserRepository repository) {
        this.repository = repository;
    }

    @PreAuthorize("isAnonymous()")
    @PostMapping("/signup")
    public void signup() {
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/signin")
    public void signin() {
    }

}
