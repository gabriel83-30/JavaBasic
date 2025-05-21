package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    @Test

    public void testMetod() {
//        verificareNumar(5);
//        verificareNumar(2);
//        verificareNumarParImparPozitivNegativ(3);
//        verificareNumarParImparPozitivNegativ(6);
//        verificareNumarParImparPozitivNegativ(-5);
//        verificareNumarParImparPozitivNegativ(-2);
////        verificareNumarParImparPozitivNegativ(0);

        System.out.println("Evaluarea elevului cu blocul if else: ");
        System.out.println(evaluareNota('A'));
        System.out.println(evaluareNota('B'));
        System.out.println(evaluareNota('C'));
        System.out.println(evaluareNota('D'));
        System.out.println(evaluareNota('E'));

        System.out.println("-----------------------------------------");

        System.out.println("Evaluarea elevului cu blocul switch case: ");
        evaluareNotaNoua('A');
        evaluareNotaNoua('B');
        evaluareNotaNoua('C');
        evaluareNotaNoua('D');
        evaluareNotaNoua('E');

        System.out.println("--------------------------------------------");

        System.out.println("Aflam ziua cu blocul switch case: ");
        aflaZiua();

        System.out.println("---------------------------------------------");

        System.out.println("Aflam ziuaNoua cu blocul if else: ");
        aflaZiuaNoua();


    }
//
//    // Structura de control " if " este folosita pentru a evolua o conditie booleana si pentru a executa un bloc de cod daca aceasta conditie este adevarata.
////  exemplu:
////    if(conditie){
////     bloc de cod ce va fi executat daca conditia va fi adevarata
////    } else {
////    bloc de cod care va fi executat daca conditia va fi falsa
////    }
//
////    public void verificareNumar(int numar) {
////        if (numar > 3) {
////            System.out.println("Numarul  " + numar + " este mai mare decat 3.");
////        } else {
////            System.out.println("Numarul  " + numar + " este mai mic decat 3.");
////        }
//    }
//
////    diferenta intre "if" si "else if"
////        - daca " if "este folosit pentru prima conditie pentru care vrem sa evaluam
////        - " else if" este folosit pt conditii suplimentare daca "if" este fals
////        - " else " este folosit pt a executa un bloc de cod daca toate conditiile sunt false
////        - este indicat sa se foloseasca "if" si "else if" impreuna daca ai mai multe conditii de evaluat
//
//

//    / /    public void verificareNumarParImparPozitivNegativ(int valoare) {
    /// /
    /// /        if (valoare > 0) {
    /// /            if (valoare % 2 == 0) {
    /// /                System.out.println("Numarul  " + valoare + " este par si pozitiv.");
    /// /            } else {
    /// /                System.out.println("Numarul  " + valoare + " este impar si pozitiv.");
    /// /
    /// /            }
    /// /        } else if (valoare < 0) {
    /// /            if (valoare % 2 == 0) {
    /// /                System.out.println("Numarul  " + valoare + " este par si negativ.");
    /// /            } else {
    /// /                System.out.println("Numarul  " + valoare + " este impar si pozitiv.");
    /// ///            }
    /// /        } else {
    /// /            System.out.println("Numarul  " + valoare + " este egalcu 0.");
    /// /        }
//
//    }


//    - "switch" este o structura de control care permite evaluarea unei expresii si executarea unuia din mai multe blocuri de cod
//    - este de obicei mai mult folosit cand sunt mai multe cazuri posibile, fiecare caz este asociat unui bloc de cod specificat
//    "switch(expresia){
//      case valoareaUnu :
//      bloc de cod pentru cazul in care expresia are valoarea - valoareaUnu
//      break;
//      case valoareDoi;
//      bloc de cod pentru cazul in care expresia are valoarea - valoareaDoi
//      break;
//      alte case-uri posibile:
//      default:
//      bloc de cod care se executa daca niciunul dintre cazuri nu se potriveste
//    }
    public String evaluareNota(char nota) {

        switch (nota) {
            case 'A':
                return "Excelent";

            case 'B':
                return "Foarte bine";

            case 'C':
                return "Bine";

            case 'D':
                return "Satisfacator";
            case 'E':
                return "Repetent";

            default:
                return nota + " Nu este un calificativ acceptat ";

        }
    }

//    HOMEWORK : transferat in metoda void pt miercuri

    public void evaluareNotaNoua(char nota) {


        switch (nota) {
            case 'A':
                System.out.println("Excelent");
                break;
            case 'B':
                System.out.println("Foarte bine");
                break;
            case 'C':
                System.out.println("Bine");
                break;
            case 'D':
                System.out.println("Satisfacator");
                break;
            case 'E':
                System.out.println("Repetent");
                break;
            default:
                System.out.println("Nu este calificativ acceptat. ");


        }


    }


    public void aflaZiua() {

        int zi = 3;
        switch (zi) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Alta zi");


        }


    }

    public void aflaZiuaNoua() {

        int zi = 5;
        if (zi == 1) {
            System.out.println("Luni");
        } else if (zi == 2) {
            System.out.println("Marți");
        } else if (zi == 3) {
            System.out.println("Miercuri");
        } else if (zi == 4) {
            System.out.println("Joi");
        } else if (zi == 5) {
            System.out.println("Vineri");
        } else if (zi == 6) {
            System.out.println("Samabata");
        } else if (zi == 7) {
            System.out.println("Duminica");
        } else {
            System.out.println("Alta zi.");
        }


    }

//    O variantă alternativă, mai compactă și mai clară:
//    public void verificareNumar(int valoare) {
//        if (valoare == 0) {
//            System.out.println("Numarul este egal cu 0.");
//            return;
//        }
//
//        String paritate = (valoare % 2 == 0) ? "par" : "impar";
//        String semn = (valoare > 0) ? "pozitiv" : "negativ";
//
//        System.out.println("Numarul " + valoare + " este " + paritate + " si " + semn + ".");
//    }


}
