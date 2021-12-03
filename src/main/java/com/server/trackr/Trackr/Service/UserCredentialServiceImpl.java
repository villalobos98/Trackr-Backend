package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.Credential;
import com.server.trackr.Trackr.Entities.User;
import com.server.trackr.Trackr.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCredentialServiceImpl implements UserCredentialService {

    @Autowired
    UserRepository repo;

    @Override
    public String logoutUser(User user) {
        Integer userID = user.getUserID();
        User existingUser = repo.findById(userID).get();
        existingUser.setStatus(false);
        repo.save(user);
        return "USER LOGGED OUT";
    }

    @Override
    public String loginUser(Credential credential) {
        return null;
    }


}
