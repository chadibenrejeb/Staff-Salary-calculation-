import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne implements IPersonne {
    private int id;
    private String nom;
    private String prenom;
    private String job;
    private Date dateNais;
    private Double salaire;

    public Personne(int id, String nom, String prenom, String job, Date dateNais, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.job = job;
        this.dateNais = dateNais;
        this.salaire = salaire;
    }

    public void affiche() {
        System.out.println(String.format("Je suis le %s %s %s né le %s, mon salaire est %.2f", job, nom, prenom, dateNais, salaire));
    }
        

    public double calculerSalaire() {
        if (job.equals("directeur")) {
            return salaire + 0.2 * salaire;
        } else {
            return (salaire + 0.1 * salaire );
        }
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getJob() {
        return job;
    }

    public Date getDate() {
        return dateNais;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setDate(Date dateNais) {
        this.dateNais = dateNais;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
