package RegraDeNegocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Poupanca extends Conta {

    int valorDeposito;
    int retirada;

    public Poupanca(String agencia, String usuario, String numeroConta) {
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
        bw.write(numeroConta + ";" + agencia + ";" + usuario + ";");
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
                linha = numeroConta + ";"+ agencia + ";" + usuario + ";";
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
public void buscar() throws Exception {
        File arquivo = new File("ContaPoupanca.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String linha = br.readLine();
            String vet[] = linha.split(";");
            if (this.numeroConta.equals(vet[0])) {
                this.agencia = (vet[1]);
                this.usuario = vet[2];
            }
            br.close();
            fr.close();
        }
}
        public List<Poupanca> listar() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader("ContaPoupanca.txt"));
        String linha = "";
        List<Poupanca> l = new ArrayList<Poupanca>();
        linha = buffRead.readLine();
        while (true) {
            if (linha != null) {
                String dados[] = linha.split(";");
                Poupanca u = new Poupanca(dados[0], dados[1], dados[2]);
                l.add(u);
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
        return l;
    }
}
