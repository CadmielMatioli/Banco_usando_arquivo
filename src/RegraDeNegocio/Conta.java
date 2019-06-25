package RegraDeNegocio;

public abstract class Conta {
    public Agencia agencia;
    public Usuario usuario;
    String numeroConta;

    public Conta(Agencia agencia, Usuario usuario,String numeroConta) {
        this.agencia = agencia;
        this.usuario = usuario;
        this.numeroConta = numeroConta;
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

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
