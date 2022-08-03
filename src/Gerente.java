
public class Gerente extends Funcionario {

	private int senha;
	private String login;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public void setLogin (String login) {
		this.login = login;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean autentica (String login, int senha) { //dois métodos praticamente iguais que tem parametros diferentes se chama SOBRECARGA 
		if (this.senha == senha && this.login == login) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getBonificacao() {
	//	return super.getBonificacao() + super.salario; //reaproveita o método da superclasse getBonificacao e o 
														//atributo também da superclassemas apenas se oatributo estiver como PROTECTED
		
		return super.getBonificacao() + super.getSalario(); //usa o metodo para pegar o atributo salario que está PRIVATE na classe Funcionario
																// e não tem essse atributo na classe Gerente
	}

}
