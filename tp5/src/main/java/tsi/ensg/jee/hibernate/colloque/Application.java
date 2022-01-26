package tsi.ensg.jee.hibernate.colloque;

import tsi.ensg.jee.hibernate.colloque.Participant.services.ParticipantDAO;
import tsi.ensg.jee.hibernate.colloque.Participant.metier.Participant;
import tsi.ensg.jee.hibernate.colloque.Evenement.services.EvenementDAO;
import tsi.ensg.jee.hibernate.colloque.Evenement.metier.Evenement;
import java.util.List;

public class Application {

    public static void main(String[] args) {


        ParticipantDAO dao_parti = new ParticipantDAO();
        dao_parti.create(1,"Bob", "Bobby", "bob@bob.fr", "1999-02-07", "Org1", "aucune");
        dao_parti.create(2,"Bob2", "Bobby2", "bob2@bob.fr", "1999-02-08", "Org2", "aucune2");
        dao_parti.create(3,"Bob3", "Bobby3", "bob3@bob.fr", "1999-02-09", "Org3", "aucune3");
        //dao.update(3);
        List<Participant> participants = dao_parti.getAll();

        EvenementDAO dao_even = new EvenementDAO();
//        dao_even.create(1, "even1", "theme1", "2022-01-30", 15, 10, "descri1", "orga1","type1");
//        dao_even.create(2, "even2", "theme2", "2022-02-30", 16, 15, "descri2", "orga2","type2");
//        dao_even.create(1, "even3", "theme3", "2022-03-30", 17, 20, "descri3", "orga3","type3");
        List<Evenement> evenements = dao_even.getAll();


        System.out.println(participants);
        System.out.println(evenements);
        //System.out.println(dao.getAllByFirstName("Bob"));
    }


}
