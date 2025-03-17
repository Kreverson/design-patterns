package org.patterns;

import java.util.UUID;

public class User implements Prototype {

    private UUID id;
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    private User(User user) {
        this.id = user.id;
        this.username = user.username;
        this.email = user.email;
        this.password = user.password;
    }

    @Override
    public Prototype clone() {
        return new User(this);
    }
}
