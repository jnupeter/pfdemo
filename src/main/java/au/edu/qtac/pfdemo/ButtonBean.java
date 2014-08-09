/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

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
public class ButtonBean {
    public void addMessage() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Hello"));
    }
}
