
package vetor2;

import javax.swing.JOptionPane;
public class Vetor2 {

    public static void main(String[] args) {
        double [] quad= new double [10];
       
       for(int i=0; i<=quad.length;i++){
           
           JOptionPane.showMessageDialog(null,""+i);
        
                }
        for(int i=0; i<=quad.length;i++){
       
        if (i % 2 == 1){
		JOptionPane.showMessageDialog(null,"Número ímpar: "+i);	
		}
        }
    }
    
}