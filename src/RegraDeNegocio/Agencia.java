package RegraDeNegocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Agencia {

    private String nomeBanco;
    private String enderecoBanco;
    private String numeroPredio;
    private String numeroAgencia;
    private String cidadeAgencia;
    private String estadoAgencia;
    private String bairroAgencia;

    public Agencia(String nomeBanco, String enderecoBanco, String numeroPredio, String numeroAgencia, String cidadeAgencia, String estadoAgencia, String bairroAgencia) {
        this.nomeBanco = nomeBanco;
        this.enderecoBanco = enderecoBanco;
        this.numeroPredio = numeroPredio;
        this.numeroAgencia = numeroAgencia;
        this.cidadeAgencia = cidadeAgencia;
        this.estadoAgencia = estadoAgencia;
        this.bairroAgencia = bairroAgencia;
    }

    public Agencia() {
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getEnderecoBanco() {
        return enderecoBanco;
    }

    public void setEnderecoBanco(String enderecoBanco) {
        this.enderecoBanco = enderecoBanco;
    }

    public String getNumeroPredio() {
        return numeroPredio;
    }

    public void setNumeroPredio(String numeroPredio) {
        this.numeroPredio = numeroPredio;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getCidadeAgencia() {
        return cidadeAgencia;
    }

    public void setCidadeAgencia(String cidadeAgencia) {
        this.cidadeAgencia = cidadeAgencia;
    }

    public String getEstadoAgencia() {
        return estadoAgencia;
    }

    public void setEstadoAgencia(String estadoAgencia) {
        this.estadoAgencia = estadoAgencia;
    }

    public String getBairroAgencia() {
        return bairroAgencia;
    }

    public void setBairroAgencia(String bairroAgencia) {
        this.bairroAgencia = bairroAgencia;
    }

    public void cadastrar() throws IOException {
        File arquivo = new File("Agencia.txt");
        arquivo.createNewFile();
        FileWriter fw = new FileWriter(arquivo);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(nomeBanco + ";" + enderecoBanco + ";" + numeroAgencia + ";" + cidadeAgencia + ";" + estadoAgencia + ";" + bairroAgencia + ";" + numeroPredio + ";");
        bw.newLine();
        bw.close();
        fw.close();
    }

    public List<Agencia> listar() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader("Agencia.txt"));
        String linha = "";
        List<Agencia> l = new ArrayList<Agencia>();
        linha = buffRead.readLine();
        while (true) {
            if (linha != null) {
                String dados[] = linha.split(";");
                Agencia u = new Agencia(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6]);
                l.add(u);
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
        return l;
    }

    public String excluiragencia() throws IOException {
        File arquivoTemp = new File("Agenciatmp.txt");
        File arquivo = new File("Agencia.txt");
        BufferedReader br;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoTemp, true))) {
            br = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] line = linha.split(";");
                if (line[2].equals(numeroAgencia)) {
                    linha = "";
                }
                bw.write(linha);
                bw.newLine();
            }
        }
        br.close();

        arquivo.delete();
        arquivoTemp.renameTo(arquivo);

        return numeroAgencia;
    }

    public String editarAgencia() throws IOException {
        File arquivoTemp = new File("tmpAgencia.txt");
        File arquivo = new File("Agencia.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoTemp, true));
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] line = linha.split(";");
            if (line[2].equals(numeroAgencia)) {
                linha = nomeBanco + ";" + enderecoBanco + ";" + numeroAgencia + ";" + cidadeAgencia + ";" + estadoAgencia + ";" + bairroAgencia + ";" + numeroPredio + ";";
            }
            bw.write(linha);
            bw.newLine();
        }
        bw.close();
        br.close();
        arquivo.delete();
        arquivoTemp.renameTo(arquivo);
        return numeroAgencia;
    }

    public void inativarAgencia() {

    }

    public void inativarConta() {

    }

    public void buscar() throws Exception {
        File arquivo = new File("Agencia.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String linha = br.readLine();
            String vet[] = linha.split(";");
            if (this.numeroAgencia.equals(vet[2])) {
                this.nomeBanco = vet[0];
                this.enderecoBanco = vet[1];
                this.cidadeAgencia = vet[3];
                this.estadoAgencia = vet[4];
                this.bairroAgencia = vet[5];
                this.numeroPredio = vet[6];
            }
        }
        br.close();
        fr.close();
    }
}
