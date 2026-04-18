import java.util.*;
import java.util.stream.Collectors;

public class Numeros {

    public static void multiplicador(ArrayList<Integer> numeros, int mult) {
        boolean hayNull =false;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                hayNull = numero == null;
                if (hayNull){
                    break;
                }
            }
            if (!hayNull){
                numeros.replaceAll(n -> n * mult);
            }else System.out.println("Hay un valor nulo en el arreglo");
        }else System.out.println("El arreglo esta vacío");
    }

    //crea un HashSet que contiene los cuadrados de los numeros pares únicos
    //del arraylist entregado
    public static HashSet<Integer> cuadradosUnicosPares(ArrayList<Integer> numeros){
        boolean hayNull = false;
        HashSet<Integer> setCuadradosPares = new HashSet<>();
        if(!numeros.isEmpty()){
            for(Integer s : numeros){
                if (s==null){
                    hayNull= true;
                    break;
                }
            }
            if (!hayNull){
                setCuadradosPares = (HashSet<Integer>) numeros.stream()
                        .filter(n-> n%2==0)
                        .map(n-> n*n)
                        .collect(Collectors.toSet());
            }else System.out.println("Hay un valor Null en el arreglo");
        }else System.out.println("El arreglo esta vacío");
    return setCuadradosPares;
    }
    //imprime el descuento del 10% de cada precio dentro del hashmap entrante
    public static void mostrarCatalogoDescuentos(HashMap<String,Double> catalogo){
        boolean hayNull = false;
        if (!catalogo.isEmpty()) {
            catalogo.forEach((a, b) -> {
                if (!(a==null || b==null)) {
                    System.out.println(a + " - " + (b * 0.9) + "$");
                }
            });
        }else System.out.println("El HashMap esta vacío");
    }



    public static void base(ArrayList<Integer> numeros){
        boolean hayNull = false;

        if(!numeros.isEmpty()){
            for(Integer s : numeros){
                if (s==null){
                    hayNull= true;
                    break;
                }
            }
            if (!hayNull){


            }else System.out.println("Hay un valor Null en el arreglo");
        }else System.out.println("El arreglo esta vacío");

    }


}
