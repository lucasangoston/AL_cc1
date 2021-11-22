package fr.esgi.gestionInscription.model;

import java.util.Objects;

public class Tradesman extends User {

    public Tradesman(String firstName, String lastName, String mail, String password, boolean membership, String cardNumber, int csc) {
        super(firstName, lastName, mail, password, cardNumber, csc);
        this.status = "tradesman";
    }

}
