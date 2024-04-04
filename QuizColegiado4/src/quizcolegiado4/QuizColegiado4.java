/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizcolegiado4;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class QuizColegiado4 {

    /**
     * @param args the command line arguments
     */
    public static void Show(String lista, String MaxEst, String MinEst, int Prom, int PromMore, int PromLess) {
        lista = "Lista de Alumnos;" + "\n" + lista;
        JOptionPane.showMessageDialog(null, lista);
        MaxEst = "Estudiante con mayor nota: " + MaxEst;
        JOptionPane.showMessageDialog(null, MaxEst);
        MinEst = "Estudiante con menor nota: " + MinEst;
        JOptionPane.showMessageDialog(null, MinEst);
        JOptionPane.showMessageDialog(null, "Promedio de los estudiantes: " + Prom + "\nNotas arriba del promedio: " + PromMore + "\nNotas abajo del promedio: " + PromLess);
    }

    public static void carga() {
        Alumnos Alumno[] = new Alumnos[10];
        Alumno[0] = new Alumnos("Juan", "Matematicas", "Omar", 100);
        Alumno[1] = new Alumnos("Saul", "Sociales", "Carla", 90);
        Alumno[2] = new Alumnos("David", "Matematicas", "Carla", 81);
        Alumno[3] = new Alumnos("Dylan", "Español", "Diego", 72);
        Alumno[4] = new Alumnos("Tamara", "Matematicas", "Carla", 72);
        Alumno[5] = new Alumnos("Jimena", "Sociales", "Diego", 70);
        Alumno[6] = new Alumnos("Joan", "Español", "Omar", 63);
        Alumno[7] = new Alumnos("Sebastian", "Matematicas", "Omar", 54);
        Alumno[8] = new Alumnos("Alisson", "Sociales", "Carla", 45);
        Alumno[9] = new Alumnos("Santigo", "Español", "Diego", 36);

        String lista = "";
        for (int x = 0; x < 10; x++) {
            lista = lista + (x + 1) + ")" + Alumno[x].getName() + "\n";
        }
        int Max = Alumno[0].getScore();
        int Poss = 0;
        for (int x = 0; x < 10; x++) {
            if (Max < Alumno[x].getScore()) {
                Max = Alumno[x].getScore();
                Poss = x;
            }
        }
        String MaxEst = Alumno[Poss].getName();
        
        int Min = Alumno[0].getScore();
        Poss = 0;
        for (int x = 0; x < 10; x++) {
            if (Min > Alumno[x].getScore()) {
                Min = Alumno[x].getScore();
                Poss = x;
            }
        }
        String MinEst = Alumno[Poss].getName();
        
        int Prom = 0;
        for (int x = 0; x < 10; x++) {
            Prom += Alumno[x].getScore();
        }
        Prom = Prom / 10;
        int PromMore = 0;
        int PromLess = 0;
        for (int x = 0; x < 10; x++) {
            if(Alumno[x].getScore() >= Prom){
                PromMore += 1;
            }else{
                PromLess += 1;
            }
        }
        
        
        Show(lista, MaxEst, MinEst, Prom, PromMore, PromLess);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        carga();
    }

}
