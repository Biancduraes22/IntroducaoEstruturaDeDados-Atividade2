public class Pilha {
    private String[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new String[capacidade];
        topo = -1;
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == elementos.length - 1;
    }

    public boolean adicionar(String elemento) {
        if (estaCheia()) {
            System.out.println("Pilha cheia.");
            return false;
        }

        topo++;
        elementos[topo] = elemento;
        return true;
    }

    public String remover() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return null;
        }

        String removido = elementos[topo];
        elementos[topo] = null;
        topo--;
        return removido;
    }

    public String verTopo() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return null;
        }

        return elementos[topo];
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return;
        }

        System.out.print("Pilha: ");
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}