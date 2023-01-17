package filesystem.condiciones;

import filesystem.Archivo;

import java.time.LocalDate;

public class CondicionCreadoAntesDe extends Condicion{
    private LocalDate fechaLimite;

    public CondicionCreadoAntesDe(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    @Override
    public boolean cumple(Archivo arch) {
        return arch.getFechaCreac().compareTo(fechaLimite)<0;
    }
}
