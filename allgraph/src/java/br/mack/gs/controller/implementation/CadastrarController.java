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
public class CadastrarController extends AbstractController {

    @Override
    public void execute() {
        String username = this.getRequest().getParameter("username"),
               name = this.getRequest().getParameter("name"),
               email = this.getRequest().getParameter("email"),
               password = this.getRequest().getParameter("password"),
               password_to_verify = this.getRequest().getParameter("password_to_verify");
        
        if(password.equals(password_to_verify)) {
            UserAllGraph userag = new UserAllGraph();
            userag.setName(name);
            userag.setUsername(username);
            userag.setEmail(email);
            userag.setPassword(password);
            
            // Código para checar se usuário já está cadastrado
            
            this.getRequest().getSession().setAttribute("user", userag);
            this.setResponsePage("index.jsp");
        }
        
    }
    
    
}