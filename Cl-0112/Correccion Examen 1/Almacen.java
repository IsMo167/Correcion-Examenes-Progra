public class Almacen {
    private Tabla[] tablas;
    private int contador;

    public Almacen() {
        tablas = new Tabla[500]; // Capacidad máxima del almacén
        contador = 0;
    }

    public void agregarTabla(Tabla tabla) {
        if (contador < tablas.length) {
            tablas[contador] = tabla;
            contador++;
        } else {
            System.out.println("El almacén está lleno. No se puede agregar más tablas.");
        }
    }

    public void setTabla(int index, Tabla tabla) {
        if (index >= 0 && index < contador) {
            tablas[index] = tabla; // Sobrescribir la tabla en el índice dado
        }
    }

    public void eliminarTabla(int index) {
        if (index >= 0 && index < contador) {
            for (int i = index; i < contador - 1; i++) {
                tablas[i] = tablas[i + 1]; // Desplazar las tablas hacia la izquierda
            }
            tablas[contador - 1] = null; // Limpiar la última posición
            contador--; // Disminuir el contador
        }
    }

    public int getContador() {
        return contador;
    }

    public Tabla getTabla(int index) {
        if (index >= 0 && index < contador) {
            return tablas[index];
        }
        return null; // Devolver nulo si el índice es inválido
    }

    public boolean estaLleno() {
        return contador >= tablas.length;
    }
}




