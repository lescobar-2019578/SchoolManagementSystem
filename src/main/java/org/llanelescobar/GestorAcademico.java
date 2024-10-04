package org.llanelescobar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GestorAcademico {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private HashMap<Curso, List<Estudiante>> inscripciones;

    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new HashMap<>();
    }

    // Método para agregar un estudiante
    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para agregar un curso
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    // Método para inscribir a un estudiante en un curso
    public void inscribirEstudianteEnCurso(Estudiante estudiante, Curso curso) {
        inscripciones.putIfAbsent(curso, new ArrayList<>());
        inscripciones.get(curso).add(estudiante);
    }

    // Método para mostrar los estudiantes inscritos en un curso
    public List<Estudiante> obtenerEstudiantesInscritos(Curso curso) {
        return inscripciones.getOrDefault(curso, new ArrayList<>());
    }

    // Método para listar todos los estudiantes
    public List<Estudiante> listarEstudiantes() {
        return estudiantes;
    }

    // Método para listar todos los cursos
    public List<Curso> listarCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "GestorAcademico{estudiantes=" + estudiantes + ", cursos=" + cursos + '}';
    }
}

