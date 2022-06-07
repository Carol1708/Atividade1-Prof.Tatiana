package Atividade1;

public class Funcionarios {
    public String nome;
    public Integer idade;
    public String cargo;
    public String situacao;

    public Funcionarios(String nome, Integer idade, String cargo, String situacao) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.situacao = situacao;
    }

    public void demitirFuncionario(){
        System.out.println("A funcionária " + getNome() + " foi demitida e agora sua situação na empresa é: Inativo");
    }

    public void trocarCargoFuncionario(){
        System.out.println("A funcionária " + getNome() + " foi promovida de " + getCargo() + " para Analista Sênior.");

    }

    public void pagarSalario(){
        System.out.println("A funcionária " + getNome() + " deve receber o seu salário, no valor de " + "R$2.500,00.");

    }

    public void fazerAniversario(){
        idade++;
        System.out.println("A funcionária " + getNome() + " está fazendo " +idade+ " anos, Parabéns!");

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
