package senac.edu.br.UBS.logonSession;
import java.util.Scanner;

public class LogonProgram {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite 0 para finalizar o sistema");
		System.out.println("Digite 1 para logar como um paciente");
		System.out.println("Digite 2 para logar como um enfermeiro");
		System.out.println("Digite 3 para logar como um m�dico");
		System.out.println("Digite 4 para logar como um dentista");
		int opcao = 0;
		do{
			opcao = leitor.nextInt();
			switch(opcao){
			case 0:
				System.out.println("Finalizando o sistema");
				break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				System.out.println("Op��o inv�lida");
				break;
			
			}
		}while(opcao != 0);
	}

}