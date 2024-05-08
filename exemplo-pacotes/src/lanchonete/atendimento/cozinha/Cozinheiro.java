package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao (){
        preparaLanche();
        System.out.println("LANCHE NO BALCÃO");
    }

    private void pedirParaTrocarGas (Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    private void preparaLanche() {
        System.out.println("PREPARANDO LANCHE");
    }
}
