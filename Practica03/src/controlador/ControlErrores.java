package controlador;

import java.time.LocalDate;
import javax.swing.JLabel;

public class ControlErrores {

    public static boolean comprobarFecha(LocalDate fecha, JLabel error) {

        if (fecha == null) {
            error.setText("Introduzca una fecha válida.");
            error.setForeground(java.awt.Color.RED);
            return false;
        }

        if (fecha.getYear() < 1900 || fecha.getYear() > 2015) {
            error.setText("La fecha debe estar entre 1900 y 2015.");
            error.setForeground(java.awt.Color.RED);
            return false;
        }

        error.setText("");
        return true;
    }

    public static boolean comprobarPuntos(float puntos, JLabel error) {

        if (puntos < 0 || puntos > 1000) {
            error.setText("Los puntos deben estar entre 0 y 1000.");
            error.setForeground(java.awt.Color.RED);
            return false;
        }

        error.setText("");
        return true;
    }
}