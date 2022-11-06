public class Carro {

    private double velocidade;
    private String marca;
    private Condutor condutor; //faz relação entre carro e condutor

    public Carro () {
        velocidade = 0.0;
    }

    public Carro (String marca) {
        velocidade = 0.0;
        this.marca = marca;
    }

    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override

    public String toString() {
        return ("A velocidade é: " + velocidade + " a marca é: " + marca + "condutor é: " + condutor.getNome());
    }
    // como a velocidade e marca estão na propria classe não é necessario get e set para eles.

    public void acelerar() {
        velocidade = velocidade + 15;
    }

    public void travar() {
        velocidade = velocidade - 15;
        if(velocidade < 0)
            velocidade = 0.0;

    }

    public void mostrarVelocidade() {
        System.out.println("A velocidade do carro é: " + velocidade);
    }
}
