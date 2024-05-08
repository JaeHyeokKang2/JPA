package com.example.jpatest.test;

import com.example.jpatest.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Main_test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Team team = em.find(Team.class, "team2");
        Mems mems1 = em.find(Mems.class, 1L);
        Mems mems2 = em.find(Mems.class, 2L);
        mems2.setTeam(null);
        mems1.setTeam(null);
        em.remove(team);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
