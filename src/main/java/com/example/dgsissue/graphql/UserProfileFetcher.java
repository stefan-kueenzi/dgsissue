package com.example.dgsissue.graphql;

import com.example.dgsissue.model.UserProfileDgs;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.extern.slf4j.Slf4j;

@DgsComponent
@Slf4j
public class UserProfileFetcher {


    @DgsQuery
//    @PreAuthorize("isAuthenticated()")
    public UserProfileDgs currentUserProfile() {
        log.info("user profile requested");
        return UserProfileDgs.builder().userRealm("test").build();
    }

}
