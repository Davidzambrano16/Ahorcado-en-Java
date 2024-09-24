import java.util.Random;

public class Datos {
    Random random = new Random();
    public String[] palabras = {"empanada", "automovil", "pastilla",
                         "ropa", "comedor", "deportes", "zapatillas",
                         "animales", "zoologico", "dildos"
                        };


    String EnviarPalabras(){
        int indice = random.nextInt(10);
        return palabras[indice];
    }

}
