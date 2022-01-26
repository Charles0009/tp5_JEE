package tsi.ensg.jee.hibernate.colloque.Evenement.metier;

import org.hibernate.annotations.GenericGenerator;
import tsi.ensg.jee.hibernate.colloque.Participant.metier.Participant;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "Evenement")
public class Evenement {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")

    @Column(name = "Id")
    private long id;
    @Column(nullable = false)
    private int num_even;
    @Column(nullable = false)
    private String titre;
    @Column(nullable = false)
    private String theme;
    @Column(nullable = false)
    private String start_date;
    @Column(nullable = false)
    private int duree;
    @Column(nullable = false)
    private int max_participants;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private String organisateur;
    @Column(nullable = false)
    private String type;
//    @Column(nullable = false)
//    private Participant participant;

    public Evenement(){

    }

    public Evenement(int num_even, String titre, String theme, String start_date, int duree, int max_participants, String description, String organisateur, String type){

        this.num_even = num_even;
        this.titre = titre;
        this.theme = theme;
        this.start_date = start_date;
        this.duree = duree;
        this.max_participants = max_participants;
        this.description = description;
        this.organisateur = organisateur;
        this.type = type;


    }

    @Override
    public String toString() {
        return "Evenement{" +
                "id=" + id +
                ", num_even='" + num_even + '\'' +
                ", titre='" + titre + '\'' +
                ", theme='" + theme + '\'' +
                ", start_date='" + start_date + '\'' +
                ", duree='" + duree + '\'' +
                ", max_participants='" + max_participants + '\'' +
                ", description=" + description +'\'' +
                ", organisateur=" + organisateur +'\'' +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evenement evenement = (Evenement) o;
        return id == evenement.id && num_even == evenement.num_even
                && Objects.equals(titre, evenement.titre)
                && Objects.equals(theme, evenement.theme)
                && Objects.equals(start_date, evenement.start_date)
                && duree == evenement.duree
                && max_participants == evenement.max_participants
                && Objects.equals(description, evenement.description)
                && Objects.equals(organisateur, evenement.organisateur)
                && Objects.equals(type, evenement.type) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, num_even, titre, theme,start_date,duree,max_participants,description,organisateur,type);}

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public int getNum_even(){return num_even;}
    public void setNum_even(int num_even){this.num_even = num_even;}

    public String getTitre(){return titre;}
    public void setTitre(String titre){this.titre = titre;}

    public String getTheme() {return theme;}
    public void setTheme(String theme){this.theme = theme;}

    public String getStart_date(){return start_date;}
    public void setStart_date(String start_date){this.start_date = start_date;}

    public int getDuree(){return duree;}
    public void setDuree(int duree){this.duree = duree;}

    public int getMax_participants(){return max_participants;}
    public void setMax_participants(int max_participants){this.max_participants = max_participants;}

    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}

    public String getOrganisateur(){return organisateur;}
    public void setOrganisateur(String organisateur){this.organisateur = organisateur;}

    public String getType(){return type;}
    public void setType(String type){this.type = type;}

}
