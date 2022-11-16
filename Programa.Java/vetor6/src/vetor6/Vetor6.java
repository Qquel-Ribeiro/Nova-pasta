
package vetor6;
import javax.swing.JOptionPane;

public class Vetor6 {

    public static void main(String[] args) {
        double [] num = new double [10];
       
        
        for (int i = 0; i < 5; i++) {
            num[i]=Double.parseDouble(JOptionPane.showInputDialog(null, " Insira um número:"));
            
        }
        JOptionPane.showMessageDialog(null, num);
        
        JOptionPane.showMessageDialog(null,"Agora a ordem invertida");
        
        for (int j = 5 - 1; j >= 0; j--) {
            JOptionPane.showMessageDialog(null, num[j]+"");
        }
    
    }
    
} 
