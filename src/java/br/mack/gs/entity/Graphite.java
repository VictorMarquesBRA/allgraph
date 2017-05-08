/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.entity;

/**
 *
 * @author Fernando Bontorin, 31568343 <fernandorbontorin@gmail.com>
 */
public class Graphite {

    private long id;
    private String name, img, cep;
    private UserAllGraph owner;

    public Graphite() {
    }

    public Graphite(long id, String name, String img, UserAllGraph owner) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.owner = owner;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public UserAllGraph getOwner() {
        return owner;
    }

    public void setOwner(UserAllGraph owner) {
        this.owner = owner;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
