public class Vertice {
    private String informacion_vertice;
    private int numero_vertice;
    public Vertice(String informacion_vertice){
        this.informacion_vertice = informacion_vertice;
        this.numero_vertice = -1;
    }

    /*
        Agrega el numero de vertice para establecer un orden
     */
    public void asignarNumeroVertice(int numero_vertice) {
        this.numero_vertice = numero_vertice;
    }

    /*
        Retorna el valor de la información del vértice
     */
    public String getInformacionVertice() {
        return this.informacion_vertice;
    }

    /*
        Retorna la comparación de si 2 vertices son iguales
     */
    public boolean esIgualVertice(Vertice vertice_1) {
        return this.informacion_vertice.equals(vertice_1.getInformacionVertice());
    }
}
