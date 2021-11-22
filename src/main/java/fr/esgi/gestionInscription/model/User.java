package fr.esgi.gestionInscription.model;

public abstract class User {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String mail;
    protected String password;
    protected String cardNumber;
    protected int csc;
    protected String status;

    public User(String firstName, String lastName, String mail, String password, String cardNumber, int csc) {
        this.id += 1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.cardNumber = cardNumber;
        this.csc = csc;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCsc() {
        return csc;
    }

    public void setCsc(int csc) {
        this.csc = csc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
