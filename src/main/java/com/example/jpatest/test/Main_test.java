package com.example.jpatest.test;

import com.example.jpatest.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main_test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Mems mems = em.find(Mems.class, 1L);
        Team team = mems.getTeam();
        em.getTransaction().commit();
        System.out.println("team = " + team.getName());
        em.close();
        emf.close();
    }
}
