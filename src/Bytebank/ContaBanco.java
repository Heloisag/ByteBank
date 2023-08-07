package Bytebank;

public class ContaBanco {
    //atributos
    public int numeroDaConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    //Métodos personalizados
    public void estadoAtual() {
        System.out.println("--------------------------------------------");
        System.out.println("Situaçao da conta: " + this.getStatus());
        System.out.println("Bem vindo " + this.getDono());
        System.out.println("O numero da sua conta e: " + this.getNumeroDaConta());
        System.out.println("Ela foi registrada como: " + this.getTipo());
        System.out.println("Voce tem no total " + this.getSaldo() + (" de saldo, faca bom uso!")) ;
    }

    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    // métodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("cc")) {
            this.setSaldo(50);
        } else if (t.equals("cp")) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    private void setTipo(String t) {

    }

    public void encerramentoDeConta() {
        if ((this.getSaldo() > 0)) {
            System.out.println("Você não pode fechar sua conta " +
                    "se tiver um saldo ativo, porfavor saque todo o dinheiro da conta.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Sua conta se encontra em débito, por favor verifique.");
        } else {
            setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de: "
                    + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de: "
                        + getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensalidade() {
        if (this.getTipo().equals("cc") && setStatus(true)) {
            setSaldo(saldo - 12);
            System.out.println("Mensalidade paga com sucesso!");
        } if (this.getTipo().equals("cp") && setStatus(true)) {
            setSaldo(saldo - 20);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Saldo para débito insuficiente");
        }
    }

    //métodos especial
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean setSaldo(float saldo) {
        this.saldo = saldo;
        return true;
    }

    public boolean getStatus() {
        return status;
    }

    public boolean setStatus(boolean status) {
        this.status = status;
        return status;
    }
}