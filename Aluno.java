package uscs;

public class Aluno {
		
	String aluno;
	int codmat;
	String cpf;
	char sexo;
	
	float nota_P1;
	float nota_P2;
	float nota_P3;
	
	public void imprime_aluno() {
		
		System.out.println("Aluno: " + aluno + "\nMatricula: " + codmat + "\nCPF: " + cpf);
		
	}
	
	public void imprime_sexo() {
		
		System.out.println("\nAluno: " + aluno);
		
		if (sexo == 'M') {
			System.out.println("Sexo Masculino");
		}
		else if (sexo == 'F') {
			System.out.println("Sexo Feminino");
		}
		
	}
	
	public float media_aluno() {
		
		float media = 0;
		
		if (nota_P1 > nota_P2) {
			media = (nota_P1 + nota_P3) /2;
		}
		else {
			media = (nota_P2 + nota_P3) /2;
		}
		
		return media;
				
	}
	
	public void imprime_media() {
		
		System.out.println("\nMedia do aluno: " + this.media_aluno());
	}
	
	public void Resultado() {
		
		if (this.media_aluno() >= 6) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("Reprovado");
		}
	}
	
public class Teste_Aluno {
	
public static void main (String[] args) {
	
		Aluno x = new Aluno();
		
		x.aluno = "Fabio";
		x.codmat = 4823;
		x.cpf = "145.681.286-15";
		x.sexo = 'M';
	
		x.imprime_aluno();
		x.imprime_sexo();
		
		x.nota_P1 = 2;
		x.nota_P2 = 3;
		x.nota_P3 = 2;
		
		x.imprime_media();
		x.Resultado();
	}
	
}

}
