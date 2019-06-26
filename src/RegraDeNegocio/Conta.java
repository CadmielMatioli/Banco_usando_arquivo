package RegraDeNegocio;

public abstract class Conta {
    public String agencia;
    public String usuario;
    String numeroConta;

    public Conta(String agencia, String usuario, String numeroConta) {
        this.agencia = agencia;
        this.usuario = usuario;
        this.numeroConta = numeroConta;
    }
    
    public Conta(){}

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
