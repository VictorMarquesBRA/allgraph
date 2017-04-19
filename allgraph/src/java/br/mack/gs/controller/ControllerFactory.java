/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique
 */
public class ControllerFactory {
    public static Controller getControllerByName(String name) {
        Controller controller = null;
        
        try {
            String controllerClassName = "br.mack.gs.controller.implementation."+ name +"Controller";
            
            controller = (Controller) Class.forName(controllerClassName).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException ex) {
            Logger.getLogger(ControllerFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return controller;
    }
}
