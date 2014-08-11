/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author peter
 */
@Named
@RequestScoped
public class AjaxStatusBean {
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public void doIt() {
        System.out.println("start to wait...");
        try {
            Thread.sleep(3 * 1000); //sleep 10 seconds
        } catch (InterruptedException ex) {
            Logger.getLogger(AjaxStatusBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("not waiting anymore.");
    }
    public String goMenu() {
        return "menu.xhtml?faces-redirect=true";
    }
}
