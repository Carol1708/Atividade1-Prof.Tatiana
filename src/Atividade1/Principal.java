package Atividade1;

public class Principal {

    public static void main(String[] args) {
        Funcionarios f1 = new Funcionarios("Carol", 25, "Analista Junior", "inativo");
        Funcionarios f2 = new Funcionarios("Jociane", 27, "Analista Pleno", "ativo");
        Funcionarios f3 = new Funcionarios("Amanda", 28, "Analista Sênior", "ativo");
        Funcionarios f4 = new Funcionarios("Débora", 30, "Analista Juior", "ativo");

        f1.demitirFuncionario();
        f2.trocarCargoFuncionario();
        f4.pagarSalario();
        f3.fazerAniversario();
    }


}
