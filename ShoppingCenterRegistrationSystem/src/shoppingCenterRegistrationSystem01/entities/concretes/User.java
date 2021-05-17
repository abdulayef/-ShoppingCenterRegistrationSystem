package shoppingCenterRegistrationSystem01.entities.concretes;

import shoppingCenterRegistrationSystem01.entities.abstracts.Entities;

public class User implements Entities {

    private String fisrtName;
    private String lastName;
    private String passWord;
    private String mail;

    public User(String fisrtName, String lastName, String passWord, String mail) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.passWord = passWord;
        this.mail = mail;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
    
}
