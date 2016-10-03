package pe.edu.ulima.visortexto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public interface ModoVisualizadorAdapter {
    
    public ByteArrayOutputStream renderizar(String titulo, String contenido) throws IOException;
}
