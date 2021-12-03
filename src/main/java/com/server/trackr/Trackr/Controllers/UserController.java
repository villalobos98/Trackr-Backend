package com.server.trackr.Trackr.Controllers;

import com.server.trackr.Trackr.Entities.User;
import com.server.trackr.Trackr.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/up")
    public ResponseEntity<String> heartBeat(){
        return new ResponseEntity<>("API is UP", HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody User user) {
        service.saveUser(user);
        return new ResponseEntity<>("User saved", HttpStatus.OK);
    }

    @GetMapping("/find/{email}")
    public ResponseEntity<User> findUser(@PathVariable String email) {
        User user = service.findUserByEmail(email);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody User user) {
        service.saveUser(user);
        return new ResponseEntity<>("User saved", HttpStatus.OK);
    }

}
