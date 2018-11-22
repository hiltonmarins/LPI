
public class Aluno {
	String nome;
	double nota1;
	double nota2;
	
	Aluno(String nome, double nota1, double nota2){
		System.out.println("Criando objeto...");
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	Aluno (String n){
		nome = n;
	}
	
	Aluno (){
		
	}
	
	public double calculaMedia() {	
		return (nota1+nota2)/2;
	}
	
	
	
}
