/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo.login;

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
    public void login() {
        FacesContext context = FacesContext.getCurrentInstance();
        FacesMessage msg;
        if ("peter".equalsIgnoreCase(username) && "iampeter".equals(password)) {
            msg = new FacesMessage("login successfully");
            msg.setSeverity(FacesMessage.SEVERITY_INFO);
        } else {
            msg = new FacesMessage("login error");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
        }
        context.addMessage(null, msg);
    }
}
