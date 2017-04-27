/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.dao;


/**
 *
 * @author 26MAC-FCI
 * @param <E>
 */
public interface GenericDAO<E>{
    
    public int create(E e);
    public E getById(long id);
    
}
