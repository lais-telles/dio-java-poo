package aplicativos;
public class MSNMenssenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        verificarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN");
    }

    @Override
    public void receberMensagem() {
        verificarConectadoInternet();
        System.out.println("Recebendo mensagem pelo MSN");
    }

}
