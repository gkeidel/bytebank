package bytebank;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 50;
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("saldo da segunda conta: " + segundaConta.saldo);
		
		primeiraConta.saldo += 300;
		System.out.println("saldo da primeira conta: " + primeiraConta.saldo);
		System.out.println("saldo da primeira conta: " + segundaConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
