package model;

import java.io.Serializable;

public class User implements Serializable {

    private String imagen, mail;
    private  Name nameJava;

    public User() {
    }

    public User(String imagen, String mail, Name name) {
        this.imagen = imagen;
        this.mail = mail;
        this.nameJava = name;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Name getName() {
        return nameJava;
    }

    public void setName(Name name) {
        this.nameJava = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "imagen='" + imagen + '\'' +
                ", mail='" + mail + '\'' +
                ", name=" + nameJava +
                '}';
    }
}
