
package vetor4;

import javax.swing.JOptionPane;
public class Vetor4 {

    public static void main(String[] args) {
        
        double [] vet = new double [3];
        
         for (int i=0; i<vet.length;i++){
           vet[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+(i+1)+"º valor: "));
                     
       }
         for (int j=0; j<vet.length;j++){
           if ((vet[j]%2)!= 0){
             
	JOptionPane.showMessageDialog(null,"Números ípares: "+vet[j]);
                
		       
       }
    }
    
}
}