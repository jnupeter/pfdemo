/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import org.primefaces.push.annotation.OnClose;
import org.primefaces.push.annotation.OnMessage;
import org.primefaces.push.annotation.OnOpen;
import org.primefaces.push.annotation.PushEndpoint;
import org.primefaces.push.impl.JSONEncoder;

/**
 *
 * @author peter
 */
@PushEndpoint("/count")
public class CounterResource {
    
    @OnOpen
    public void onOpen() {
       System.out.println("a cliet is connected.");
    }
    
    @OnMessage(encoders = {JSONEncoder.class})
    public String onMessage(String count) {
        System.out.println("count:" + count);
        return count;
    }
    
    @OnClose
    public void onClose() {
        System.out.println("a client is disconnected.");
    }
}
