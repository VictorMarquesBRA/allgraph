/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.mack.gs.persistence;

import br.mack.gs.entity.UserAllGraph;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;

/**
 *
 * @author Fernando Bontorin
 */
@LocalBean
@Stateful
public class UserAllGraphDAO implements GenericDAO<UserAllGraph> {

    @PersistenceContext(unitName = "AllGraphPU", type = PersistenceContextType.EXTENDED)
    private EntityManager em;

    @Override
    public UserAllGraph getById(long id) {
        return em.find(UserAllGraph.class, id);
    }

    public UserAllGraph getByEmail(String email) {
        return em.find(UserAllGraph.class, email);
    }

    @Override
    public List<UserAllGraph> listar() {
        Query q = em.createQuery("select u from UserAllGraph u");
        List<UserAllGraph> lista = q.getResultList();
        return lista;
    }

    @Override
    public int inserir(UserAllGraph e) {
        if (getByEmail(e.getEmail()) == null) {
            em.persist(e);
            return 0;
        }
        return 1;
    }

    @Override
    public int atualizar(UserAllGraph e) {
        em.persist(e);
        return 0;
    }

    @Override
    public int deletar(UserAllGraph e) {
        em.remove(em.merge(e));
        return 0;
    }

}
