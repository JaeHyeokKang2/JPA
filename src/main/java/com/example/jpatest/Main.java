package com.example.jpatest;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Member member = new Member();
        em.persist(member);
        System.out.println("member.getClass() = " + member.getClass());
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
