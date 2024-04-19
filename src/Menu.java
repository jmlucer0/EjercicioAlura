import java.util.Scanner;

public class Menu {

    public void menuDeBusqueda(){
        BuscarPelicula consulta = new BuscarPelicula();
        System.out.println("Elija un numero de pelicula de Star Wars");
        Scanner busqueda = new Scanner(System.in);

        try{
            var numeroDePelicula = busqueda.nextInt();
            Pelicula pelicula = consulta.Buscar(numeroDePelicula);
            GuardarPelicula guardar = new GuardarPelicula();
            guardar.guardarJson(pelicula);
            System.out.printf("La pelicula es: " + pelicula);
        }catch (Exception e){
            System.out.println("no se encontro la pelicula");
        }
    }
}
