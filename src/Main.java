public class Main {
    public static void main(String[] args) {
        MatrizAdyacencia matriz_1 = new MatrizAdyacencia(7);

        matriz_1.crear_vertice("A");
        matriz_1.crear_vertice("B");
        matriz_1.crear_vertice("C");
        matriz_1.crear_vertice("D");
        matriz_1.crear_vertice("T");
        matriz_1.crear_vertice("H");
        matriz_1.crear_vertice("R");

        try {
            matriz_1.crear_arco("D", "B");
            matriz_1.crear_arco("D", "C");
            matriz_1.crear_arco("B", "H");
            matriz_1.crear_arco("C", "R");
            matriz_1.crear_arco("R", "H");
            matriz_1.crear_arco("H", "T");
            matriz_1.crear_arco("D", "B");
            matriz_1.crear_arco("H", "A");
            matriz_1.crear_arco("H", "D");

            matriz_1.imprimir_grafo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}