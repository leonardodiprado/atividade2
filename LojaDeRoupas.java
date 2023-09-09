package Atividade2;

public class LojaDeRoupas {
    public static void main(String[] args) {
        Camiseta camiseta = new Camiseta("manga curta", 90.00, "G", "branca");
        Calca calca = new Calca("jogger", 190.00, "M", "cinza");

        Cliente cliente1 = new Cliente("Chico", "Rua X, 12");
        Cliente cliente2 = new Cliente("Bento", "Avenida Y, 34");

        double precoVenda1 = camiseta.getPreco();
        System.out.println(cliente1.getNome() + " comprou:");
        System.out.println(camiseta.getDescricao());
        System.out.println("Preço: R$" + precoVenda1);
        System.out.println("Endereço de entrega: " + cliente1.getEndereco());

        double precoVenda2 = calca.getPreco();
        System.out.println("\n" + cliente2.getNome() + " comprou:");
        System.out.println(calca.getDescricao());
        System.out.println("Preço: R$" + precoVenda2);
        System.out.println("Endereço de entrega: " + cliente2.getEndereco());

        processarPagamento(cliente1, precoVenda1);
        processarPagamento(cliente2, precoVenda2);
    }

    private static void processarPagamento(Cliente cliente, double valor) {
        System.out.println("\nProcessando pagamento para " + cliente.getNome() + " no valor de R$ " + valor);
        System.out.println("Pagamento realizado com sucesso.");
    }
}




