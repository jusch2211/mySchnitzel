package de.myschnitzel.authentication;

import java.io.Serializable;

/**
 * Created by Jusch on 07.05.2016.
 */
public class User implements Serializable{


    private static final long serialVersionUID = -6336777033142296182L;
    private String name = "UNKNOW";
    private String password = "UNKNOW";

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
