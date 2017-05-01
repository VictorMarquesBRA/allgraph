/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.persistence;

import java.io.Serializable;
import java.util.List;


/**
 *
 * @author 26MAC-FCI
 * @param <E>
 */
public interface GenericDAO<E> extends Serializable{
        
    E getById(long id);
    
    List<E> listar();
    
    int inserir(E e);
    
    int atualizar(E e);
    
    int deletar(E e);
    
}
