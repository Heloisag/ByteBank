public class ContaBanco {
    //atributos
    public int numeroDaConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // método

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "conta corrente") {
            this.setSaldo(50);
        } else if (t == "conta poupança") {
            this.setSaldo(150);

        }
    }

    public void fecharConta() {
    }

    public void depositar() {
    }

    public void sacar() {
    }

    public void pagarMensalidade() {
    }

    //métodos especial
    public ContaBanco() {
        this.saldo = 0;
        this.setStatus(false);
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}