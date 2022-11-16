
package vetor8;

import javax.swing.JOptionPane;
public class Vetor8 {

    public static void main(String[] args) {
        int[] vet1 = new int [3];
       int [] vet2 = new int [vet1.length];
       int [] vet3 = new int [vet1.length];
       
       for (int i=0; i<vet1.length;i++){
           vet1[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+(i+1)+"º valor: "));
           
           
       }
       
       for (int i=0; i<vet1.length;i++){
           vet2[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o "+(i+1)+"º valor: "));
           
           
       }
       
       for (int i=0; i<vet1.length;i++){
          if(vet1[i]==vet2[i]){
              vet3[i]=1;
          }
          else {
              vet3[i]=0;
           
       }
       }
        for (int i=0; i<vet1.length;i++){
          
           JOptionPane.showMessageDialog(null,vet3[i]);
           
       }
     
    }
    
}
