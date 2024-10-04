package org.llanelescobar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de GestorAcademico
        GestorAcademico gestor = new GestorAcademico();

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Pérez", new Date(), "matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Ana", "García", new Date(), "matriculado");

        // Crear cursos
        Curso curso1 = new Curso(101, "Matemáticas", "Curso de álgebra y cálculo", 4, "1.0");
        Curso curso2 = new Curso(102, "Historia", "Historia universal", 3, "2.0");
        // Agregar estudiantes y cursos al gestor
        gestor.agregarEstudiante(estudiante1);
        gestor.agregarEstudiante(estudiante2);
        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);

        // Inscribir estudiantes en cursos
        gestor.inscribirEstudianteEnCurso(estudiante1, curso1);
        gestor.inscribirEstudianteEnCurso(estudiante2, curso2);

        // Mostrar estudiantes inscritos en un curso
        System.out.println("Estudiantes inscritos en Matemáticas:");
        for (Estudiante e : gestor.obtenerEstudiantesInscritos(curso1)) {
            System.out.println(e);
        }

        // Mostrar todos los estudiantes y cursos
        System.out.println("\nLista de estudiantes:");
        for (Estudiante e : gestor.listarEstudiantes()) {
            System.out.println(e);
        }

        System.out.println("\nLista de cursos:");
        for (Curso c : gestor.listarCursos()) {
            System.out.println(c);
        }
    }
}
