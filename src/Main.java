import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Creamos el catálogo usando un HashMap
        Map<String, Material> catalogo = new HashMap<>();

        // Creamos los objetos de tipo Libro y Revista
        Libro libro1 = new Libro("LIB-001", "Cien años de soledad", 1967, true, "Gabriel García Márquez", "978-0307474728");
        Libro libro2 = new Libro("LIB-003", "Harry Potter y la piedra filosofal", 1997, true, "J.K. Rowling", "978-8449303357");
        Libro libro3 = new Libro("LIB-004", "Harry Potter y el prisionero de Azkaban", 1999, false, "J.K. Rowling", "978-8478885190");
        Libro libro4 = new Libro("LIB-005", "Los Juegos del Hambre", 2008, true, "Suzanne Collins", "978-8427202122");

        Revista revista1 = new Revista("REV-001", "National Geographic", 2023, true, 452, "Ciencia y Naturaleza");

        // Agregamos todos los materiales al HashMap usando put(clave, valor)
        catalogo.put(libro1.getCodigo(), libro1);
        catalogo.put(libro2.getCodigo(), libro2);
        catalogo.put(libro3.getCodigo(), libro3);
        catalogo.put(libro4.getCodigo(), libro4);
        catalogo.put(revista1.getCodigo(), revista1);

        // Busqueda de un material en especifico
        System.out.println("--- Búsqueda de un material específico ---");
        String codigoBuscado = "LIB-001";
        Material encontrado = catalogo.get(codigoBuscado);

        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("Material no encontrado en el catálogo.");
        }

        // Listado completo del catalogo
        System.out.println("\n--- Listado completo del Catálogo de la Biblioteca ---");
        for (Material material : catalogo.values()) {
            material.mostrarInfo();
        }
    }
}