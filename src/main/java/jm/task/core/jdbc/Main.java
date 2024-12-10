package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userTest = new UserServiceImpl();
        userTest.createUsersTable();

        userTest.saveUser("Maria", "Petrova", (byte)22);
        userTest.saveUser("Vlad", "Makarov", (byte)41);
        userTest.saveUser("Dominik", "Toretto", (byte)45);
        userTest.saveUser("Natasha", "Romanova", (byte)23);

        List<User> usersList = userTest.getAllUsers();
        for (User user : usersList) {
            System.out.println(user.toString());
        }

        userTest.cleanUsersTable();
        userTest.dropUsersTable();
    }
}
