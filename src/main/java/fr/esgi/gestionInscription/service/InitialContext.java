package fr.esgi.gestionInscription.service;

public class InitialContext {
    public Object lookup(String name)
    {
        if (name.equalsIgnoreCase("validationData")) {
            System.out.println("Verification data in progress...");
            return new ValidationData();
        }
        else if (name.equalsIgnoreCase("payment")) {
            System.out.println("Payment process...");
            return new Payment();
        }
        return null;
    }
}
