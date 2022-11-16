
package vetor5;
import javax.swing.JOptionPane;
public class Vetor5 {

    public static void main(String[] args) {
        double [] valor = new double [50];
        double par, impar;
        
         for(int i=0; i<=valor.length;i++){
         if (i % 2 == 1){
             
             par= i*0.05;
		JOptionPane.showMessageDialog(null,"Número ímpar: "+ i +"\n Com porcentagem de 5%: "+par);
                
		}
       
          if (i % 2 == 0){
             
             impar= i*0.02;
	JOptionPane.showMessageDialog(null,"Número par: "+i+"\n Com porcentagem de 2%: "+impar);
                
		}
         }
        
                
    }
    
}
