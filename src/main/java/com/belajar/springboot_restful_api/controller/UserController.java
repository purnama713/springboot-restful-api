package com.belajar.springboot_restful_api.controller;

import com.belajar.springboot_restful_api.entity.User;
import com.belajar.springboot_restful_api.model.RegisterUserRequest;
import com.belajar.springboot_restful_api.model.UpdateUserRequest;
import com.belajar.springboot_restful_api.model.UserResponse;
import com.belajar.springboot_restful_api.model.WebResponse;
import com.belajar.springboot_restful_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // Register user
    @PostMapping(
            path = "/api/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> register(@RequestBody RegisterUserRequest request) {
        userService.register(request);
        return WebResponse.<String>builder().data("OK").build();
    }

    // Get user data
    // Kalo ada parameter user: cek header
    // Kalo ternyata ada: ambil dari database
    // Kalo tidak ada: unauthorized
    @GetMapping(
            path = "/api/users/current",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<UserResponse> get(User user) {
        UserResponse userResponse = userService.get(user);
        return WebResponse.<UserResponse>builder().data(userResponse).build();
    }

    // Update user data
    @PatchMapping(
            path = "/api/users/current",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<UserResponse> update(User user, @RequestBody UpdateUserRequest request) {
        UserResponse userResponse = userService.update(user, request);
        return WebResponse.<UserResponse>builder().data(userResponse).build();
    }
}
