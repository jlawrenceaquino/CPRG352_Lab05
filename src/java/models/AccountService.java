/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class AccountService {

    public static User login(String username, String password) {
        if (username.equalsIgnoreCase("abe")
                && password.equalsIgnoreCase("password")) {
            User user = new User(username, password);
            return user;
        }
        if (username.equalsIgnoreCase("barb")
                && password.equalsIgnoreCase("password")) {
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }

    }
}