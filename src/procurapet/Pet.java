package procurapet;


public class Pet {
    protected String nome;
    protected String cor;
    protected String nome_do_dono;
    protected String ultima_localizacao;
    protected String raca;
    protected String imagem;
    protected String contato_do_dono;
    
    public Pet(String nome, String cor, String nome_do_dono, String ultima_localizacao, String raca, String imagem, String contato_do_dono) {
        this.nome = nome;
        this.cor = cor;
        this.nome_do_dono = nome_do_dono;
        this.ultima_localizacao = ultima_localizacao;
        this.raca = raca;
        this.imagem = imagem;
        this.contato_do_dono = contato_do_dono;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String novoNome) {
        nome = novoNome;
    }
    
    public String getCor() {
        return cor;
    }
    
    public void setCor(String novaCor) {
        cor = novaCor;
    }
    
    public String getNomeDoDono() {
        return nome_do_dono;
    }
    
    public void setNomeDoDono(String novoNome) {
        nome_do_dono = novoNome;
    }
    
    public String getUltimaLocalizacao() {
        return ultima_localizacao;
    }
    
    public void setUltimaLocalizacao(String novaLocalizacao) {
        ultima_localizacao = novaLocalizacao;
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String novaRaca) {
        raca = novaRaca;
    }
    
    public String getImagem() {
        return imagem;
    }
    
    public void setImagem(String novaImagem) {
        imagem = novaImagem;
    }
    
    public String getContatoDoDono() {
        return contato_do_dono;
    }
    
    public void setContatoDoDono(String novoContato) {
        contato_do_dono = novoContato;
    }
}