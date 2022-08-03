
public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();

		g1.setNome("Icaro Felix");
		g1.setCpf("2589669");
		g1.setSalario(12500.0);

		System.out.println("NOME: " + g1.getNome());
		System.out.println("CPF: " + g1.getCpf());
		System.out.println("SALARIO: " + g1.getSalario());

		g1.setSenha(6987);
		g1.setLogin("ift22");

		boolean autenticou = g1.autentica(6987);

		System.out.println("SENHA CERTA = " + autenticou);
		
		System.out.println("BONIFICACAO: " + g1.getBonificacao());
		
		boolean autenticouLoginESenha = g1.autentica("ift22", 6987);
		
		System.out.println("LOGIN E SENHA CERTOS: "+ autenticouLoginESenha);

	}

}
