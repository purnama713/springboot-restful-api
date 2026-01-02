package com.belajar.springboot_restful_api.controller;

import com.belajar.springboot_restful_api.entity.User;
import com.belajar.springboot_restful_api.model.ContactResponse;
import com.belajar.springboot_restful_api.model.CreateContactRequest;
import com.belajar.springboot_restful_api.model.WebResponse;
import com.belajar.springboot_restful_api.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping(
            path = "/api/contacts",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<ContactResponse> create(User user, @RequestBody CreateContactRequest request) {
        ContactResponse contactResponse = contactService.create(user, request);
        return WebResponse.<ContactResponse>builder().data(contactResponse).build();
    }
}
