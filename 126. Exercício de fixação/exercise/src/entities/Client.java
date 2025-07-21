package entities;

import java.time.LocalDateTime;

public class Client {
    private String name;
    private String email;
    private String birthDate;


    public Client() {
    }

    public Client(String birthDate, String email, String name) {
        this.birthDate = birthDate;
        this.email = email;
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
