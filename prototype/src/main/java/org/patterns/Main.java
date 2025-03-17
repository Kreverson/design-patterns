package org.patterns;

import org.patterns.domain.Button;
import org.patterns.domain.User;
import org.patterns.prototype.PrototypeRegistry;

public class Main {
    public static void main(String[] args) {

        User user = new User(
                "username1",
                "1@11.com.br",
                "Ys!ao2");

        User userClone = (User) user.clone();

        System.out.println(user);
        System.out.println(userClone);


        Button confirmButton = new Button(10, 20, "green");
        Button deleteButton = new Button(10, 30, "red");

        PrototypeRegistry registry = new PrototypeRegistry();
        registry.addItem("confirmButton", confirmButton);
        registry.addItem("deleteButton", deleteButton);

        System.out.println(registry.getById("confirmButton"));
        System.out.println(registry.getById("deleteButton"));
    }
}