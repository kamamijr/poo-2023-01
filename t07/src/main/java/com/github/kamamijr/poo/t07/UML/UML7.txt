public class Pessoa{
private String nome;
private String endereco;
}

class PessoaFisica extends Pessoa{
    private String cpf;
    private String corPele;
}

class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String nomeFantasia;
}
