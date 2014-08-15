/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo.converter;

import au.edu.qtac.pfdemo.model.User;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author peter
 */
@FacesConverter("userconverter")
public class UserConverter implements Converter{

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("value is:" + value);
        int id = Integer.parseInt(value);
        return new User(id, "peter", "cccc"+value , id);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        User u = (User) value;
        return String.valueOf(u.getId());
    }
    
}
