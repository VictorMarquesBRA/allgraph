/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.controller.implementation;

import br.mack.gs.controller.AbstractController;
import br.mack.gs.entity.UserAllGraph;

/**
 *
 * @author henrique
 */
public class LoginController extends AbstractController {

    @Override
    public void execute() {
        String email = this.getRequest().getParameter("email"),
               password = this.getRequest().getParameter("password");
        
        // Checar se usuário está no banco de dados
        
        UserAllGraph userag = new UserAllGraph();
        userag.setEmail(email);
        userag.setId_userallgraph(0);
        userag.setName("Undefined");
        userag.setPassword(password);
        userag.setUsername("none");
        
        this.getRequest().getSession().setAttribute("user", userag);
        this.setResponsePage(this.getRequest().getContextPath() + "/user/feed.jsp");
    }
    
}
