package com.example.demo;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping("/api")
public class AddressBookResource {
    ConcurrentHashMap<String, Contact> contacts = new ConcurrentHashMap<String, Contact>();

    @GetMapping("/{id}")
    @ApiOperation(value="id of existing records",notes = "provide an id and view its record",response = Contact.class)
    public Contact getContact(@ApiParam(value = "api param value test",required = true) @PathVariable String id) {

        return contacts.get(id);
    }

    @GetMapping("/")
    public List<Contact> getAllContacts() {
return new ArrayList<Contact>(contacts.values());
    }

    @PostMapping("/")
    public Contact getContact(@RequestBody Contact contact) {
        contacts.put(contact.getId(), contact);
        return contact;
    }
}
