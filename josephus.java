package praticando;
import java.util.List;
import java.util.ArrayList;
class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;

    public Pessoa(String nome, String telefone, String endereco, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCPF() {
        return cpf;
    }
}

public class josephus {
    public static void main(String[] args) {
        
        List<Pessoa> pessoas = new ArrayList<>();
        
        pessoas.add(new Pessoa("Ana", "(99)1234-5678", "Rua A, 123", "111.222.333-44"));
        pessoas.add(new Pessoa("Bruno", "(88)2345-6789", "Rua B, 456", "222.333.444-55"));
        pessoas.add(new Pessoa("Carla", "(77)3456-7890", "Rua C, 789", "333.444.555-66"));
        pessoas.add(new Pessoa("Daniel", "(66)4567-8901", "Rua D, 012", "444.555.666-77"));
        pessoas.add(new Pessoa("Elisa", "(55)5678-9012", "Rua E, 345", "555.666.777-88"));
        pessoas.add(new Pessoa("Fernando", "(44)6789-0123", "Rua F, 678", "666.777.888-99"));
        pessoas.add(new Pessoa("Giovanna", "(33)7890-1234", "Rua G, 901", "777.888.999-00"));
        pessoas.add(new Pessoa("Hugo", "(22)8901-2345", "Rua H, 234", "888.999.000-11"));
        pessoas.add(new Pessoa("Isabela", "(11)9012-3456", "Rua I, 567", "999.000.111-22"));
        pessoas.add(new Pessoa("João", "(00)0123-4567", "Rua J, 890", "000.111.222-33"));
        pessoas.add(new Pessoa("Kátia", "(11)1234-5678", "Rua K, 234", "111.222.333-44"));
        pessoas.add(new Pessoa("Lucas", "(22)2345-6789", "Rua L, 456", "222.333.444-55"));
        pessoas.add(new Pessoa("Mariana", "(33)3456-7890", "Rua M, 789", "333.444.555-66"));
        pessoas.add(new Pessoa("Nathan", "(44)4567-8901", "Rua N, 012", "444.555.666-77"));
        pessoas.add(new Pessoa("Olivia", "(55)5678-9012", "Rua O, 345", "555.666.777-88"));
        pessoas.add(new Pessoa("Pedro", "(66)6789-0123", "Rua P, 678", "666.777.888-99"));
        pessoas.add(new Pessoa("Quiteria", "(77)7890-1234", "Rua Q, 901", "777.888.999-00"));
        pessoas.add(new Pessoa("Rafael", "(88)8901-2345", "Rua R, 234", "888.999.000-11"));
        pessoas.add(new Pessoa("Sofia", "(99)9012-3456", "Rua S, 567", "999.000.111-22"));
        pessoas.add(new Pessoa("Tiago", "(99)2345-6789", "Rua T, 890", "000.111.222-33"));

        int m = 17;

        
        Pessoa pessoaSobrevivente = encontrarSobrevivente(new ArrayList<>(pessoas), m);

        System.out.println("A pessoa sobrevivente é: " + pessoaSobrevivente.getNome());
        System.out.println("Informações da pessoa sobrevivente:");
        System.out.println("Nome: " + pessoaSobrevivente.getNome());
        System.out.println("Telefone: " + pessoaSobrevivente.getTelefone());
        System.out.println("Endereço: " + pessoaSobrevivente.getEndereco());
        System.out.println("CPF: " + pessoaSobrevivente.getCPF());
    }

    public static Pessoa encontrarSobrevivente(List<Pessoa> pessoas, int m) {
        int indice = 0;
        while (pessoas.size() > 1) {
            indice = (indice + m - 1) % pessoas.size();
            pessoas.remove(indice);
        }
        return pessoas.get(0);
    }
}
