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
import javax.inject.Named;
import org.primefaces.event.ReorderEvent;

/**
 *
 * @author peter
 */
@Named
@SessionScoped
public class DataTableController implements java.io.Serializable {
    
    private List<User> users;
    private User selectedUser;
    
    public List<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(final List<User> users) {
        this.users = users;
    }
    
    public User getSelectedUser() {
        return this.selectedUser;
    }
    
    public void setSelectedUser(final User selectedUser) {
        this.selectedUser = selectedUser;
    }
    
    @PostConstruct
    public void init() {
        users = new ArrayList<User>();
        users.add(new User(1, "Peter", "Cai1", 1));
        users.add(new User(2, "Peter", "Cai2", 2));
        users.add(new User(3, "Peter", "Cai3", 3));
        users.add(new User(4, "Peter", "Cai4", 4));
        users.add(new User(5, "Peter", "Cai5", 5));
        users.add(new User(6, "Peter", "Cai6", 6));
    }
    
    public void onReorder(ReorderEvent e) {
//        System.out.println("selected user id:" + this.selectedUser.getId());
        System.out.println("from:" + e.getFromIndex() + " to "+ e.getToIndex());
        System.out.println("event source:" + e.getSource().getClass().getName());
    }
}
