import java.util.Scanner;

public class Inventario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos a registrar:");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); 

        String[] inventario = new String[cantidadProductos];

        // Registro de productos
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ":");
            inventario[i] = scanner.nextLine();
        }

        // Búsqueda de producto
        System.out.println("Ingrese el nombre del producto a buscar:");
        String productoBuscado = scanner.nextLine();

        if (buscarProducto(inventario, productoBuscado)) {
            System.out.println("El producto \"" + productoBuscado + "\" está disponible en el inventario.");
        } else {
            System.out.println("El producto \"" + productoBuscado + "\" no está disponible en el inventario.");
        }

        scanner.close();
    }

    public static boolean buscarProducto(String[] inventario, String productoBuscado) {
        for (String producto : inventario) {
            if (producto.equalsIgnoreCase(productoBuscado)) {
                return true;
            }
        }
        return false;
    }
}

