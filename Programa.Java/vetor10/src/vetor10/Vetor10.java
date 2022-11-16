
package vetor10;
import javax.swing.JOptionPane;
public class Vetor10 {

    public static void main(String[] args) {
        int vet [] = new int [10];
              
        
        for (int j=0; j<vet.length;j++){
            vet[j] =Integer.parseInt(JOptionPane.showInputDialog(null," Insira uma posição até 100"));
            
           if (vet[j]%2!= 0){
             
	JOptionPane.showMessageDialog(null,"A posição do vetor "+vet[j]+" é I");                
	  
       }
           else{
            JOptionPane.showMessageDialog(null,"A posição do vetor "+vet[j]+" é P");
        }
    }
    
    
    
    }}
