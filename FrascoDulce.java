

/*
 *Crear un frasco de dulce 
 * Tratar de envasar 250 gramos de dulce
 * Mostrar si fue posible envasar los 250 gramos o solo 200
 * Intentar sacar 150 gramos de dulcce y luego sacar 60 gramos 
 * Mostrar la cantidad de dulce que efectivamente se pudo sacar 
 * y mostrar la cantidad que queda en el frasco 
 */
public class FrascoDulce {
    public static void main(String[] args) {
         FrascoDulce frasco1 = new FrascoDulce();
         
        int capacidadMaxima = 250; // 
        int cantidadDulce = 200; // 


        //Intentamos envasar 
        int cantidadAEnvasar = 250;
        if (cantidadDulce + cantidadAEnvasar <= capacidadMaxima) {

             cantidadDulce += cantidadAEnvasar;

             System.out.println("Se envasaron 250 gramos.");
        } else {
            System.out.println("Solo se pudieron envasar 200 gramos");
            cantidadDulce = capacidadMaxima;
        }

        // Sacamos 150 gramos y luego 60 gramos
        int cantidadASacar = 150;
        if (cantidadDulce >= cantidadASacar) {
            cantidadDulce -= cantidadASacar;

        } else {
         cantidadASacar = cantidadDulce;  

            cantidadDulce = 0;
        }

        cantidadASacar = 60;
        if (cantidadDulce >= cantidadASacar) {
            cantidadDulce -= cantidadASacar;
        
        } else {
            cantidadASacar = cantidadDulce;

            cantidadDulce = 0;
        }

      
        System.out.println("Se sacaron  " +(250 - cantidadDulce) + "gramos de dulce.");

        System.out.println("Restan" + cantidadDulce + " gramos de dulce en el frasco");
    }
}
