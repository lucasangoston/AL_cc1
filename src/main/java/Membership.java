import fr.esgi.gestionInscription.repository.MySQLUsers;
import fr.esgi.gestionInscription.model.Contractor;
import fr.esgi.gestionInscription.CheckData;
import fr.esgi.gestionInscription.repository.UserRepository;

public class Membership {
    public static void main(String[] args) {
        var contractor = new Contractor("lucas","angoston","lucas_angoston@yahoo.fr","b:42DY","4568789456321257",701);

        var check= CheckData.getInstance(contractor);
        UserRepository users = new MySQLUsers();

        //Save my user
        users.add(contractor);

        System.out.println("subscription done.");
        users.findAll();
    }
}
