package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.Credential;
import com.server.trackr.Trackr.Entities.UserProfile;

public interface UserCredentialService {

    String logoutUser(UserProfile userProfile);

    String loginUser(Credential credential);

    String forgetPassword(String email);

}
