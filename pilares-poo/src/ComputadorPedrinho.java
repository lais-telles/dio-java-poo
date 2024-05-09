import aplicativos.FacebookMenssenger;
import aplicativos.MSNMenssenger;
import aplicativos.ServicoMensagemInstantanea;
import aplicativos.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if (appEscolhido.equals("msn")){
            smi = new MSNMenssenger();
        } else if (appEscolhido.equals("facebook")){
            smi = new FacebookMenssenger();
        } else if (appEscolhido.equals("telegram")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
