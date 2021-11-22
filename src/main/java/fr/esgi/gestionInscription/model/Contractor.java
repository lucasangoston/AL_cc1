package fr.esgi.gestionInscription.model;

import java.util.Objects;

public class Contractor extends User {

    public Contractor(String firstName, String lastName, String mail, String password, String cardNumber, int csc) {
        super(firstName, lastName, mail, password, cardNumber, csc);
        this.status = "contractor";
    }

}
