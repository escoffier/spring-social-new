package com.example.springsocial.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.client.registration.ClientRegistration;
//import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
//import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
//import org.springframework.security.oauth2.core.AuthorizationGrantType;
//import org.springframework.security.oauth2.core.ClientAuthenticationMethod;
//import org.springframework.security.oauth2.core.oidc.IdTokenClaimNames;
//
//@Configuration
//public class AliyunOAuth2Provider {
//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository() {
//        return new InMemoryClientRegistrationRepository(this.aliyunClientRegistration());
//    }
//
//    private ClientRegistration aliyunClientRegistration() {
//        return ClientRegistration.withRegistrationId("aliyun")
//                .clientId("4833972281953127112")
//                .clientSecret("K3R3Ac9934Fl6mammbQcUBOFuif0VApxdyRNllsx6xym4r81yb0eAQIWK9Y8yRvq")
//                .clientAuthenticationMethod(ClientAuthenticationMethod.BASIC)
//                .authorizationGrantType(AuthorizationGrantType.AUTHORIZATION_CODE)
//                .redirectUriTemplate("{baseUrl}/oauth2/callback/{registrationId}")
////                .scope("openid", "profile", "email", "address", "phone")
//                .authorizationUri("https://signin.aliyun.com/oauth2/v1/auth")
//                .tokenUri("https://oauth.aliyun.com/v1/token")
//                .userInfoUri("https://oauth.aliyun.com/v1/userinfo")
//                .userNameAttributeName(IdTokenClaimNames.SUB)
////                .jwkSetUri("https://www.googleapis.com/oauth2/v3/certs")
//                .clientName("aliyun")
//                .build();
//    }
//}
