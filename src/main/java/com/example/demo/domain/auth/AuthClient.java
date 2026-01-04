package com.example.demo.domain.auth;

public class AuthClient {
    private String clientId;
    private String password;
    private String[] roles;

    public AuthClient() {
    }

    public AuthClient(String clientId, String password, String[] roles) {
        this.clientId = clientId;
        this.password = password;
        this.roles = roles;
    }

    public String getClientId() {
        return clientId;
    }

    public String password() {
        return password;
    }

    public String[] getRoles() {
        return roles;
    }

}
