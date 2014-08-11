/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author peter
 */
@Named
@SessionScoped
public class PollingBean implements java.io.Serializable {
    private int count;
    
    public void doIt() {
        count++;
        System.out.println(this.hashCode() + "count:" + count);
    }
}
