/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chat;

/**
 *
 * @author Administrator
 */
public class Client {

    private String name;

  // Constructor with a parameter
    public Client(String name, String user_name, String user_pass) {
        this.name = name;
        this.user_name = user_name;
        this.user_pass = user_pass;
    }
//Get & Set
//get method returns the value of the variable name.
//set method takes a parameter (newName) and assigns it to the name variable
public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }
    private String user_name; //private = restricted access
    private String user_pass;
}
