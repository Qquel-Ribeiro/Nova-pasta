
package vetor7;

import javax.swing.JOptionPane;

public class Vetor7 {

    public static void main(String[] args) {
       int[] vet1 = new int [30];
       int [] vet2 = new int [vet1.length];
       int [] vet3 = new int [vet1.length];
       
       for (int i=0; i<vet1.length;i++){
           vet1[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+(i+1)+"º valor: "));
           
           
       }
       
       for (int i=0; i<vet1.length;i++){
           vet2[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+(i+1)+"º valor: "));
           
           
       }
       
       for (int i=0; i<vet1.length;i++){
           vet3[i]= vet1[i]+vet2[i];
           
       }
       for (int i=0; i<vet1.length;i++){
          
           JOptionPane.showMessageDialog(null,(i+1)+"º soma:"+ vet1[i]+" + "+vet2[i]+"= "+vet3[i]);
           
       }
     
    }
    
}
