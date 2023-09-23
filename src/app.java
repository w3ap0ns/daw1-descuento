public class app {

    public static void main(String[] arg){

        /*Escribe un programa en Java (Descuento) que dado el precio de un
        artículo y el precio de venta real nos muestre el porcentaje de descuento
        realizado.*/

        // Variables
        double precioArticulo = 100;
        double precioVenta = 29.6;

        // Formula
        double porcentajeVenta = (100-(precioVenta*100)/precioArticulo);

        // Output
        System.out.printf("Un producto que cuenta %.2f y es vendido a %.2f su porcentaje de descuento es: %.2f", precioArticulo , precioVenta , porcentajeVenta);

    } //public static void main(String[] arg)
} //public class app
