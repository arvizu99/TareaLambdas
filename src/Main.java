import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main{

    public static void main(String[] args){

        //El multiplicador ArrayList
        //multiplicador( ArrayList<Integer>)
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i<=10; i++){
            nums.add(i);
        }
        nums.add(null);
        Numeros.multiplicador(nums,1);
        System.out.println(nums);
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("nullificacion");
        cadenas.add("Taco");
        Cadenas.filtroSelectivo(cadenas,"1");
        System.out.println(cadenas);

        ArrayList<String> mayus = Cadenas.aMayusculas(cadenas);
        System.out.println(mayus);

        HashSet<Integer> pares = Numeros.cuadradosUnicosPares(nums);
        System.out.println(pares);

        HashMap<String,Integer> longitudes = Cadenas.longitudDePalabras(cadenas);
        System.out.println(longitudes);
        HashMap<String,Double> catalogo = new HashMap<>();
        catalogo.put("Fresas",15.35);
        catalogo.put("Limones",35.50);
        catalogo.put("Aguacates",55.40);
        Numeros.mostrarCatalogoDescuentos(catalogo);
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Platano");
        frutas.add("Platano");
        HashMap<String,Integer> repetidas = Cadenas.palabrasRepetidas(frutas);
        System.out.println(repetidas);


        System.out.println(Cadenas.palabrasRepetidasMenosDeNVeces(repetidas,3));

    }
}
