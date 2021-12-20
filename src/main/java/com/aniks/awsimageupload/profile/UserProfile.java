package com.aniks.awsimageupload.profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile {

    private UUID userProfileId;
    private String username;
    private String userProfileImageLink; // S3 key

    public Optional<String> getUserProfileImageLink() {
        return Optional.ofNullable( userProfileImageLink);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserProfile)) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(getUserProfileId(), (that.getUserProfileId())) &&
                Objects.equals(getUsername(), (that.getUsername())) &&
                Objects.equals(getUserProfileImageLink(), (that.getUserProfileImageLink()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserProfileId(), getUsername(), getUserProfileImageLink());
    }
}
