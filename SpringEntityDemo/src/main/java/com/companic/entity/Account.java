package com.companic.entity;

import org.springframework.stereotype.Component;

@Component
public class Account {

    private String email;
    private String login;
    private String password;

    public Account(String email, String login, String password) {
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override public String toString() {
        return "Account{" + "email='" + email + '\'' + ", login='" + login + '\'' + ", password='" + password + '\''
                       + '}';
    }
}
