 package classes;

 public class Carro {
    private String placa;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    public Motorista getMotorista(){
        return this.motorista;
    }

    public void setMotorista(Motorista motorista){
        this.motorista = motorista;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public int getNumChassi() {
        return numChassi;
    }
    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public Carro(String placa, int numChassi, Motorista piloto) {
        setPlaca(placa);                
        setNumChassi(numChassi);
        setMotorista(piloto);
        getMotorista().setVeiculoAtual(this);
    }

    void acelerar(){
        velocidadeAtual++;
    }

    void acelerar(int limite){
        for (int i = 0; i < limite; i++) {
            this.acelerar();
        }
    }
    
}