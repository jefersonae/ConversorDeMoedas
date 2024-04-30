package src.modelos;

public class Menu {
    public void mostraMoedas(){
        System.out.println("Moedas");
        System.out.print("""
                1 - USD (Dolar Americano)
                2 - EUR (Euro)
                3 - BRL (Real)
                4 - CAD (Dolar Canadense)
                5 - VES (Bolivar)
                6 - JPY (Yen)
                7 - KRW (Won)
                8 - CNY (Yuan chinês)
                9 - ARS (Peso argentino)
                Digite o número da moeda:
                """);
    }
    public void mostraOpcoes(){
        System.out.println("*******************************");
        System.out.println("-----------CONVERSOR-----------");
        System.out.println("*******************************");
        System.out.print("""
                Menu
                1 - Nova Conversão
                2 - Histórico de Conversões
                3 - Sair
                """);
    }
    public void mostraValor(){
        System.out.print("""
                Informe o valor que deseja converter:
                """);
    }
}
