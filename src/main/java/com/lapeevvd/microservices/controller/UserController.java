package com.lapeevvd.microservices.controller;

import com.lapeevvd.microservices.exception.ApplicationException;
import com.lapeevvd.microservices.model.User;
import com.lapeevvd.microservices.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable @NotNull Long id) {
        try {
            User user = userService.getUser(id);
            return ResponseEntity.ok(user);
        } catch (ApplicationException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Long> createUser(@RequestBody User user) {
        Long id = userService.createUser(user).getId();
        return ResponseEntity.ok(id);
    }

    @PutMapping("/{id}")
    public void editUser(@PathVariable @NotNull Long id, @RequestBody User user) {
        userService.editUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable @NotNull Long id) {
        userService.deleteUser(id);
    }
}
