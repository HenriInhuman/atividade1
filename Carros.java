import javax.swing.JOptionPane;

public class Carros {
    private String numAssentos;
    private String corCarro;

    public String getCorCarro() {
        return corCarro;
    }
    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }
    public String getNumAssentos() {
        return numAssentos;
    }
    public void setNumAssentos(String numAssentos) {
        this.numAssentos = numAssentos;
    }
    public void exibirMsg(){
        System.out.printf("A cor do carro é %s e o número de assentos %s\n", getCorCarro(), getNumAssentos());
    }
    
}