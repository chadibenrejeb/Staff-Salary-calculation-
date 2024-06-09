import java.util.Date;
public class Profil extends Personne {
    private int code ; 
    private int libelle ; 
    public Profil(int id , String nom , String prenom ,String job ,  Date dateNais , double salaire , int code , int libelle){
        super(id , nom , prenom ,job , dateNais , salaire);
        this.code=code ; 
        this.libelle=libelle;
    }
    public int getCode(){
        return code ;
    }
    public int getLibelle(){
        return libelle ;
    }
    public void setCode(int code){
        this.code=code;
    }
    public void setLibelle(int libelle){
        this.libelle=libelle;
    }
}
