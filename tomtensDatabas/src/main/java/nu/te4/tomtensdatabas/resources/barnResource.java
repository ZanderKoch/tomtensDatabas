/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.tomtensdatabas.resources;

import beans.BarnBean;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import entities.Child;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Zanders Koch
 */
@Path("barn")
public class BarnResource {
    @EJB
    private BarnBean bean;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    private Response addChild(Child child){
        
    }
}
