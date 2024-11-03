package ad_tarea7;

import org.w3c.dom.Document;

import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class GeneraXml {

	
	public static void crearElementoAlumno(Document doc, Element elem, Alumno alum) {
	//	crearElementoAlumno("NIA", Integer.toString(alum.getNia()), elem, doc);
		elem.setAttribute("NIA", Integer.toString(alum.getNia()));
		crearElementoAlumno("Nombre", alum.getNombre(), elem, doc);
		crearElementoAlumno("Apellido", alum.getApellido(), elem, doc);
		crearElementoAlumno("FechaNacimiento", alum.getFechaNacimiento().toString(), elem, doc);
		crearElementoAlumno("Genero", Integer.toString(alum.getGenero()), elem, doc);
		crearElementoAlumno("Ciclo", alum.getCiclo(), elem, doc);
		crearElementoAlumno("Curso", alum.getCurso(), elem, doc);
		crearElementoAlumno("Grupo", alum.getGrupo(), elem, doc);
	}
	
	
	public static void crearElementoAlumno(String dato, String valor, Element alumno, Document documento){
		Element elem = documento.createElement(dato);
		Text texto = documento.createTextNode(valor);
		elem.appendChild(texto);
		alumno.appendChild(elem);
	}
	
	
	
	
	
}
