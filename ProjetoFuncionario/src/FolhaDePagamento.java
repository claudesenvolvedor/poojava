
public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario f1, f2, f3;
		
f1 = new Funcionario();
f2 = new Funcionario();
f3 = new Funcionario();

f1.numeroFuncional = 1234;
f1.nome = "Thomas";
f1.cargo = "Analista";
f1.salario = 5550.50;

f2.numeroFuncional = 5678;
f2.nome = "Messi";
f2.cargo = "Programador";
f2.salario = 12000.00;

f3.numeroFuncional = 9876;
f3.nome = "Vidinha";
f3.cargo = "Diretor";
f3.salario = 15750.00;

f1.mostrarDados();
f2.mostrarDados();
f3.mostrarDados();


	}
}
