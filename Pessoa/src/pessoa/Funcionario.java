package pessoa;

public class Funcionario extends Pessoa {
    int mat;
    
    public Funcionario(String nome, double altura, double peso, int mat) {
        super(nome, altura, peso);
        this.mat = mat;
    }

    public Funcionario() {
    }
    
    public void ImprimeFuncionario() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Matricula: " + this.mat);
    }
}
