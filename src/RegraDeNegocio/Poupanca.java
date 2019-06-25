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

    public Poupanca(Agencia agencia, Usuario usuario, String numeroConta) {
        super(agencia, usuario, numeroConta);
    }

    public Poupanca() {
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    //********Cadastrar********************************************************************
    public void cadastrar() throws IOException {
        File arquivo = new File("ContaPoupanca.txt");
        arquivo.createNewFile();
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(numeroConta + ";" + agencia.getNumeroPredio()+ ";" + usuario.getCpf() + ";");
        bw.newLine();
        bw.close();
        fw.close();
    }

    public String editar() throws IOException {

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
