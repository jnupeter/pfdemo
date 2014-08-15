/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import au.edu.qtac.pfdemo.model.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;

/**
 *
 * @author peter
 */
@Named
@SessionScoped
public class OrderListController implements java.io.Serializable {
    
    private List<String> cities;
    public List<String> getCities() {
        return this.cities;
    }
    public void setCities(final List<String> cities) {
        this.cities = cities;
    }
    
    private List<User> users;
    public List<User> getUsers() {
        return this.users;
    }
    public void setUsers(final List<User> users) {
        this.users = users;
    }
    
    @PostConstruct
    public void init() {
        System.out.println("=====new instance created=======");
        cities = new ArrayList<String>();
        cities.add("Brisbane");
        cities.add("Sydney");
        cities.add("Adaleide");
        
        users = new ArrayList<User>();
        users.add(new User(1, "Peter", "Cai1", 1));
        users.add(new User(2, "Peter", "Cai2", 2));
        users.add(new User(3, "Peter", "Cai3", 3));
        users.add(new User(4, "Peter", "Cai4", 4));
        users.add(new User(5, "Peter", "Cai5", 5));
        users.add(new User(6, "Peter", "Cai6", 6));
    }
    
    public void change() {
        System.out.println("change.....");
    }
    
    public void change(final ValueChangeEvent e){
        System.out.println("event fired....");
        List<String> oldvalue = (List<String>) e.getOldValue();
        List<String> newvalue = (List<String>) e.getNewValue();
        System.out.println("oldsize:" + oldvalue.size());
        for(String s : oldvalue) {
            System.out.println(s);
        }
        System.out.println("newsize:" + newvalue.size());
        for(String s: newvalue) {
            System.out.println(s);
        }
    }
}
