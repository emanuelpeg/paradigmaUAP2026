package com.uap;

public class Alumno {
  
    private long dni;

    private String nombre;

    private int nota1;
    private int nota2;
    private int nota3;
    
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
        return nota1;
    }
    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }
    public int getNota2() {
        return nota2;
    }
    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }
    public int getNota3() {
        return nota3;
    }
    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    

}
