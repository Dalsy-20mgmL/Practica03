package controlador;

import java.util.ArrayList;
import java.util.Comparator;
import modelo.Cliente;

public class ListaClientes extends ArrayList<Cliente> {

    private int actual;

    public ListaClientes() {
        actual = 0;
    }

    public boolean esVacia() {
        return isEmpty();
    }

    public void avanzar() {
        if (!isEmpty() && actual < size() - 1) {
            actual++;
        }
    }

    public void retroceder() {
        if (!isEmpty() && actual > 0) {
            actual--;
        }
    }

    public void irAlPrimero() {
        if (!isEmpty()) {
            actual = 0;
        }
    }

    public void irAlUltimo() {
        if (!isEmpty()) {
            actual = size() - 1;
        }
    }

    public boolean esPrimero() {
        return !isEmpty() && actual == 0;
    }

    public boolean esUltimo() {
        return !isEmpty() && actual == size() - 1;
    }

    public void anadirCliente(Cliente cliente) {
        add(cliente);
        actual = size() - 1;
    }

    public void borrarCliente() {
        if (!isEmpty()) {
            remove(actual);

            if (actual >= size() && !isEmpty()) {
                actual = size() - 1;
            }
        }
    }

    public Cliente obtenerClienteActual() {
        if (!isEmpty() && actual >= 0 && actual < size()) {
            return get(actual);
        }

        return null;
    }

    public void ordenarPorNumero() {
        sort(Comparator.comparingInt(Cliente::getNumero));

        if (!isEmpty()) {
            actual = 0;
        }
    }
}