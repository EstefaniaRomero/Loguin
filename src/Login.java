import java.util.Scanner;

public class Login {

    /*4. Exercici Login:
Guardem en una constant el email y el password de l’administrador.
Quan s’inicia el software, li preguntem a l’usuari el seu email i el seu password.
Si coincideixen amb les dades de l’administrador: es confirma per consola que s’ha
pogut loggejar. Si no es valid, es mostra un missatge d’error per consola.*/

    private static final String EMAIL="pepito@gmail.com";
    private static final String PASSWORD= "Hola";

    public static void main(String[] args) {

        String email = askEmail();
        String password = askPasword();
        loginCorrectOrnotCorrect(email,password);

    }

    private static void loginCorrectOrnotCorrect(String email, String password) {

        if(email.equals(EMAIL) && password.equals(PASSWORD)){

            System.out.println("Login CORRECTE");

        }else System.out.println("Login INCORRECTE");
    }

    private static String askPasword() {

        System.out.println("Introdueix el password: ");
        Scanner sc = new Scanner(System.in);
        String passwordUser=sc.nextLine();
        return passwordUser;
    }

    private static String askEmail() {

        System.out.println("Introdueix el teu correu: ");
        Scanner sc = new Scanner(System.in);
        String text=sc.nextLine();
        return text;
    }
}
