package com.example.springsocial.security.oauth2.user;

import java.util.Map;

public class AliyunOAuth2UserInfo extends OAuth2UserInfo {

    public AliyunOAuth2UserInfo(Map<String, Object> attributes) {
        super(attributes);
    }

    @Override
    public String getId() {
        return (String)attributes.get("requestid");
    }

    @Override
    public String getName() {
        return (String) attributes.get("name");
    }

    @Override
    public String getEmail() {
        return (String)attributes.get("login_name");
    }

    @Override
    public String getImageUrl() {
        return null;
    }
}
