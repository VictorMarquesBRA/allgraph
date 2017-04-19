/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.entity;

/**
 *
 * @author henrique
 */
public class UserAllGraph {
    private long id_userallgraph;
    private String username, name, email, password;

    public UserAllGraph() {
    }

    public UserAllGraph(long id_userallgraph, String username, String name, String email, String password) {
        this.id_userallgraph = id_userallgraph;
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public long getId_userallgraph() {
        return id_userallgraph;
    }

    public void setId_userallgraph(long id_userallgraph) {
        this.id_userallgraph = id_userallgraph;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
