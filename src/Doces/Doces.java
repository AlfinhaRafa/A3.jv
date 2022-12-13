package Doces;


public class Doces {
    private String idDd;
    private String classeDd;
    private String nomeDd;
    private String quantidadeDd;
    private String saborDd;
    private String validadeDd;
    private double valorDd;

    public Doces() {
    }
    public Doces (String classeDd,String nome, String quantidade, String sabor,String validade, double valor){
        this.idDd= classeDd;
        this.nomeDd = nome;
        this.quantidadeDd = quantidade;
        this.saborDd = sabor;
        this.validadeDd = validade;
        this.valorDd = valor;
    }

    //POSTAGEM DE ATRIBUTOS

    public void setClasseDd(String classeDd) {
        this.classeDd = classeDd;
    }

    public String getClasseDd() {
        return classeDd;
    }

    //0-TIPO DO DOCE:
    public void setIdDd(String idDd){
        this.idDd=idDd;
    }
    public String getIdDd(){
        return idDd;
    }

//1-NOME DO DOCE:

    public void setNomeDd(String nomeDd) {
        this.nomeDd = nomeDd;
    }

    public String getNomeDd() {
        return nomeDd;
    }


    //2-QUANTIDADE DE DOCES:

    public void setQuantidadeDd(String quantidadeDd) {

        this.quantidadeDd = quantidadeDd;
    }

    public String getQuantidadeDd() {
        return quantidadeDd;
    }

    //3-SABOR DE DOCES:

    public void setSaborDd(String saborDd) {
        this.saborDd = saborDd;
    }

    public String getSaborDd() {
        return saborDd;
    }

    //4-VALIDADE DOS DOCES:

    public void setValidadeDd(String validadeDd) {
        this.validadeDd = validadeDd;
    }

    public String getValidadeDd() {
        return validadeDd;
    }


    //5- VALOR DOS DOCES:

    public void setValorDd(double valorDd) {

        this.valorDd = valorDd;
    }

    public double getValorDd() {

        return valorDd;
    }


}
