
public class ComputadorMarcos {
	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		System.out.println("MSN");
		msn.enviarMessagem();
		msn.receberMensagem();
		
		FacebookMessenger fcb = new FacebookMessenger();
		System.out.println("Facebook");
		fcb.enviarMessagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		System.out.println("Telegram");
		tlg.enviarMessagem();
		tlg.receberMensagem();
	}
}
