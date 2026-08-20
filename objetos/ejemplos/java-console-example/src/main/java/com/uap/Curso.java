package com.uap;

import java.util.ArrayList;
import java.util.List;

class Curso {

  private List<Alumno> alumnos; 
  private String nombre;

  public Curso(String nombre) {
    this.nombre = nombre;
    this.alumnos = new ArrayList<>();
  }

  public double promedio() {
    double acu = 0.0;
    for (Alumno a : this.alumnos) {
        acu += a.promedio();
    } 
    return acu / this.alumnos.size();
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Curso other = (Curso) obj;
    if (nombre == null) {
        if (other.nombre != null)
            return false;
    } else if (!nombre.equals(other.nombre))
        return false;
    return true;
  }

  public List<Alumno> getAlumnos() {
    return alumnos;
  }

  public void setAlumnos(List<Alumno> alumnos) {
    this.alumnos = alumnos;
  }

  public String getNombre() {
    return nombre;
  }

  
}
