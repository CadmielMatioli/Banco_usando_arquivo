package RegraDeNegocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Poupanca extends Conta {
    int valorDeposito;
    int retirada;
    public Poupanca(Agencia agencia, Usuario usuario, float retirada, float saldo, String numeroConta, float limite) {
    super(agencia, usuario, retirada, saldo, numeroConta, limite);
    }

    public Poupanca() {
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

    //**********************************************************************************

    //********Depositar********************************************************************
    @Override
    public void depositar(float v) {

    }

    //********Sacar************************************************************************
    @Override
    public void sacar(float retirada) {

    }

    //********Ver Saldo *******************************************************************
    @Override
    public void verSaldo() {

    }

    //********Transferencia B***************************************************************
    @Override
    public void transferencia(Conta c) {

    }
     //********Calcular Juros***************************************************************
    public void calcularJuros(){
        
    }
    //********Cadastrar********************************************************************
    public void cadastrar() throws IOException {
        File arquivo = new File("ContaPoupanca.txt");
        arquivo.createNewFile();
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(numeroConta + ";");
        bw.newLine();
        bw.close();
        fw.close();
    }
    
    public String editar() throws IOException{
        
        File arquivoTemp = new File("tmpContaPoupanca.txt");
        File arquivo = new File("ContaPoupanca.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoTemp, true));
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] line = linha.split(";");
            if (line[0].equals(numeroConta)) {
                linha = numeroConta + ";";
            }
            bw.write(linha);
            bw.newLine();
        }
        bw.close();
        br.close();
        arquivo.delete();
        arquivoTemp.renameTo(arquivo);
        return numeroConta;
      
    }
    
    
    
    
}
