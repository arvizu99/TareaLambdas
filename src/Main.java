import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main{

    public static void main(String[] args){
        //creo array de números del 1 al 10
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i<=10; i++){
            nums.add(i);
        }
        System.out.println("Arreglo numeros: "+nums);
        Numeros.multiplicador(nums,4);
        System.out.println("Arreglo numeros por 4"+nums);
        nums.addLast(null);
        //se muestra el error por valor nulo
        Numeros.multiplicador(nums,1);
        nums.removeLast();
        Numeros.multiplicador(new ArrayList<Integer>() ,2 );

        //se crea arraylist con cadenas
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Nullificación");
        cadenas.add("Taco");
        cadenas.add("Nada");
        //se muestran las palabras que no empiezan con N
        System.out.println("Palabras \n"+cadenas);
        Cadenas.filtroSelectivo(cadenas,"N");
        System.out.println("Palabras que no empiezan con la letra N \n"+cadenas);
        //se muestran las palabras que tengan más de 5 letras
        cadenas.add("Palabra");
        cadenas.add("cinco");
        Cadenas.filtroSelectivo(cadenas,"5");
        System.out.println("Palabras que tienen mas de 5 letras \n"+cadenas);
        cadenas.addLast(null);
        Cadenas.filtroSelectivo(cadenas,"5");
        cadenas.removeLast();
        Cadenas.filtroSelectivo(cadenas,null);



        //se utiliza el metodo aMayusculas para transformar a mayúsculas todas las palabras de cadenas.
        ArrayList<String> mayus = Cadenas.aMayusculas(cadenas);
        System.out.println(mayus);

        //Se crea un HashSet de numeros pares elevados al cuadrado utilizando el metodo cuadradosUnicosPares
        HashSet<Integer> pares = Numeros.cuadradosUnicosPares(nums);
        System.out.println(pares);

        //Se crea un HashMap que contiene las longitudes de cada palabra del arraylist cadenas
        HashMap<String,Integer> longitudes = Cadenas.longitudDePalabras(cadenas);
        System.out.println(longitudes);

        //se crea un catalogo
        HashMap<String,Double> catalogo = new HashMap<>();
        catalogo.put("Fresas",null);
        catalogo.put("Limones",35.50);
        catalogo.put("Aguacates",55.40);
        //se muestra en terminal el catalogo junto a sus precios con un 10% de descuento
        Numeros.mostrarCatalogoDescuentos(catalogo);
        //Se crea un arraylist con Strings de frutas repetidas.
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Pera");
        frutas.add("Manzana");
        frutas.add("Platano");
        frutas.add("Platano");
        frutas.add("Platano");
        //se guarda en un HashMap la palabra como clave y el numero de veces repetidas como valor
        HashMap<String,Integer> repetidas = Cadenas.palabrasRepetidas(frutas);
        System.out.println(repetidas);
        //El HashMap de palabras repetidas se utiliza en el metodo de palabrasRepetidasMenosDeNVeces
        //para filtrar las palabras que fueron repetidas menos de 3 veces
        System.out.println(Cadenas.palabrasRepetidasMenosDeNVeces(repetidas,3));

    }
}
