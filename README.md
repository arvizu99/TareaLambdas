Este repositorio contiene dos clases que manipulan ArrayLists de valores String y númericos respectivamente.
Ambas clases contienen métodos estáticos que pueden utilizarse sin la necesidad de crear una instancia de dichas clases, 
tienen propósitos meramente de utilería.
La clase Main contiene demostraciones de como se pueden utilizar los métodos de ambas clases.

Metodos de la clase Numeros:
Todos los métodos de esta clase regresan un mensaje de error si los valores ingresados en los parámetros contienen un valor nulo o están vacíos 
y dependiendo de el tipo de valor que regresen, no hace nada o regresa un HashMap o ArrayList vacío.

-public static void multiplicador(ArrayList<Integer> numeros, int mult)
  Este método transforma los valores Integer del ArrayList<Integer> y los multiplica por el valor de mult.
-public static HashSet<Integer> cuadradosUnicosPares(ArrayList<Integer> numeros)
  Este método crea un HashSet que contiene los cuadrados de los numeros pares únicos del ArrayList<Integer> entregado.

-public static void mostrarCatalogoDescuentos(HashMap<String,Double> catalogo)
  Este método recibe un HashMap con el formato HashMap<String Articulo, Double precio> y muestra en la terminal 
  los artículos del HashMap junto a sus precios con un descuento del 10%.
  
Metodos de la clase Cadenas:
Todos los métodos de esta clase regresan un mensaje de error si los valores ingresados en los parámetros contienen un valor nulo o están vacíos 
y dependiendo de el tipo de valor que regresen, no hace nada o regresa un HashMap o ArrayList vacío.

-public static void filtroSelectivo(ArrayList<String> palabras, String letra);
  Este método recibe un ArrayList<String> y un String. 
  El String letra de ser un una cadena o letra eliminará las palabras que inicien con esas letras.
  Si el String letra es un número, removerá las palabras que tengan una longitud menor a dicho número.

-public static ArrayList<String> aMayusculas(ArrayList<String> palabras);
  Este método recibe un ArrayList<String> y transforma todas las palabras de dicho arrayList a mayúsculas.

-public static HashMap<String,Integer> longitudDePalabras(ArrayList<String> palabras);
  Este método obtiene un ArrayList<String> y regresa un HashMap que contiene las palabras como clave y la longitud de dichas palabras como valor.

-public static HashMap<String,Integer> palabrasRepetidas(ArrayList<String> palabras)
  Este método regresa un HashMap con la palabra como clave y la cantidad de veces que se repite dicha clave como valor.

-public static ArrayList<String> palabrasRepetidasMenosDeNVeces(HashMap<String,Integer> repetidas, Integer n);
  Recibe un hashmap con una frecuencia de palabras con formato HashMap<palabra,cantidadRepetida> 
  y filtra las palabras que tengan una frecuencia menor a “n” y regresa un ArrayList<String> con dichas palabras.
