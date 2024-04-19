import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarPelicula {

    public void guardarJson(Pelicula pelicula){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String direccion = "src/peliculasBuscadas";
        File directorio = new File(direccion);
        if (!directorio.exists()){
            directorio.mkdir();
        }
        String rudaDeArchivo = direccion +"/"+ pelicula.title()+ ".json";
         try {
             FileWriter escritura = new FileWriter(rudaDeArchivo);
             escritura.write(gson.toJson(pelicula));
             escritura.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
