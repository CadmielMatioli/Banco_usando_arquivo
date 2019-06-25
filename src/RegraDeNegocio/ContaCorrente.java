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

    public ContaCorrente(String agencia, String usuario, String numeroConta) {
        super(agencia, usuario, numeroConta);
    }

    public ContaCorrente() {
    }

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

//***********Cadastrar Conta Corrente***********************************************************
    public void cadastrar() throws IOException {
        File arquivo = new File("ContaCorrente.txt");
        arquivo.createNewFile();
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(this.numeroConta + ";" + this.agencia + ";" + this.usuario + ";");
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
                linha = numeroConta + ";" + this.agencia + ";" + this.usuario + ";";
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
    public List<ContaCorrente> listar() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader("ContaCorrente.txt"));
        String linha = "";
        List<ContaCorrente> l = new ArrayList<ContaCorrente>();
        linha = buffRead.readLine();

        while (true) {
            if (linha != null) {
                String dados[] = linha.split(";");
                ContaCorrente u = new ContaCorrente(dados[0], dados[1], dados[2]);
                l.add(u);
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
        return l;
    }

    public void buscar() throws Exception {
        File arquivo = new File("ContaCorrente.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String linha = br.readLine();
            String vet[] = linha.split(";");
            if (this.agencia.equals(vet[0])) {
                this.numeroConta = (vet[1]);
                this.usuario = vet[2];
            }
            br.close();
            fr.close();
        }
    }
}
