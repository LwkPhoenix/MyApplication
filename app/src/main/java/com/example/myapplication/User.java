package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    // Static method to simulate a list of valid users
    public static List<User> getUserList() {
        List<User> users = new ArrayList<>();
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));
        users.add(new User("admin", "admin123"));
        return users;
    }

    // Static method to validate the user login
    public static boolean validateUser(String username, String password) {
        for (User user : getUserList()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}