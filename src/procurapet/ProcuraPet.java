package procurapet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcuraPet {

    public static void main(String[] args) throws SQLException {
        Usuario usuario = new Usuario("Igor", "teste@teste.com", "Lorem Ipsum", "https", "12345", "779911111");
        Pet pet = usuario.cadastrarPet("Kaua", "preto", "Alvinio", "Riacho de Santana", "pinscher", "teste", "12345");

        System.out.println("Informações sobre o usuario criado");
        System.out.println("Nome do usuario: " + usuario.nome);
        System.out.println("Email do usuario: " + usuario.email);
        System.out.println("Endereco do usuario: " + usuario.endereco);
        System.out.println("Imagem do usuario: " + usuario.imagem);
        System.out.println("Telefone do usuario: " + usuario.telefone);
        
        System.out.println(" ");
        System.out.println("Informações sobre o Pet criado");
        System.out.println("Nome: " + pet.nome);
        System.out.println("Cor: " + pet.cor);
        System.out.println("Nome do dono: " + pet.nome_do_dono);
        System.out.println("Contato do dono: " + pet.contato_do_dono);
        System.out.println("Ultima localizacao: " + pet.ultima_localizacao);
        System.out.println("Raca: " + pet.raca);
        System.out.println("Imagem: " + pet.imagem);

//        Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");;
//        conexao.close
    }

}
