public class Principal {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro("Fiat");
        Condutor condutor1 = new Condutor ("Ana"); //precisa criar a get e set do Condutor no carro.

        carro1.setCondutor(condutor1);

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.travar();
        carro1.mostrarVelocidade();
        carro1.travar();
        System.out.println(condutor1.getNome());

    }
}
