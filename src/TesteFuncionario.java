
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario italo = new Funcionario();
		
		italo.setNome("Italo Felix");
		italo.setCpf("22222-2");
		italo.setSalario(6200.0);
		
		System.out.println(italo.getNome());
		System.out.println(italo.getCpf());
		System.out.println(italo.getBonificacao());
		
	}
	
}
