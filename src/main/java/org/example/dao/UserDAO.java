package org.example.dao;

import org.example.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {
    private static int userCount;
    private List<User> users;

    public UserDAO() {
        users = new ArrayList<>();
        users.add(new User(++userCount, "Vasya", 21, "vsl@gmail.com"));
        users.add(new User(++userCount, "Vika", 19, "cherry@gmail.com"));
        users.add(new User(++userCount, "Kolya", 23, "kolyan@gmail.com"));
        users.add(new User(++userCount, "Grisha",33, "skovoroda@gmail.com"));
    }
    public void save(User user){
        user.setId(++userCount);
        users.add(user);
    }

    public List<User> index(){
        return users;
    }
    public User show(int id){
        return users.stream()
                .filter(user -> user.getId() == id)
                .findAny()
                .orElse(null);
    }
    public void updateUser(int id, User updatedUser){
        User userToUpdate = show(id);
        userToUpdate.setName(updatedUser.getName());
        userToUpdate.setEmail(updatedUser.getEmail());
        userToUpdate.setAge(updatedUser.getAge());
    }
    public void delete(int id){
        users.removeIf(p -> p.getId() == id);
    }
}

