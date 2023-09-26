package proyectotg23;

import java.time.LocalDate;
import java.util.Iterator;
import proyectotg23.accesoADatos.AlumnoData;
import proyectotg23.accesoADatos.InscripcionData;
import proyectotg23.accesoADatos.MateriaData;
import proyectotg23.entidades.Alumno;
import proyectotg23.entidades.Inscripcion;
import proyectotg23.entidades.Materia;

public class ProyectoTG23 {

    public static void main(String[] args) {
        //Conexion.getConexion();
        //guardarAlumno
//        Alumno jose=new Alumno (23222112,"Jose", "Gonza", LocalDate.of(1977,5, 1),true);
//        AlumnoData alu=new AlumnoData();
//        alu.guardarAlumno(jose);

//        Alumno juan=new Alumno (33222112,"Juan", "Gonzalez", LocalDate.of(1989,6, 1),true);
//        AlumnoData al=new AlumnoData();
//        al.guardarAlumno(juan);
//        
//        Alumno jorge=new Alumno (43222112,"Jorge", "Go", LocalDate.of(2000,8, 11),true);
//        AlumnoData a=new AlumnoData();
//        a.guardarAlumno(jorge);
//        
        //modificarAlumno
//        Alumno jose=new Alumno (7,34658899,"Mirta", "Perez", LocalDate.of(1978,8, 28),true);
//        AlumnoData alu=new AlumnoData();
//        alu.modificarAlumno(jose);
        //eliminarAlumno
//        Alumno jose=new Alumno ();
//        AlumnoData alu=new AlumnoData();
//        alu.eliminarAlumno(6);
        //buscarAlumnoPorId
//        AlumnoData alu=new AlumnoData();
//        Alumno alumnoEncontrado=alu.buscarAlumnoPorId(6);
//        System.out.println("DNI: "+alumnoEncontrado.getDni());
//        System.out.println("NOMBRE: "+alumnoEncontrado.getNombre());
//        System.out.println("APELLIDO: "+alumnoEncontrado.getApellido());
//        System.out.println("FECHA DE NACIMIENTO: "+alumnoEncontrado.getFechaNacimiento());
//        
        //buscarAlumnoPorDni
//        AlumnoData alu=new AlumnoData();
//        Alumno alumnoEncontrado=alu.buscarAlumnoPorDni(34658899);
//        System.out.println("DNI: "+alumnoEncontrado.getDni());
//        System.out.println("NOMBRE: "+alumnoEncontrado.getNombre());
//        System.out.println("APELLIDO: "+alumnoEncontrado.getApellido());
//        System.out.println("FECHA DE NACIMIENTO: "+alumnoEncontrado.getFechaNacimiento());
//        
        //listarAlumnos
//        AlumnoData alu=new AlumnoData();
//        for (Alumno alumno:alu.listarAlumnos()) {
//            System.out.println("DNI "+alumno.getDni());
//            System.out.println("NOMBRE: "+alumno.getNombre());
//            System.out.println("APELLIDO: "+alumno.getApellido());
//            System.out.println("FECHA DE NACIMIENTO: "+alumno.getFechaNacimiento());
//            
//        }
        //*****************************************
//        MATERIADATA-MATERIADATA-MATERIADATA
//        Conexion.getConexion();
//        guardarMateria
        //Materia materia=new Materia ("laboratorio-1",1 ,true);
//        MateriaData mate=new MateriaData();
//        mate.guardarMateria(materia);
//        Materia materi=new Materia ("conatduria-1",1 ,true);
//        MateriaData mati=new MateriaData();
//        mati.guardarMateria(materi);
//        
//        Materia materi=new Materia ("lengua", 2,true);
//        MateriaData mates=new MateriaData();
//        mates.guardarMateria(materi);
//        modificarMaterA
//        Materia materia=new Materia (9,"Matematica1",3,true);
//        MateriaData mat=new MateriaData();
//        mat.modificarMateria(materia);
//eliminarMateria
//        Materia materia =new Materia ();
//        MateriaData mat=new MateriaData();
//        mat.eliminarMateria(9);
        //buscarMateriaId
//        MateriaData materia= new MateriaData();
//        Materia materiaencontrada= materia.buscarMateria(10);
//        
//        System.out.println("NOMBRE: "+ materiaencontrada.getNombre());
//        System.out.println("AÑO: "+materiaencontrada.getAño());
//        System.out.println("ESTADO: "+materiaencontrada.isEstado());
        //listarmaterias
//        
//    }
//   *******************************************
//INSCRIPCIONDATA-INSCRIPCIONDATA-//    Conexion.getConexion();
        //guardar inscripciones(nueva inscripcion)
        AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();

        Alumno a = ad.buscarAlumnoPorId(12);
        Materia m = md.buscarMateria(12);
        Inscripcion insc = new Inscripcion(4, a, m);
//   
//   id.guardarInscripciones(insc);GUARDAR INSCRPCION (NUEVA INSCRIPCION)
//   id.actualizarNota(7, 10, 8);//ACTUALIZAR NOTA
//   id.borrarInscripcionMateriaAlumno(7,10);//ELIMINAR INSCRIPICION FISICA

//        OBTENER INSCRIPCIONES9
//            for (Inscripcion inscripto:id.obtenerInscripciones()) {
//            System.out.println("id "+inscripto.getIdInscripcion());
//            System.out.println("Alumno "+inscripto.getAlumno().getApellido());
//            System.out.println("Materia "+ inscripto.getMateria().getNombre());
//        }
//         OBTENER INSCRIPCIONES POR ALUMNO
//        for (Inscripcion inscripto : id.obtenerInscripcionesPorAlumno(12)) {
//            System.out.println("id " + inscripto.getIdInscripcion());
//            System.out.println("Alumno " + inscripto.getAlumno().getApellido());
//            System.out.println("Materia " + inscripto.getMateria().getNombre());
            // OBTENER MATERIAS CURSADAS
//        for (Materia materia : id.obtenerMateriasCursadas(12)) {
//            System.out.println("id " + materia.getIdMateria());
//            System.out.println("materia" + materia.getNombre());
//        }

            //OBTENER MATERIAS NO CURSADAS
//                for (Materia materia : id.obtenerMateriasNOCursadas(1)) {
//            System.out.println("Materias " + materia.getNombre());
//
//        }

//obtener alumnos por materia

        System.out.println(id.obtenerAlumnosMateria("lengua"));
        }
    
    }

