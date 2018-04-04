package com.sung;

import java.util.ArrayList;

public class MapleStory {
    private ArrayList<User> userList = new ArrayList<User>();
    private String server;

    public MapleStory(String server) {
        this.server = server;
    }

    public boolean addNewUser(User user){
        if(findUser(user)){
            System.out.println("Already registered fucker");
            return false;
        }
        userList.add(user);
        return true;
    }


    public boolean addNewUser(String userName, String password){
        if(findUser(userName)){
            System.out.println("Already registered fucker");
            return false;
        }
        User newUser = User.createUser(userName,password);
        userList.add(newUser);
        return true;
    }

    public void updateUser(User olduser, User newUser){
        if(findUser(olduser)){
            System.out.println("We found your account");
            int position = findUserIndex(olduser);
            userList.set(position,newUser);
        }
        else{
            System.out.println("We are not able to find your user account");
        }
    }

    public void updateUser(String userName, User newUser){
        User existingUser = queryUser(userName);
        if(existingUser == null){
            System.out.println("Your account does not exist");
        }
        else{
            updateUser(existingUser, newUser);
        }
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void updateUser(String userName, String newPassword){
        User existingUser = queryUser(userName);
        if(existingUser == null){
            System.out.println("Your account does not exist");
        }
        else{
            User newUser = User.createUser(userName,newPassword);
            updateUser(existingUser,newUser);
        }
    }

    public void removeUser(User user){
        System.out.println("user is removed");
        userList.remove(user);
    }

    public void removeUser(String userName){
       User existingUser = queryUser(userName);
       if(existingUser == null){
           System.out.println("Your user account is not even  registered, man");
       }
       int position = findUserIndex(existingUser);
       removeUser(existingUser);
    }

    private int findUserIndex(User user){
        return userList.indexOf(user);
    }


    private boolean findUser(User user){
      return userList.indexOf(user) >=0 ? true : false;
    }

    private boolean findUser(String userName){
        User existingUser;
        existingUser = queryUser(userName);
        if(existingUser == null){
            return false;
        }
        return true;
    }

    public User queryUser(String userName){
        return  userList.stream()
                .filter(user -> user.getUserName().equals(userName))
                .findFirst()
                .orElse(null);
    }
}
