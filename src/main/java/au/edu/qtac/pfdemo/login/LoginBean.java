/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo.login;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author peter
 */
@Named
@RequestScoped
public class LoginBean {
    private String username;
    private String password;
    public String getUsername() {
        return this.username;
    }
    public void setUsername(final String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(final String password) {
        this.password = password;
    }
    
    public String login() {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg;
        if ("peter".equalsIgnoreCase(username) && "iampeter".equals(password)) {
            try {
                Thread.sleep(5000);  //slow login
            } catch (InterruptedException ex) {
                Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
            }
            return "index";
        } else {
            msg = new FacesMessage("login error");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            context.addMessage(null, msg);
            return null;
        }
        
    }
    
    public void ajaxLogin() {
        try {
            Thread.sleep(1000);
            if ("peter".equalsIgnoreCase(username) && "iampeter".equals(password)){
            Thread.sleep(5000);  //slow login
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(LoginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
