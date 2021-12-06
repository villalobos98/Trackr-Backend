package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.UserProfile;

public interface AdminControlService {
    UserProfile findUserByEmail(String email);
    UserProfile findUserByID(Integer userID);

}
