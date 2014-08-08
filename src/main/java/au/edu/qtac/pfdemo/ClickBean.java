/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import org.primefaces.push.EventBus;
import org.primefaces.push.EventBusFactory;

/**
 *
 * @author peter
 */
@Named
@SessionScoped
public class ClickBean implements java.io.Serializable {
    private volatile int count;
    public void setCount(final int count) {
        this.count = count;
    }
    public int getCount() {
        return this.count;
    }
    public void increment() {
        count++;
        System.out.println(this.hashCode() + " : " + String.valueOf(count));

        EventBus eventBus = EventBusFactory.getDefault().eventBus();
        eventBus.publish("/count", String.valueOf(count));
    }
}
