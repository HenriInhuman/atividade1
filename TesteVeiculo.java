import javax.swing.JOptionPane;

public class TesteVeiculo {
    public static void main(String[] args) {
        Carros carrin = new Carros();
        Carros carrin2 = new Carros();
        String corCarro = JOptionPane.showInputDialog("Para veiculo 1, qual a cor do carro?");
        String numAssentos = JOptionPane.showInputDialog("Para veiculo 1, qual o número de assentos?");
        
        String corCarro2 = JOptionPane.showInputDialog("Para veiculo 2, qual a cor do carro?");
        String numAssentos2 = JOptionPane.showInputDialog("Para veiculo 2, qual o número de assentos?");
        
        
        carrin.setNumAssentos(numAssentos);
        carrin.setCorCarro(corCarro);
        carrin.exibirMsg();
    
        carrin2.setCorCarro(corCarro2);
        carrin2.setNumAssentos(numAssentos2);
        carrin2.exibirMsg();
    }
}

    