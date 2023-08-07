package Bytebank;

public class Conta {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumeroDaConta(1111);
        p1.setDono("Pedro");
        p1.abrirConta("cc");

        ContaBanco p2 = new ContaBanco();
        p2.setNumeroDaConta(2222);
        p2.setDono("Lorena");
        p2.abrirConta("cp");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(150);
        p1.encerramentoDeConta();


        p1.estadoAtual();
        p2.estadoAtual();

    }
}
