package fr.esgi.gestionInscription.repository;

import fr.esgi.gestionInscription.model.User;

import java.util.List;

public interface UserRepository {
    void add(User user);
    List<User> findAll();
}
