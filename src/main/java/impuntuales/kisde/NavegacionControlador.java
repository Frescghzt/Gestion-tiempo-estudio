package impuntuales.kisde;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller  // Indica que esta clase maneja solicitudes web
public class NavegacionControlador {
    // Método para la página de inicio
    @GetMapping("/")  // Mapea la raíz del sitio web
    public String paginaInicio(Model model) {
        
        return "estudio"; 
    }

    // Método para la página de estudios
    @GetMapping("/erhgfgh")  // Mapea la ruta /estudios
    public String paginaEstudios(Model model) {
        // Agrega datos para mostrar en la página
        model.addAttribute("horasEstudio", 5);
        model.addAttribute("materias", new String[]{"Matemáticas", "Programación", "Inglés"});
        
        // Retorna el nombre de la plantilla HTML de estudios
        return "estudasdasdasio"; 
    }
}
