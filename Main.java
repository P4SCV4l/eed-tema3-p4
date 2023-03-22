public class Main {
    public static void main(String[] args) {
        Main programa = new Main();
        boolean resultado = programa.esPalindromo("otto");
        System.out.println(resultado);
    }
    
    public boolean esPalindromo(String texto) {
        boolean palindromo=false;
        if (texto.length()>=4){
            //Este vector sirve para almacenar uno por uno los caracteres de la palabra, por eso es del mismo tamaño que la palabra actual.
            char[] v= new char[texto.length()];
            //Este array es del mismo tamaño que la anterior porque va a ser el que utilicemos para guardar los caracteres de la palabra invertida.
            char[] c= new char[v.length];
            //Este primer for anidado lo vamos a utilizar para almacenar dentro del vector v la palabra que hayamos introducido char a char.
            for (int i = 0; i < v.length; i++){
                v[i]=texto.charAt(i);
            }
            //Por otro lado este bucle lo estamos utilizando para almacenar el mismo caracter actual de la palabra pero en el indice directamente contrario,
            //por ejemplo la letra de "v" en el indice 0, debe ser la letra del indice 5 en el array "c" suponiendo que la palabra mida 6 letras.
            for (int i = 0; i < v.length; i++) {
                c[i] = v[v.length - i - 1];
            }
            //Aquí comparamos los indices de los vectores.
            for (int i=0; i<v.length; i++){
                if (v[i]==c[i]){
                    palindromo=true;
                }else{
                    palindromo=false;
                    break;
                }
            }
            return palindromo;
        }else{
            return palindromo;
        }
    }
}