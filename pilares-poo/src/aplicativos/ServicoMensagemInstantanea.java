package aplicativos;
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // somente as classes filhas e do mesmo pacote podem ver esse método
    protected void verificarConectadoInternet(){
        System.out.println("Verificando...");
    }
}
