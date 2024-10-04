package org.llanelescobar;
import java.util.Date;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String estado;


    public Estudiante(int id, String nombre, String apellido, Date fechaNacimiento, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Estudiante{id=" + id + ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' + ", fechaDeNacimiento=" + fechaNacimiento +
                ", estado='" + estado + '\'' + '}';
    }
}
