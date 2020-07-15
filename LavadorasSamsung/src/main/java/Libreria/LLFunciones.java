/*
* Ejericios para las funciones logicas de una lavadora
*/
package Libreria;

/**
 * Ejericio POO (Encapsulacion)
 * @author angelcampos
 */
public class LLFunciones {
    
    private int kilos = 0, llenadoCompleto = 0, tipoRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;
    
    public LLFunciones(int kilos, int tipoRopa){
        this.kilos = kilos;
        this.tipoRopa = tipoRopa;
    }
    
    private void Llenado(){
        if(kilos<=12){
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
        }else{
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }
    
    private void Lavado(){
        Llenado();
        if(llenadoCompleto == 1){
            if(getTipoRopa() == 1){
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else if(getTipoRopa() == 2){
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else{
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color / Lavado intenso");
                lavadoCompleto = 1;
            }
        }
    }
    
    private void Secado(){
        Lavado();
        if(lavadoCompleto == 1){
            System.out.println("Secando...");
            secadoCompleto = 1;
        }
    }
    
    public void CicloFinalizado(){
        Secado();
        if(secadoCompleto == 1){
            System.out.println("Tu ropa esta lista!.");
        }
    }

    //Implementación de ejercicio POO (Setter y Getter)
    
    /**
     * @return the tipoRopa
     */
    public int getTipoRopa() {
        return tipoRopa;
    }

    /**
     * @param tipoRopa the tipoRopa to set
     */
    public void setTipoRopa(int tipoRopa) {
        this.tipoRopa = tipoRopa;
    }
        
    
}
