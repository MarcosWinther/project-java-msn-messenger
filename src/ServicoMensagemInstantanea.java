
public class ServicoMensagemInstantanea {
	public void enviarMessagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
		salvarHistoricoMensagem();
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a Internet");
	}
	
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico de mensagem");
	}
}
