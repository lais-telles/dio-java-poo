package aplicativos;
public class Telegram extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        verificarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    @Override
    public void receberMensagem() {
        verificarConectadoInternet();
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    
}
