package com.aniks.awsimageupload.datastore;

import com.aniks.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "chiazormartins", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "anyanwuosundu", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "chiazormartins", null));
    }

    public static List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
