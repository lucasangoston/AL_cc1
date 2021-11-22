package fr.esgi.gestionInscription;

import fr.esgi.gestionInscription.model.User;
import fr.esgi.gestionInscription.repository.UserRepository;
import fr.esgi.gestionInscription.service.Payment;
import fr.esgi.gestionInscription.service.Service;
import fr.esgi.gestionInscription.service.ServiceLocator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class CheckData {
    private static CheckData instance;
    private Map<String, Service> services = new HashMap<>();
    private User user;

    private CheckData(User user) {
        this.user =  user;
        services.put("validationData", ServiceLocator.getService("validationData"));
        services.put("payment", ServiceLocator.getService("payment"));
    }

    public static CheckData getInstance(User user){
        if(CheckData.instance == null){
            CheckData.instance = new CheckData(user);
        }
        return CheckData.instance;
    }

    public boolean verificationDataUser(User user){
        Objects.requireNonNull(user);
        if(services.get("validationData").execute()){
            if(services.get("payment").execute()){
                return true;
            }
            services.get("payment").error();
        }
        services.get("validationData").error();
        return false;
    }
}
