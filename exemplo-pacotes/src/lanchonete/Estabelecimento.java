package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Almoxarife almoxarife = new Almoxarife();
        Atendente atendente = new Atendente();
        Cliente cliente = new Cliente();

        cozinheiro.adicionarLancheNoBalcao();

        atendente.servindoMesa();

        cliente.escolherLanche();
        cliente.fazerPedido();
    }
}
