error id: file://<WORKSPACE>/src/main/java/com/uap/Alumno.java:_empty_/nota3#
file://<WORKSPACE>/src/main/java/com/uap/Alumno.java
empty definition using pc, found symbol in pc: _empty_/nota3#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1502
uri: file://<WORKSPACE>/src/main/java/com/uap/Alumno.java
text:
```scala
package com.uap;

import java.util.List;
import java.util.Objects;

public class Alumno {
  
    private long dni;

    private String nombre;

    private List<Integer> notas;
    
    public Alumno(long dni) {
        this.dni = dni;
    }

    public Alumno(long dni, String nombre) {
        this(dni);
        this.nombre = nombre;
    }

    public double promedio() {
        return (this.nota1 +this.nota2+this.nota3)/3.0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        
        if (obj instanceof Alumno) {
            Alumno alumno = (Alumno) obj;
            return alumno.dni == this.dni;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.dni);
    }

    @Override
    public String toString() {
        return this.dni + " " + this.nombre;
    }

    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNota1() {
        return notas.get(0);
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public int getNota2() {
        return notas.get(0);
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public int getNota3() {
        return not@@a3;
    }
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    

}

```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/nota3#