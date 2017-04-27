/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.controller.implementation;

import br.mack.gs.controller.AbstractController;

/**
 *
 * @author henrique
 */
public class LogoutController extends AbstractController {

    @Override
    public void execute() {
        this.getRequest().getSession().invalidate();
        this.setResponsePage(this.getRequest().getContextPath() + "/index.jsp");
    }
    
}
