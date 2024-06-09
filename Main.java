import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Personne perso1 = new Personne(12883484, "rejeb", "chadi", "CEO", null, 1200.0);
        perso1.affiche();
        System.out.println(perso1.calculerSalaire());

    }
}
