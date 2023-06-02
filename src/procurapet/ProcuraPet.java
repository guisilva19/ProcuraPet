package procurapet;

public class ProcuraPet {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("Igor", "teste@teste.com", "Lorem Ipsum", "https", "12345", "779911111");

        System.out.println("Informações sobre o usuario criado");
        System.out.println("Nome do usuario: " + usuario.nome);
        System.out.println("Email do usuario: " + usuario.email);
        System.out.println("Endereco do usuario: " + usuario.endereco);
        System.out.println("Imagem do usuario: " + usuario.imagem);
        System.out.println("Telefone do usuario: " + usuario.telefone);
    }

}
