package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.User;
import com.server.trackr.Trackr.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository repo;

    @Override
    public String saveUser(User user) {
        repo.save(user);
        return "USER SAVED";
    }

    @Override
    public String logoutUser(User user) {
        String email = user.getEmail();
        User existingUser = repo.findUserByEmail(email);
        existingUser.setStatus(false);
        repo.save(user);
        return "USER LOGGED OUT";
    }

    @Override
    public User findUserByEmail(String email) {
        User user = repo.findUserByEmail(email);
        return user;
    }

}
