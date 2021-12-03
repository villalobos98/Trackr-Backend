package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.User;
import com.server.trackr.Trackr.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminServiceImpl implements AdminControlService{
    @Autowired
    UserRepository repo;

    @Override
    public User findUserByEmail(String email) {
        User user = repo.findUserByEmail(email);
        return user;
    }

    @Override
    public User findUserByID(Integer userID) {
        User user = repo.findById(userID).get();
        return user;
    }
}
