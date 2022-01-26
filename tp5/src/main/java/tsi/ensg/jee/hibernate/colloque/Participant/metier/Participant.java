package tsi.ensg.jee.hibernate.colloque.Participant.metier;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "Participant")

//@Embeddable
public class Participant {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name="increment", strategy = "increment")

    @Column(name = "Id")
    private long id;
    @Column(nullable = false)
    private int num_pers;
    @Column(nullable = false)
    private String nom;
    @Column(nullable = false)
    private String prenom;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String date_naiss;
    @Column(nullable = false)
    private String organisation;
    @Column(nullable = false)
    private String observations;

    public Participant(){

    }

    public Participant(int num_pers,String nom,String prenom,String email, String date_naiss, String organisation, String observations){

        this.num_pers = num_pers;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date_naiss = date_naiss;
        this.organisation = organisation;
        this.observations = observations;

    }

    @Override
    public String toString() {
        return "Participant{" +
                "id=" + id +
                ", num_pers='" + num_pers + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", date_naiss='" + date_naiss + '\'' +
                ", organisation='" + organisation + '\'' +
                ", observations=" + observations +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant participant = (Participant) o;
        return id == participant.id && num_pers == participant.num_pers
                && Objects.equals(nom, participant.nom)
                && Objects.equals(prenom, participant.prenom)
                && Objects.equals(email, participant.email)
                && Objects.equals(date_naiss, participant.date_naiss)
                && Objects.equals(organisation, participant.organisation)
                && Objects.equals(observations, participant.observations) ;
    }




    @Override
    public int hashCode() {
        return Objects.hash(id, num_pers, nom, prenom,email,date_naiss,organisation,observations);}

    public long getId() {
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public int getNum_pers(){return num_pers;}
    public void setNum_pers(int num_pers){this.num_pers = num_pers;}

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getDate_naiss() {return date_naiss;}
    public void setDate_naiss(String date_naiss) {this.date_naiss = date_naiss;}

    public String getOrganisation() {return organisation;}
    public void setOrganisation(String organisation) {this.organisation = organisation;}

    public String getObservations() {return observations;}
    public void setObservations(String observations) {this.observations = observations;}

}
