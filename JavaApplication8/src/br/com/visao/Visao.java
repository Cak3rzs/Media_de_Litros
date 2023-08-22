package br.com.visao;

import br.com.controle.Controle;
import javax.swing.JOptionPane;

public class Visao {
    public static void main(String[] args) {
        double km_inicial = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem inicial:"));
        double km_final = Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem final:"));
        double quantidade_de_Gasolina = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros abastecidos:"));

        Controle veiculo = new Controle(km_inicial, km_final, quantidade_de_Gasolina);
        double consumo_Medio = veiculo.calcularConsumoMedio();

        JOptionPane.showMessageDialog(null, "Consumo médio do veículo: " + consumo_Medio + " km/l");
    }
}