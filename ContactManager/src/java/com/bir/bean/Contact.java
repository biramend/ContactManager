/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bir.bean;

/**
 *
 * @author c
 */
public class Contact {
    private String fistname;
    private String lastname;
    private String phone;
    private String email;
    private String address;

    public Contact(String fistname, String lastname, String phone, String email, String address) {
        this.fistname = fistname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String Dispalays(){
        return " Prenom :"+fistname+ " Nom :"+lastname+ " Numéro :" +phone+ " Email :"+email+ " Adresse :"+address;
    }
    
}
