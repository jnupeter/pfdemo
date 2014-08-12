/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *  See http://www.byteslounge.com/tutorials/java-ee-cdi-conversationscoped-example
 * It demonstrates the usage of ConversationScoped bean.
 * @author peter
 */
@Named
@ConversationScoped
public class PollingBean implements java.io.Serializable {
    private int count;
    
    @Inject
    private Conversation c;
    
    @PostConstruct
    public void init() {
        System.out.println("=====new Bean instances created======");
    }
    
    public void startConversation() {
       System.out.println("=====in startConversation method");
       if(!FacesContext.getCurrentInstance().isPostback() && c.isTransient()) {
            System.out.println("===start a long conversation==");
           c.begin();
           System.out.println("cid=" + c.getId());
       }   
    }

    public void doIt() {
        count++;
        System.out.println(this.hashCode() + "count:" + count);
    }
    
    public void endConversation() {
        if(!c.isTransient()) {
            c.end();
            System.out.println("cid=" + c.getId() + ", ended.");
        }
    }
}
