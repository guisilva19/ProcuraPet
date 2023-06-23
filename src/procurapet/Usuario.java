package procurapet;

public class Usuario {
    public String nome;
    public String email;
    protected String endereco;
    protected String imagem;
    private String senha;
    protected String telefone;
    
    public Usuario(String nome, String email, String endereco, String imagem, String senha, String telefone) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.imagem = imagem;
        this.senha = senha;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    };
    
    public void setNome(String novoNome) {
        nome = novoNome;
    };
    
    public String getEmail() {
        return email;
    };
    
    public void setEmail(String novoEmail) {
        email = novoEmail;
    };
    
    public String getEndereco() {
        return endereco;
    };
    
    public void setEndereco(String novoEndereco) {
        endereco = novoEndereco;
    };
    
    public String getImage() {
        return imagem;
    };
    
    public void setImagem(String novaImagem) {
        imagem = novaImagem;
    };
    
    public void setSenha(String novaSenha) {
        senha = novaSenha;
    };
    
    public String getTelefone() {
        return telefone;
    };
    
    public void setTelefone(String novoTelefone) {
        telefone = novoTelefone;
    };
    
    public Boolean login(String inputEmail, String inputSenha) {
        if(inputEmail == email && inputSenha == senha) return true;
        
        return false;
    }
    
    public Pet cadastrarPet(String nome, String cor, String nome_do_dono, String ultima_localizacao, String raca, String imagem, String contato_do_dono) {
        Pet pet = new Pet(nome, cor, nome_do_dono, ultima_localizacao, raca, imagem, contato_do_dono);
        
        return pet;
    }

    
}
