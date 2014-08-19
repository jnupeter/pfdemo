/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package au.edu.qtac.pfdemo.component;

import java.io.IOException;
import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

/**
 *
 * @author peter
 */
@FacesComponent("components.MyComponent")
public class MyComponent extends UIComponentBase {

    @Override
    public String getFamily() {
        return "com.seamlesstel.component";
    }
    
    @Override
    public void encodeBegin(FacesContext context) throws IOException {
        String value = (String) this.getAttributes().get("value");
        
        if(value != null) {
            ResponseWriter writer = context.getResponseWriter();
            StringBuffer sb = new StringBuffer();
            sb.append("<div class=mycomponent>");
            sb.append(value.toUpperCase());
            sb.append("</div>");
            writer.write(sb.toString());
        }
    }
    
}
