import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import persona.modelo.Persona;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)

public class PersonaModelUnitTest {

    @Test
    public void InstanciarPersona_AtributosCorrectos_InstanciaCorrecta(){
        Persona unaPersona= Persona.instancia(1,"Quintero", "Juanfer", LocalDate.of(2018,12,19),"30700341",1.6, 90.0);
    }
}
