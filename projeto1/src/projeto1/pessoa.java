package projeto1;

public class pessoa {
	
	public static void main(String[] args) {
		System.out.println("meu programa");
	}
	private String nome;
	private String sobrenome;
	private String idade;
	
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
