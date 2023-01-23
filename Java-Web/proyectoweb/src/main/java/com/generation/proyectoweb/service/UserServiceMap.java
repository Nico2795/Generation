package com.generation.proyectoweb.service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.generation.proyectoweb.model.User;
@Primary
@Service
public class UserServiceMap implements UserService {
    private Map <Integer, User> userMap = new HashMap<Integer,User>();
    private List <User> userList = new ArrayList<User>(userMap.values());
    public UserServiceMap(){
    }
    @Override
    public List <User> getAll() {
        userMap.forEach((k, v) -> userList.add(v));
        return userList;
    }
    @Override
    public void add(User user) {
        userMap.put(user.getId(), user);
    }
    @Override
    public void remove(int user) {
        userMap.remove(user);
    }
    @Override
    public int size() {
        return userMap.size();
    }
    @Override
    public User getUser(int position) {
        return userMap.get(position);

    
    
}
}