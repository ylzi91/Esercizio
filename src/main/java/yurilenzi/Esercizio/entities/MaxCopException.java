package yurilenzi.Esercizio.entities;

public class MaxCopException extends Exception {
    public MaxCopException() {
        super("Il numero dei coperti dell'ordine supera il numero di coperti massimo del tavolo");
    }
}
