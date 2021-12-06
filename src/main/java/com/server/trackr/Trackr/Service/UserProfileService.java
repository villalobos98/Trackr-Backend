package com.server.trackr.Trackr.Service;

import com.server.trackr.Trackr.Entities.UserProfile;

public interface UserProfileService {
    String deleteProfile(UserProfile userProfile);

    String saveProfile(UserProfile userProfile);

    String updateProfile(UserProfile userProfile);
}
