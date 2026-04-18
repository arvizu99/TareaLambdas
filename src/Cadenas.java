import java.util.*;
import java.util.stream.Collectors;

public class Cadenas {

    //puedes ingresar numeros en vez de letras
    public static void filtroSelectivo(ArrayList<String> palabras, String letra) {
        boolean esNumero = false;
        boolean hayNull = false;
        //verificar que no este vacío el arreglo
        if(!palabras.isEmpty()) {
            //verificar que no haya null
            for (String s : palabras) {
                hayNull = s == null;
                break;
            }
            if (!hayNull) {
                //verificar que sea numero o letra
                try {
                    int numero = Integer.parseInt(letra);
                    esNumero = true;
                } catch (NumberFormatException e) {
                    System.out.println("No es número");
                }

                if (!esNumero) {
                    palabras.removeIf(s -> s.startsWith(letra));

                } else palabras.removeIf(s -> s.length() < Integer.parseInt(letra));
            } else System.out.println("Hay un valor Null en el arreglo");
        }else System.out.println("El arreglo esta vacío");

    }
    //regresa un arrayList con todas las cadenas en mayusculas
    public static ArrayList<String> aMayusculas(ArrayList<String> palabras){
        boolean hayNull = false;
        ArrayList<String> nuevasPalabras = new ArrayList<>();
        if(!palabras.isEmpty()){
            for(String s : palabras){
                if (s==null){
                    hayNull= true;
                    break;
                }
            }
            if (!hayNull){
                nuevasPalabras.addAll((ArrayList<String>) palabras.stream()
                        .map(s-> s.toUpperCase())
                        .collect(Collectors.toCollection(ArrayList::new)));
            }else System.out.println("Hay un valor Null en el arreglo");
        }else System.out.println("El arreglo esta vacío");
        return nuevasPalabras;
    }
    //regresa un HashMap con la palabra como clave y longitud como valor
    public static HashMap<String,Integer> longitudDePalabras(ArrayList<String> palabras){
        boolean hayNull = false;
        HashMap<String,Integer> longitudDePalabras = new HashMap<String,Integer>();
        if(!palabras.isEmpty()){
            for(String s : palabras){
                if (s==null){
                    hayNull= true;
                    break;
                }
            }
            if (!hayNull){
                longitudDePalabras = (HashMap<String,Integer>)palabras.stream()
                        .collect(Collectors.toMap(s-> s, s-> s.length() ));

            }else System.out.println("Hay un valor Null en el arreglo");
        }else System.out.println("El arreglo esta vacío");
        return longitudDePalabras;
    }
    //Regresa un HashMap con la palabra como clave
    //y la cantidad de veces que se repite dicha clave como valor.
    public static HashMap<String,Integer> palabrasRepetidas(ArrayList<String> palabras){
        boolean hayNull = false;
        HashMap<String,Integer> frecuenciaDePalabras = new HashMap<>();
        if(!palabras.isEmpty()){
            for(String s : palabras){
                if (s==null){
                    hayNull= true;
                    break;
                }
            }
            if (!hayNull){
                    for(String s: palabras){
                        frecuenciaDePalabras.merge(s,1 , Integer::sum);
                    }
            }else System.out.println("Hay un valor Null en el arreglo");
        }else System.out.println("El arreglo esta vacío");
        return frecuenciaDePalabras;
    }
    //Recibe un hashmap con la frecuencia de palabras y filtra las palabras
    //que tengan una frencuencia menor a n
    public static ArrayList<String> palabrasRepetidasMenosDeNVeces(HashMap<String,Integer> repetidas, Integer n){
        boolean hayNull = false;
        ArrayList<String> palabrasMenores = new ArrayList<>();
        repetidas.entrySet().stream()
                .filter((s)-> s.getValue()<n)
                .forEach(s-> palabrasMenores.add(s.getKey()));
        return palabrasMenores;
    }

}
