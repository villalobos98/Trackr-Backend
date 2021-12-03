package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.Credential;
import com.server.trackr.Trackr.Entities.User;

public interface UserCredentialService {

    String logoutUser(User user);

    String loginUser(Credential credential);

}
