//Criar uma classe Java chamada Cliente, com os seguintes atributos, código, nome, data nascimento, endereço, cidade, estado, CEP, e-mail e número do cartão de crédito. Essa classe será um molde, que representará o que um cliente deve ter e como ele deve se comportar.
package Atv09;

public class Cliente {
    public String codigo;
    public String nome;
    public String data_nascimento;
    public String endereco;
    public String cidade;
    public String estado;
    public String cep;
    public String email;
    public String cartao_credito;

    public void mostrar(){
        System.out.println("Código do Cliente:"+codigo);
        System.out.println("Nome:"+nome+" Data de Nascimento:"+data_nascimento);
        System.out.println("Endereço:"+endereco+" CEP:"+cep);
        System.out.println("Estado:"+estado+" Cidade:"+cidade);
        System.out.println("N° Cartão de Crédito:"+cartao_credito+" E-mail:"+email);
    }

    
}
