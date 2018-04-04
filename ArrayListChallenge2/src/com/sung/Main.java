package com.sung;

import java.util.ArrayList;

public class Main {
    private static MapleStory Korean_MapleStory = new MapleStory("Skandia");

    public static void main(String[] args) {
        addUser("tjdalsvndn9", "'westman123'");
        getUsers();
        updateUser("tjdalsvndn9","adsfadsfads");
        getUsers();
    }

    public static void addUser(String userName, String password){
        User newUser = User.createUser(userName,password);
        boolean userAdded = Korean_MapleStory.addNewUser(newUser);
        String info = userAdded ? "Your account is added" : "You already have an account";
        console(info);
    }


    public static void updateUser(String userName, String newPassword){
        Korean_MapleStory.updateUser(userName,newPassword);
    }

    public static void deleteUser(String userName){
        Korean_MapleStory.removeUser(userName);
    }

    public static void getUsers(){
       ArrayList<User> userList =  Korean_MapleStory.getUserList();
       userList.forEach(user -> console(user));
    }

    public static void console(User sen){
        System.out.println("User " + sen.getUserName() + " is succesfully added here");
        System.out.println("User's password is " + sen.getPassword());
    }

    public static void console(String sen){
        System.out.println(sen);
    }
}
