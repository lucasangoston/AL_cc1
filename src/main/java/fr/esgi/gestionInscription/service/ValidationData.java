package fr.esgi.gestionInscription.service;

public class ValidationData implements Service {
    @Override
    public String getName() {
        return "validationData";
    }

    @Override
    public boolean execute() {
        System.out.println("data checked !");
        return true;
    }

    @Override
    public Exception error() {
        return new Exception("Datas are not valid.");
    }
}
