package impuntuales.kisde;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller  // Indica que esta clase maneja solicitudes web
public class NavegacionControlador {
    // Método para la página de inicio
    @GetMapping("/")  // Mapea la raíz del sitio web
    public String paginaInicio(Model model) {
        
        return "inicio"; 
    }

    // Método para la página de estudios
    @GetMapping("/activity2")  // Mapea la ruta /estudios
    public String paginaEstudios(Model model) {
        
        return "activity2"; 
    }
}
