public class Main {
    public static void main(String[] args) {

        System.out.println("Pilha estática: ");
        Pilha pilha = new Pilha(5);

        pilha.adicionar("Maçã");
        pilha.adicionar("Banana");
        pilha.adicionar("Uva");

        pilha.exibir();

        System.out.println("Topo: " + pilha.verTopo());
        System.out.println("Removido: " + pilha.remover());

        pilha.exibir();


        System.out.println("\nPilha dinâmica: ");
        PilhaDinamica pilhaD = new PilhaDinamica();

        pilhaD.adicionar("Laranja");
        pilhaD.adicionar("Manga");
        pilhaD.adicionar("Abacaxi");

        pilhaD.exibir();

        System.out.println("Topo: " + pilhaD.verTopo());
        System.out.println("Removido: " + pilhaD.remover());

        pilhaD.exibir();
    }
}