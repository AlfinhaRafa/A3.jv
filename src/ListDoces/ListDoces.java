package ListDoces;

public class ListDoces {
    private String nomedd;
    private String quantidd;
    private String sabordd;
    private String validade;
    private String valordd;


    //public static String size(String nomedd) {
    //  return nomedd;
    //  }


    //NOME DOS DOCES
    public void setNomedd(String[] nomedd) {
        this.nomedd = "bolo";
    }

    public String getNomedd() {
        return nomedd;
    }

    //SABOR DOS DOCES
    public void setSabordd(String sabordd) {
        this.sabordd = "CHOCOLATE";
    }

    public String getSabordd() {
        return sabordd;
    }

    //QUANTIDADE
    public void setQuantidd(String quantidd) {
        this.quantidd = "12";
    }

    public String getQuantidd() {
        return quantidd;
    }

    //VALIDADE
    public void setValidade(String validade) {
        this.validade = "12-12-2022";
    }

    public String getValidade() {
        return validade;
    }

    //VALOR
    public void setValordd(String valordd) {
        this.valordd = "2.50";
    }

    public String getValordd() {
        return valordd;
    }


    public void imprimir() {
        System.out.println("Nome" + this.nomedd);
        System.out.println("Sabor" + this.sabordd);
        System.out.println("Quantidade" + this.quantidd);
        System.out.println("Valor" + this.valordd);
        System.out.println("Validade" + this.validade);
    }
}

