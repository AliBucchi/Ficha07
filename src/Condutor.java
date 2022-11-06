public class Condutor {
    private String nome;

    //deve estar explicito no codigo pois ele permite criar objetos vazios e objetos com nome do condutor.
    public Condutor (String nome) {
        this.nome = nome;
    }
    public String getNome () {
        return nome;
    }


}
