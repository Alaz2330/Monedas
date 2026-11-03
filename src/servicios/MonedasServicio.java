
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import modelos.CambioMoneda;

public class MonedasServicio {

    public static List<CambioMoneda> getDatos(String nombreArchivo) {
        try {
        Stream<String> lineasArchivo = Files.lines(Paths.get(nombreArchivo));
        lineasArchivo.skip(1)
            .map(linea -> linea.split(","))
        } catch (IOException e) {
            return Collections.emptyList();
        }
    }
}