package Vetores;

public class Contato {
    private String nome;
    private String numero;
    private String email;

   public Contato(String nome, String numero, String email){
        this.nome = nome;
        this.numero = numero;
        this.email = email;
    }

    public Contato(Contato c){
       this.nome = c.getNome();
       this.numero = c.getNumero();
       this.email = c.getEmail();
    }

    public Contato(){
       this.nome = "Usuario Name";
       this.numero = "xxxx-xxx";
       this.email = "usuario@email.com";
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }
}
