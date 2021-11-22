package fr.esgi.gestionInscription.service;

public class Payment implements Service {
    @Override
    public String getName() {
        return "payment";
    }

    @Override
    public boolean execute() {
        System.out.println("payment done !");
        return true;
    }

    @Override
    public Exception error() {
        return new Exception("Payment failed.");
    }
}
