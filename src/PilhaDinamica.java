public class PilhaDinamica {
    private No topo;

    public PilhaDinamica() {
        topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void adicionar(String valor) {
        No novo = new No(valor);
        novo.prox = topo;
        topo = novo;
    }

    public String remover() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return null;
        }

        String valor = topo.valor;
        topo = topo.prox;
        return valor;
    }

    public String verTopo() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return null;
        }

        return topo.valor;
    }

    public void exibir() {
        if (estaVazia()) {
            System.out.println("Pilha vazia.");
            return;
        }

        No atual = topo;
        System.out.print("Pilha: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}