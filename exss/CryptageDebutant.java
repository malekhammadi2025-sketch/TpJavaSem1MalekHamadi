import java.util.Scanner; // باش نستعمل Scanner نقرى من clavier

public class CryptageDebutant {

    // === Fonction qui fait le cryptage ===
    public static String crypter(String phrase) {
        String resultat = "";  // هنا باش نحط الجملة المشفّرة
        int i = 0;             // متغيّر باش نمشي بيه حرف بحرف

        // طول ما مزال فما حروف ما خدمناش عليهم
        while (i < phrase.length()) {

            char lettre = phrase.charAt(i); // ناخذ الحرف الحالي
            int compteur = 1;               // نبدأ نحسب التكرار

            // نشوف إذا الحرف الجاي كيفو، نزيد نعد
            while (i + 1 < phrase.length() && phrase.charAt(i + 1) == lettre) {
                compteur++;  // نزيد العدد
                i++;         // نمشي للحرف الجاي
            }

            // نضيف للنتيجة : العدد + الحرف
            resultat = resultat + compteur + lettre;

            i++; // نكمل للحرف اللي بعدو
        }

        // نرجّع الجملة المشفّرة
        return resultat;
    }

    // === Programme principal ===
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); // باش نقراو من المستخدم

        System.out.print("Donner une phrase : ");
        String phrase = clavier.nextLine(); // نقرا الجملة اللي كتبها المستخدم

        // نستعمل الدالة اللي تعمل التشفير
        String phraseCryptee = crypter(phrase);

        // نعرض النتيجة
        System.out.println();
        System.out.println("Texte original : " + phrase);
        System.out.println("Texte crypté   : " + phraseCryptee);

        clavier.close(); // نغلق Scanner
    }
}
