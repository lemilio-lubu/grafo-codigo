public class MatrizAdyacencia {

    private int numero_vertices;
    private Vertice[] vertices;
    private int[][] matriz;

    public MatrizAdyacencia(int numero_max_vertice) {
        this.matriz = new int[numero_max_vertice][numero_max_vertice];
        this.vertices = new Vertice[numero_max_vertice];
        llenado_matriz();
        this.numero_vertices = 0;
    }

    private void llenado_matriz() {
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                this.matriz[i][j] = 0;
            }
        }
    }

    /*
        Nos permite crear vetices verificando
     */
    public int verificar_existencia_vertice(String info_vertice) {
        Vertice vertice_comparador = new Vertice(info_vertice);
        boolean encontrado = false;
        int i = 0;
        for (; (i < this.numero_vertices) && !encontrado; ) {
            encontrado = this.vertices[i].esIgualVertice(vertice_comparador);
            if (!encontrado) i++;
        }
        return (i < this.numero_vertices) ? i : -1;
    }

    public void crear_vertice(String nombre_vertice) {
        boolean existe = verificar_existencia_vertice(nombre_vertice) >= 0; // false-> no existe true-> existe
        if (!existe) {
            Vertice vertice_grafo = new Vertice(nombre_vertice);
            vertice_grafo.asignarNumeroVertice(this.numero_vertices);
            this.vertices[this.numero_vertices++] = vertice_grafo;
        }
    }

    public void crear_arco(String info_vertice1, String info_vertice2) throws Exception {
        int posición_vertice1, posición_vertice2;
        posición_vertice1 = verificar_existencia_vertice(info_vertice1);
        posición_vertice2 = verificar_existencia_vertice(info_vertice2);
        if (posición_vertice1 < 0 || posición_vertice2 < 0) throw new Exception("Vertice no existe");
        this.matriz[posición_vertice1][posición_vertice2] = 1;

    }

    public void imprimir_grafo() {
        System.out.println("Representación de grafo por matriz de adyacencia");
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();

        }
        for (int i = 0; i < this.matriz.length; i++) {
            System.out.println("Vertice "+ this.vertices[i]+ " esta conenectado con: ");
            for (int j = 0; j < this.matriz.length; j++) {
                if(this.matriz[i][j] == 1){
                    System.out.println(this.vertices[j] + " ");
                }
            }
            System.out.println();

        }
    }
}
