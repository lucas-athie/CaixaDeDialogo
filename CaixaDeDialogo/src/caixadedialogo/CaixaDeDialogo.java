/*/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package caixadedialogo;
import javax.swing.JOptionPane;

/**
 *
 * @author luska
 */
public class CaixaDeDialogo {
    
    public static float delta(float a,float b,float c){
        return(b*b - 4*a*c);
    }
    
    public static void main(String[] args) {
        String valor, raizes;
        float a, b, c, delta, sqrtdelta, raiz1, raiz2;
        
        valor = JOptionPane.showInputDialog("Dgite o valor de A: ");
        a = Float.parseFloat(valor.trim());
        
        valor = JOptionPane.showInputDialog("Dgite o valor de B: ");
        b = Float.parseFloat(valor.trim());
        
        valor = JOptionPane.showInputDialog("Dgite o valor de c: ");
        c = Float.parseFloat(valor.trim());
        
        while(a == 0){
            if(a == 0){
                valor = JOptionPane.showInputDialog("O valor de A não pode ser , digite novamente: ");
                a = Float.parseFloat(valor.trim());
            }
        }
        
        delta = delta(a, b, c);
        
        if(delta(a,b,c) >= 0){
            raiz1 = (-b + (float)Math.sqrt(delta))/(2*a);
            raiz2 = (-b - (float)Math.sqrt(delta))/(2*a);
            
            raizes = String.format("As raízes são %.2f e %.2f", raiz1, raiz2);
            JOptionPane.showMessageDialog(null, raizes);
            
        }else{
            raizes = String.format("As raízes são \n" +
                    "%.2f + %.2fi\n" +
                    "%2f - %2fi", (-b/(2*a)), ( (float)Math.sqrt(-delta) / (2*a) ),
                    (-b/(2*a)), ( (float)Math.sqrt(-delta) / (2*a) ));
            
            JOptionPane.showMessageDialog(null, raizes);
            
        }
    }
}