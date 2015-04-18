package pdm.ufabc.collegr;

/**
 * Created by vitor on 4/17/15.
 */
public class User {

    private String email;
    private int id;
    private String nome;

    public User(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
