//Criar uma nova classe chamada CadastroDeClientes. Ela deve ter um método main que cria um novo cliente, preenche os atributos do cliente e depois exibe os valores na tela.

package Atv09;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.codigo = "01"; 
        cliente1.nome="Jorge"; 
        cliente1.data_nascimento="18/04/1998";
        cliente1.endereco="Rua das Pombas 1200";     
        cliente1.cidade="Orlando";       
        cliente1.estado="Florida";      
        cliente1.cep="85814532";       
        cliente1.email="jorgebonitao@gmail.com";
        cliente1.cartao_credito="345457983602018";
        
        cliente1.mostrar();


    }
}
