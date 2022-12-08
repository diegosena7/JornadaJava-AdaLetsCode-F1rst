package orientacao_objetos_solid.project.exercicio_livraria.superclass;


public class Produtos implements Comparable<Produtos>{

    private String nome;
    private Integer id;
    private Double preco;

    public Produtos(String nome, Integer id, Double preco) {
        super();
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Produtos produtos) {
        return this.nome.compareTo(produtos.getNome());
    }
}
