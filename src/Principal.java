package src;

import src.modelos.BuscaConversao;
import src.modelos.Conversao;
import src.modelos.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        byte opcao;
        byte opcaoMoedaBase;
        byte opcaoMoedaBuscada;
        float valorMoeda;
        String[] listaDeMoedas = {"USD","EUR","BRL","CAD","VES","JPY","KRW","CNY","ARS"};
        List listaDeConversoes = new ArrayList<Conversao>();

        Scanner ler = new Scanner(System.in);
        Menu menu = new Menu();
        BuscaConversao buscaConversao = new BuscaConversao();
        do {
            menu.mostraOpcoes();
            opcao = ler.nextByte();
            if(opcao == 1){
                do {
                    menu.mostraMoedas();
                    opcaoMoedaBase = ler.nextByte();
                }while (opcaoMoedaBase < 1 || opcaoMoedaBase > 9);
                do {
                    menu.mostraMoedas();
                    opcaoMoedaBuscada = ler.nextByte();
                }while (opcaoMoedaBuscada < 1 || opcaoMoedaBuscada > 9);
                menu.mostraValor();
                valorMoeda = ler.nextFloat();
                try {
                    Conversao conversao =  new Conversao(listaDeMoedas[opcaoMoedaBase],listaDeMoedas[opcaoMoedaBuscada],valorMoeda);
                    buscaConversao.buscaValores(conversao);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }else if (opcao == 2){

            }
        }while(opcao != 3);
        System.out.println("Finalizando......");
    }
}
