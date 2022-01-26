package tsi.ensg.jee.hibernate.colloque.Evenement.services;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import tsi.ensg.jee.hibernate.colloque.Evenement.metier.Evenement;

public class EvenementService {


    private final SessionFactory sessionFactory;

    public EvenementService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void insertEvenement(Evenement evenement) {
        Session session = this.sessionFactory.openSession();
        session.beginTransaction();
        session.persist(evenement);
        session.getTransaction().commit();
        session.close();
    }



}
