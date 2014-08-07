/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author peter
 */
@Named
@RequestScoped
public class OrderListController {
    
    private List<String> cities;
    public List<String> getCities() {
        return this.cities;
    }
    
    @PostConstruct
    public void init() {
        cities = new ArrayList<String>();
        cities.add("Brisbane");
        cities.add("Sydney");
        cities.add("Adaleide");
    }
}
