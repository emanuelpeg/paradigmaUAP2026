package com.uap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alumno unAlumno = new Alumno(5654654);
        unAlumno.setNombre("Abi");
        unAlumno.setNota1(50);
        unAlumno.setNota2(80);
        unAlumno.setNota3(45);

        Alumno otroAlumno = new Alumno(5656654);
        otroAlumno.setNombre("Mateos");
        otroAlumno.setNota1(100);
        otroAlumno.setNota2(80);
        otroAlumno.setNota3(95);
        Curso unCurso = new Curso("poo");
        unCurso.getAlumnos().add(otroAlumno);
        unCurso.getAlumnos().add(unAlumno);

        System.out.println(unCurso.promedio());

    }
}
