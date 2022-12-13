//import Bolos.Bolos;
import Doces.Doces;

import javax.swing.*;
import java.lang.String;
import java.util.*;
import java.util.concurrent.ExecutionException;
public class Principal {
    public static void main(String[] args) {
        int escolha;
        //aba de doces;
        String idDd;
        String nomeDd;
        String quantidadeDd;
        double valorDd;
        String saborDd;
        String validadeDd;
        String novo;

        //aba de lista
        Scanner scan = new Scanner(System.in);
        // Array dos doces
        ArrayList<Doces> doces = new ArrayList<Doces>();
        doces.add(new Doces("Brigadeiro", "Meio amargo", "100", "cacau 50%", "12-12-2022", 2.50));
        doces.add(new Doces("Brigadeiro", "Chocolate com café", "150", "café", "12-12-2022", 2.50));
        doces.add(new Doces("Bolos", "Brownie", "200", "chocolate", "12-12-2022", 5.50));
        doces.add(new Doces("Bolos", "Cupcake", "100", "ninho", "12-12-2022", 8.50));
        doces.add(new Doces("Donuts", "Donuts de oreo", "100", "chocolate", "12-12-2022", 12.3));
        doces.add(new Doces("Donuts", "Donuts puro", "30", "cobertura de chocolate", "12-12-2022", 11.6));
        doces.add(new Doces("Donuts", "Donuts de beijinho", "203", "coco", "12-12-2022", 12.3));

        //ArrayList<Bolos> bolos = new ArrayList<Bolos>();
        //   bolos.add(new Bolos(cla))

        do {//Repete o menu até que chegue a ultima opção
            System.out.println("-------------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("-------------------------");
            System.out.println("1 - CADASTRAR DOCES");
            System.out.println("2 - BUSCAR DOCES");
            System.out.println("3 - LISTA DE DOCES CADASTRADOS");
            System.out.println("4 - ATUALIZAR DOCE");
            System.out.println("5 - EXCLUIR DOCE");
            System.out.println("6 - SAIR");
            System.out.println("Digite sua opção: ");
            escolha = scan.nextInt();

            switch (escolha) { // essa opção deesenvolve o ocorrimento do sistema


                case 1:
                    //CADASTRO DE DOCES
                    Doces doces1 = new Doces();
                    try {
                        System.out.println("Digite o tipo: ");
                        System.out.flush();//limpar o teclado
                        idDd = scan.next();
                        doces1.setIdDd(idDd);

                        System.out.println("Digite o nome: ");
                        System.out.flush();//limpar o teclado
                        nomeDd = scan.next();
                        doces1.setNomeDd(nomeDd);

                        System.out.flush();
                        System.out.println("Digite a quantidade: ");
                        System.out.flush();
                        quantidadeDd = scan.next();
                        doces1.setQuantidadeDd(quantidadeDd);

                        System.out.flush();
                        System.out.println("Digite o sabor: ");
                        System.out.flush();
                        saborDd = scan.next();
                        doces1.setSaborDd(saborDd);

                        System.out.flush();
                        System.out.println("Digite a validade: ");
                        System.out.flush();
                        validadeDd = scan.next();
                        doces1.setValidadeDd(validadeDd);


                        System.out.flush();
                        System.out.println("Digite o valor: ");
                        System.out.flush();
                        valorDd = Double.parseDouble(scan.next());
                        doces1.setValorDd(valorDd);
                        if (valorDd != 0) {
                            System.out.println("CADASTRO FEITO!");
                        }
                    } catch (Exception e) {
                        System.out.println("TENTE NOVAMENTE");
                    }

                    doces.add(doces1);//adiciona o doce a lista

                    break;
                case 2:
                    //BUSCA DE DOCES
                    try {


                        System.out.println("Digite o nome do produto que você procura: ");// buscar produto
                        System.out.flush();
                        String busca = scan.next();
                        boolean fin = false;
                        for (int i = 0; i < doces.size(); i++) {
                            Doces currentDoces = (Doces) doces.get(i);
                            if (currentDoces.getNomeDd().equalsIgnoreCase(busca)) {
                                System.out.println("Tipo: " + currentDoces.getIdDd());
                                System.out.println("Nome: " + currentDoces.getNomeDd());
                                System.out.println("Sabor: " + currentDoces.getSaborDd());
                                System.out.println("Quantidade: " + currentDoces.getQuantidadeDd());
                                System.out.println("Validade: " + currentDoces.getValidadeDd());
                                System.out.println("Valor: " + currentDoces.getValorDd());

                                fin = true;
                            }

                        }
                    } catch (Exception e) {
                        System.out.println("VALOR NULO");
                    }

                    break;


                case 3:
                    //LISTA COM OS PRODUTOS
                    boolean fi = false;
                    try {
                        System.out.println("Tipo:       Nome:        Sabor:      Quantidade:     Validade:    Valor: ");
                        System.out.println("---------------------------------------------------------------------------------");
                        for (int i = 0; i < doces.size(); i++) {
                            Doces currentDoces = (Doces) doces.get(i);
                            System.out.println("* " + currentDoces.getIdDd() + " | " + currentDoces.getNomeDd() + " | " + currentDoces.getSaborDd() + " |   " + currentDoces.getQuantidadeDd() + " |   " + currentDoces.getValidadeDd() + " |   " + currentDoces.getValorDd());
                            System.out.println("---------------------------------------------------------------------------------");

                        }
                        fi = true;

                    } catch (Exception e) {
                        System.out.println("AINDA NÃO FORAM CADASTRADOS");

                    }
                    break;

                case 4:
                    System.out.println(" EDITAR NOME");
                    System.out.println("Digite o nome do doce que você quer atualizar: ");// buscar produto
                    String busca = scan.nextLine();

                    boolean fin = false;
                    for (int i = 0; i < doces.size(); i++) {
                        Doces currentDoces = (Doces) doces.get(i);
                        if (currentDoces.getNomeDd().equalsIgnoreCase(busca)) {
                            System.out.println("Tipo: " + currentDoces.getIdDd());
                            System.out.println("Nome: " + currentDoces.getNomeDd());
                            System.out.println("Sabor: " + currentDoces.getSaborDd());
                            System.out.println("Quantidade: " + currentDoces.getQuantidadeDd());
                            System.out.println("Validade: " + currentDoces.getValidadeDd());
                            System.out.println("Valor: " + currentDoces.getValorDd());


                            System.out.println("Digite o Novo Nome");
                            novo = scan.nextLine();
                            doces.get(i).setNomeDd(novo);
                            System.out.println("Tipo: " + currentDoces.getIdDd());
                            System.out.println("Nome: " + currentDoces.getNomeDd());
                            System.out.println("Sabor: " + currentDoces.getSaborDd());
                            System.out.println("Quantidade: " + currentDoces.getQuantidadeDd());
                            System.out.println("Validade: " + currentDoces.getValidadeDd());
                            System.out.println("Valor: " + currentDoces.getValorDd());
                        }

                       /* System.out.println("Digite o Novo Nome");
                        novo= scan.nextLine();
                        for (int i = 0; i <doces.size(); i++) {
                            Doces currentDoces = (Doces) doces.get(i);
                            novo = scan.nextLine();
                            doces.get(i).setNomeDd(novo);
                            System.out.println("Nome: " + currentDoces.getNomeDd());
                            System.out.println("Sabor: " + currentDoces.getSaborDd());
                            System.out.println("Quantidade: " + currentDoces.getQuantidadeDd());
                            System.out.println("Validade: " + currentDoces.getValidadeDd());
                            System.out.println("Valor: " + currentDoces.getValorDd());

                        } */
                        fin = true;
                        break;
                    }
               /* case 5:
                    System.out.println("Digite o nome do doce que você quer excluir: ");// buscar produto
                    busca = scan.next();
                    boolean f = false;
                    for (int J = 0; J < doces.size(); J++) {
                        Doces currentDocesS = (Doces) doces.get(J);
                        if (currentDocesS.getNomeDd().equalsIgnoreCase(busca)) {
                            System.out.println("Tipo:       Nome:        Sabor:      Quantidade:     Validade:    Valor: ");
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("* " + currentDocesS.getIdDd() + " | " + currentDocesS.getNomeDd() + " | " + currentDocesS.getSaborDd() + " |   " + currentDocesS.getQuantidadeDd() + " |   " + currentDocesS.getValidadeDd() + " |   " + currentDocesS.getValorDd());
                            System.out.println("---------------------------------------------------------------------------------");

                            fin = true;


                        }
                    }*/
            }

        } while (escolha != 6);

    }
}






















