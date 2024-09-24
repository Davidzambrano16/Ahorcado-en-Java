
import java.util.Scanner;


public class Ahorcado {
    public static void main(String[] args) throws Exception {
        Datos dato = new Datos();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0, vidas = 5, record = 0;
        System.out.println("\n \t\t\t BIENVENIDO AL AHORCADO");
        System.out.println("<**************************************************************************>");

        do{
            System.out.println("\t presione 1. para jugar 2. para ayuda 3. para salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    String palabra = dato.EnviarPalabras();
                    char[] palabraAdivinada = new char[palabra.length()];
                    for(int i = 0; i< palabra.length(); i++){
                        System.out.print("_");
                        palabraAdivinada[i] = '_';
                    }
                    System.out.println("la palabra tiene : " + palabra.length() + " letras");

                    do { 
                        System.out.println("ingrese una letra : ");
                        char letra = scanner.next().toLowerCase().charAt(0);
                        // System.out.println("la palabra random es :" + palabra + " y la letra es : " + letra);

                        if(palabra.contains(Character.toString(letra))){
                            for(int i = 0; i< palabra.length(); i++){
                                if(palabra.charAt(i) == letra ){
                                    palabraAdivinada[i] = letra;
                                }
                                System.out.print(palabraAdivinada[i]);
                            }
                        }else{
                            System.out.println("la palabra no contiene la letra : "+ letra);
                            vidas--;
                        }

                        if(palabraAdivinada.equals(palabra)){
                            System.out.println("Ha logrado adivinar la palabra con exito :D");
                            record = palabra.length() * vidas;
                            System.out.println("su record es de : " + record);
                        }

                    } while (vidas != 0);

                    if(vidas == 0){
                        System.out.println("se ha quedado sin vidas, game over");
                    }

                    break;
                    
                case 2:
                    System.out.println("\t\t AYUDA");
                    break;
                case 3:
                    System.out.println("Ha finalizado el juego");
                    break;
                default:
                    System.out.println("ingreso una opcion invalida");
                    break;
            }

        }while(opcion != 3 || opcion < 0 || opcion > 3);


        
    }
}
