package lanchonete.atendimento.cozinha;

public class Almoxarife {
    // default -> visivel somente aquele pacote
    void entregarIngredientes() {
        System.out.println("ENTREGANDO INGREDIENTES");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("ALMOXARIFE TROCANDO O GAS");
    }

    private void controlarSaida() {
        System.out.println("CONTROLANDO SAIDA");
    }
}
