package com.crm.crm.model;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.Collection;
import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class ContactController {
    private ContactRepository contactRepository;

    public ContactController(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

    @GetMapping("/contacts")
    Collection<Contact> contacts() {
        return (Collection<Contact>) contactRepository.findAll();
    }

    @PostMapping("/contacts")
    ResponseEntity<Contact> creatContact(@Valid @RequestBody Contact contact) throws URISyntaxException {
        Contact result = contactRepository.save(contact);
        return ResponseEntity.ok().body(result);
    }
}
