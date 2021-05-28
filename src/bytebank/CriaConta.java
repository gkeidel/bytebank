package bytebank;

public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("O saldo da primeira conta é: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("O saldo da primeria conta agora é: " + primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("O saldo da segunda conta é: " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		segundaConta.agencia = 146;
		System.out.println(segundaConta.agencia);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);

	}
}
