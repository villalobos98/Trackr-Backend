package com.server.trackr.Trackr.Controllers;

import com.server.trackr.Trackr.Entities.User;
import com.server.trackr.Trackr.Service.UserCredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")
@CrossOrigin(origins = "http://localhost:3000")
public class UserProfileController {
    @Autowired
    UserCredentialService service;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        service.saveUser(user);
        return new ResponseEntity<>("User saved", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody User user) {
        service.saveUser(user);
        return new ResponseEntity<>("User saved", HttpStatus.OK);
    }

}
