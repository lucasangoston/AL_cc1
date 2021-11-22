package fr.esgi.gestionInscription.repository;

import fr.esgi.gestionInscription.model.User;
import fr.esgi.gestionInscription.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class MySQLUsers implements UserRepository {
    protected List<User> members = new ArrayList<>();

    public MySQLUsers() {
    }

    @Override
    public void add(User user) {
        members.add(user);
    }

    @Override
    public List<User> findAll() {

        return members;
    }


}
