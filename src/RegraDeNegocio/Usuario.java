package RegraDeNegocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String cpf;
    private String endereco;
    private String numeroResidencia;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;

    public Usuario(String nome, String cpf, String endereco, String numeroResidencia, String bairro, String cidade, String estado, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.numeroResidencia = numeroResidencia;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.email = email;
    }
//-------

    public Usuario() {

    }

    //------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void cadastrarUsuario() throws IOException {
        File arquivo = new File("usuario.txt");
        arquivo.createNewFile();
        FileWriter fw = new FileWriter(arquivo, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(nome + ";" + cpf + ";" + endereco + ";" + bairro + ";" + numeroResidencia + ";" + cidade + ";" + estado + ";" + email + ";");
        bw.newLine();
        bw.close();
        fw.close();
    }

    public String edit() throws IOException {
        File arquivoTemp = new File("tmpusuario.txt");
        File arquivo = new File("usuario.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoTemp, true));
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] line = linha.split(";");
            if (line[1].equals(cpf)) {
                linha = this.nome + ";" + this.cpf + ";" + this.endereco + ";" + this.numeroResidencia + ";" + this.bairro + ";" + this.cidade + ";" + this.estado + ";" + this.email + ";";
            }
            bw.write(linha);
            bw.newLine();
        }
        bw.close();
        br.close();
        arquivo.delete();
        arquivoTemp.renameTo(arquivo);
        return cpf;
    }

    public List<Usuario> listar() throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader("usuario.txt"));
        String linha = "";
        List<Usuario> l = new ArrayList<Usuario>();
        linha = buffRead.readLine();

        while (true) {
            if (linha != null) {
                String dados[] = linha.split(";");
                Usuario u = new Usuario(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], dados[6], dados[7]);
                l.add(u);
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
        return l;
    }

    public void excluir(String newcpf) {
        this.cpf = newcpf;
    }

    public String excluirusuario() throws IOException {
        File arquivoTemp = new File("tmpusuario.txt");
        File arquivo = new File("usuario.txt");

        BufferedReader br;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoTemp, true))) {
            br = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] line = linha.split(";");
                if (line[1].equals(cpf)) {
                    linha = "";
                }
                bw.write(linha);
            }
        }
        br.close();

        arquivo.delete();
        arquivoTemp.renameTo(arquivo);

        return cpf;
    }

    void salvar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void buscar() throws Exception {
        File arquivo = new File("usuario.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String linha = br.readLine();
            String vet[] = linha.split(";");
            if (this.cpf.equals(vet[1])) {
                this.nome = vet[0];
                this.endereco = vet[2];
                this.numeroResidencia = vet[3];
                this.bairro = vet[4];
                this.cidade = vet[5];
                this.estado = vet[6];
                this.email = vet[7];
            }
        }
        br.close();
        fr.close();
    }
}
