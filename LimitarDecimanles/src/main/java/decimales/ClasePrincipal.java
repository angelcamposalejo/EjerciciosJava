/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimales;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 *
 * @author angelcampos
 */
public class ClasePrincipal {
    public static void main(String[] args){
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raíz cuadrada de "+ numero + " es: "+ raiz);
    
        //Utilizando la clase Decimal Format
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raíz cuadrada de "+ numero + " es: "+ df.format(raiz));
    
        //Utilizando String format
        System.out.println("La raíz cuadrada de "+ numero + " es: "+ String.format("%.2f", raiz));
    
        //Utilizando la clase Math.round
        System.out.println("La raíz cuadrada de "+ numero + " es: "+ (double)Math.round(raiz * 100d) / 100);
    
        //Utilizando la clase BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(2,RoundingMode.HALF_UP);
        System.out.println("La raíz cuadrada de "+ numero + " es: "+ bd.doubleValue());
    }
}
