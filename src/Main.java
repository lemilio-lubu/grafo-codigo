public class Main {
    public static void main(String[] args) {
        //creación de un vertice o nodo de un gráfo
        Vertice vertice_1 = new Vertice("información");
        //metodos básicos segun el ingeniero
        vertice_1.asignarNumeroVertice(1);
        String nombre = vertice_1.getInformacionVertice();
        if(vertice_1.esIgualVertice(vertice_1)){
            System.out.println("es nodo es igual");
        }
        System.out.println(vertice_1);
    }


}