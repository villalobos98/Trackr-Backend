package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.Admin;
import com.server.trackr.Trackr.Entities.UserProfile;
import com.server.trackr.Trackr.Repository.AdminRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class AdminServiceImpl implements AdminControlService{
    @Autowired
    AdminRepository repo;

    @Override
    public UserProfile findUserByEmail(String email) {
        UserProfile userProfile = repo.findUserByEmail(email);
        return userProfile;
    }

    @Override
    public UserProfile findUserByID(Integer userID) {
        UserProfile userProfile = repo.findUserByID(userID);
        return userProfile;
    }
}
