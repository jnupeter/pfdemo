/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

/**
 *
 * @author peter
 */
@Named("testBean")
@RequestScoped
public class TestBean {
    @Size(min=2,max=5)
    private String name;
    @Min(10) @Max(25)
    private int age;
    
    public String getName() {
        return this.name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(final int age) {
        this.age = age;
    }
}
