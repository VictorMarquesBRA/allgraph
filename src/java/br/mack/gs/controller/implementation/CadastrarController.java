/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.controller.implementation;

import br.mack.gs.controller.AbstractController;
import br.mack.gs.entity.UserAllGraph;
import br.mack.gs.persistence.UserAllGraphDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author henrique
 */
public class CadastrarController extends AbstractController {

    UserAllGraphDAO userAllGraphDAO = lookupUserAllGraphDAOBean();
    
    @Override
    public void execute() {
        String username = this.getRequest().getParameter("username"),
               name = this.getRequest().getParameter("name"),
               email = this.getRequest().getParameter("email"),
               password = this.getRequest().getParameter("password"),
               password_to_verify = this.getRequest().getParameter("password_to_verify");
        
        if(password.equals(password_to_verify) && password != null && username != null && name != null && email != null) {
            UserAllGraph userag = new UserAllGraph();
            userag.setName(name);
            userag.setUsername(username);
            userag.setEmail(email);
            userag.setPassword(password);
            
            UserAllGraph userExistente = userAllGraphDAO.getByEmail(email);
            if(userExistente == null) {
                userAllGraphDAO.inserir(userag);
                UserAllGraph usuarioInserido = userAllGraphDAO.getByEmail(email);
                this.getRequest().getSession().setAttribute("user", usuarioInserido);
                this.setResponsePage(this.getRequest().getContextPath() + "/user/feed.jsp");                
            } else {
                this.getRequest().getSession().setAttribute("error", "Usuário já cadastrado");
                this.setResponsePage(this.getRequest().getContextPath() + "index.jsp");
            }            
        } else {
            this.getRequest().getSession().setAttribute("error", "Há campos em branco ou senhas não são iguais");
            this.setResponsePage(this.getRequest().getContextPath() + "index.jsp");
        }
        
    }

    private UserAllGraphDAO lookupUserAllGraphDAOBean() {
        try {
            Context c = new InitialContext();
            return (UserAllGraphDAO) c.lookup("java:global/allgraph/UserAllGraphDAO!br.mack.gs.persistence.UserAllGraphDAO");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
    
}