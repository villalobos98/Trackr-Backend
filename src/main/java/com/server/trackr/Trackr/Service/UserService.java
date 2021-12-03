package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.User;

public interface UserService {
    String saveUser(User user);

    String logoutUser(User user);

    User findUserByEmail(String email);

}
