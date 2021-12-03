package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.User;

public interface AdminControlService {
    User findUserByEmail(String email);
    User findUserByID(Integer userID);

}
