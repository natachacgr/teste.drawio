public class Professor extends Usuario implements Funcionario{

    public Professor(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public void publicarNota( Aluno aluno){
        System.out.println("Nota do aluno(a) "+ aluno.getNome()+ " publicada");
    }

    @Override
    public boolean autenticar(String senha) {
        if(senha == this.senha){
            return true;
        } else {
            return false;
        }
    }
}
