package aplicativos;
public class FacebookMenssenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        verificarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        verificarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Facebook");
    }
    
}
