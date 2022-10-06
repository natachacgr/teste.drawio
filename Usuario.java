public class Usuario {

    protected String nome;
    protected String login;
    protected String senha;

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void fazerLogin(String login, String senha){
        if(login == this.login){
            if(senha == this.senha){
                System.out.println("Login efetuado!");
            }
        } else if(login != this.login){
            System.out.println("Login incorreto");
        } else if (senha != this.senha) {
            System.out.println("Senha incorreta");
        }
    }
}
