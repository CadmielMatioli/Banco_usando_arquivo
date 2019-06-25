package RegraDeNegocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ContaCorrente extends Conta {

    public ContaCorrente(Agencia agencia, Usuario usuario, float retirada, float saldo, String numeroConta, float limite) {
        super(agencia, usuario, retirada, saldo, numeroConta, limite);
    }

    public ContaCorrente() {
    }
//**********Construtor********************************************************************

//**********Get and Setter********************************************************************
//********** Metodo Depositar******************************************************************** 
    @Override
    public void depositar(float v) {
        if (v > 0) {
            this.setSaldo(this.getSaldo() + v);
        }
    }
//***********Método Sacar*******************************************************************

    @Override
    public void sacar(float retirada) {
        if ((this.saldo - retirada) >= 0) {
            saldo -= retirada;

        } else {
            System.out.println("Saldo indisponível");
        }
    }
//***********Método verSaldo*******************************************************************

    @Override
    public void verSaldo() {
        System.out.println(saldo);
    }
//***********Método Transferir*****************************************************************

    @Override
    public void transferencia(Conta c) {

    }
//***********Cadastrar Conta Corrente***********************************************************

    public void cadastrar() throws IOException {
        File arquivo = new File("ContaCorrente.txt");
        arquivo.createNewFile();
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(this.numeroConta + ";" + this.agencia.getNumeroPredio() + ";" + this.usuario.getCpf() + ";");
        bw.newLine();
        bw.close();
        fw.close();
    }
    //**********Editar Agência********************************************************************** 

    public String editarAgencia() throws IOException {
        File arquivoTemp = new File("tmpContaCorrente.txt");
        File arquivo = new File("ContaCorrente.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoTemp, true));
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] line = linha.split(";");
            if (line[0].equals(numeroConta)) {
                linha = numeroConta + ";" + this.agencia.getNumeroPredio() + ";" + this.usuario.getCpf() + ";";
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
    //**********************************************************************************************   

}
