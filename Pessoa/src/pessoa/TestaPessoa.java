package pessoa;

public class TestaPessoa {

    public static void main(String[] args) {
        Pessoa alexandre = new Pessoa("Alexandre", 1.75, 80);
        Funcionario gabriel = new Funcionario("Gabriel", 1.65, 75, 1000);
        
        alexandre.ImprimePessoa();
        
        System.out.println("##########");
        
        gabriel.ImprimeFuncionario();
    }
    
}
