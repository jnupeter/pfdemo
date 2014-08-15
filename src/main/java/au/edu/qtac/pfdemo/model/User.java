/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo.model;

/**
 *
 * @author peter
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private int sequence;
    
    public User(int id, String firstName, String lastName, int sequence) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sequence = sequence;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
    public int getSequence() {
        return this.sequence;
    }
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
