/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author peter
 */
@Named
@RequestScoped
public class RadioMBean {
    private String game;
    
    public String getGame() {
        return this.game;
    }
    public void setGame(final String game) {
        this.game = game;
    }
}
