package RegraDeNegocio;

public abstract class Conta {
    public Agencia agencia;
    private Usuario usuario;
    
    public float retirada;
    float saldo;
    String numeroConta;
    private float limite;

    public Conta(Agencia agencia, Usuario usuario, float retirada, float saldo, String numeroConta, float limite) {
        this.agencia = agencia;
        this.usuario = usuario;
        this.retirada = retirada;
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.limite = limite;
    }
    
    public Conta(){}

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getRetirada() {
        return retirada;
    }

    public void setRetirada(float retirada) {
        this.retirada = retirada;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    
    
    
    public abstract void depositar(float valor);

    public abstract void sacar(float retirada);

    public abstract void verSaldo();

    public abstract void transferencia(Conta c);

}
