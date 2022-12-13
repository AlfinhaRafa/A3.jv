package Usuario;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String senhacf;


    //ATRIBUTO NOME
    public void setNome(String nome) {

        this.nome = nome;
    }
    public String getnome() {
        return this.nome;
    }

    // ATRIBUTO EMAIL
    public void setemail(String email) {
            this.email = email;
        }
        public String getemail(){
            return this.email;
    }

    //ATRIBUTO SENHA
    public void setsenha(String senha) {
        this.senha = senha;
    }
        public String getsenha(String senha) {
         return this.senha;
        }

    //ATRIBUTO CONFIRMAÇÃO DE SENHA
    public void setsenhacf(String senhacf) {
        this.senhacf= senhacf;
        }
        public String getsenhacf() {
            return this.senhacf;
        }

    }
    //FIM DA CLASSE USUARIO


