package entities;

public class Pessoa {
    public String nome;
    public int idade;
    public String email;


    public String toString() {
        return nome + ", " + idade + " anos, " + "Email: " + email;
    }
}
