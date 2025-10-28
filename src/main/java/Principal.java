
import java.rmi.RemoteException;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loren
 */
public class Principal {
    public static void main(String[] args) throws RemoteException {
     String opcao = "";
        Calculadora calculadora = new Calculadora();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Adição \n3 - Subtração \n4 - Multiplicação \n5 - Divisão \n9 - Sair");
            switch (Integer.parseInt(opcao)) {
                case 1:
                    calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                    calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getSoma());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Diferença: " + calculadora.getSubtrair());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getMultiplicar());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Quociente: " + calculadora.getDividir());
                    break;
                case 9: 
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;                
                default:
                    JOptionPane.showMessageDialog(null, "Alternativa inválida!");
                    break;
            }
        }
    }
}