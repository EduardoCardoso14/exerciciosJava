/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.gigantesco;

/**
 *
 * @author 962670
 */
public class ExercicioGigantesco {

    /**
     * @param args the command line arguments
     */
    static void meumetodo() {
        System.out.println("I just got executed!");
        System.out.println("----------");
    }

    static void meumetodo2(String fname) {
        System.out.println(fname + " Doe");
        System.out.println("----------");
    }

    static void meumetodo3(int x) {
        System.out.println(5 + x);
        System.out.println("----------");
    }

    public static void main(String[] args) {
        // TODO code application logic here

        //exercicio 1:
        System.out.println("Hello World");
        System.out.println("----------");

        //exercicio 2:
        //This is a single-line comment
        /*This is a multi-line comment*/
        //exercicio 3:
        String carName = "Volvo";

        //exercicio 4:
        int maxSpeed = 120;

        //exercicio 5;
        int x = 5;
        int y = 10;
        System.out.println(x + y);
        System.out.println("----------");

        //exercicio 6:
        int a = 5;
        int b = 10;
        int z = a + b;
        System.out.println(z);
        System.out.println("----------");

        //exercicio 7:
        int c = 5, d = 6, f = 50;
        System.out.println(c + d + f);
        System.out.println("----------");

        //exercicio 8:
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean MyBool = false;
        String MyText = "Hello World";

        //exercicio 9:
        //primitive data types;
        //exercicio 10:
        double MyDouble = 9.78d;
        int myInt = (int) MyDouble;

        //exercicio 11:
        System.out.println(10 * 5);
        System.out.println("----------");

        //exercicio 12:
        System.out.println(10 / 5);
        System.out.println("----------");

        //exercicio 13:
        int m = 10;
        ++m;

        //exercicio 14:
        int n = 10;
        n = n + 5;

        //exercicio 15:
        String greeting = "Hello";

        //exercicio 16:
        String txt = "Hello";
        System.out.println(txt.toUpperCase());
        System.out.println("----------");

        //exercicio 17:
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
        System.out.println("----------");

        //exercicio 18:
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName.concat(lastName2));
        System.out.println("----------");

        //exercicio 19:
        String hj = "Hello Everybody";
        System.out.println(hj.indexOf('e'));
        System.out.println("----------");

        //exercicio 20:
        int k = 5;
        int l = 10;
        Math.max(k, l);

        //exercicio 21:
        int raiz = 16;
        Math.sqrt(raiz);

        //exercicio 22:
        Math.random();

        //exercicio 23:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        System.out.println("----------");

        //exercicio 24:
        boolean i = true;
        System.out.println(i);
        System.out.println("----------");

        //exercicio 25:
        int p = 50;
        int u = 10;
        if (p > u) {
            System.out.println("Hello World");
            System.out.println("----------");
        }

        //exercicio 26:
        int v1 = 50;
        int v2 = 50;
        if (v1 == v2) {
            System.out.println("Hello World");
            System.out.println("----------");
        }

        //exercicio 27:
        int v3 = 50;
        int v4 = 50;
        if (v3 == v4) {
            System.out.println("Yes");
            System.out.println("----------");
        } else {
            System.out.println("No");
            System.out.println("----------");
        }

        //exercicio 28:
        int v5 = 50;
        int v6 = 50;
        if (v5 == v6) {
            System.out.println("1");
            System.out.println("----------");
        } else if (v5 > v6) {
            System.out.println("2");
            System.out.println("----------");
        } else {
            System.out.println("3");
            System.out.println("----------");
        }

        //exercicio 29:
        int time = 20;
        String result = (time < 18) ? "Good day" : "Good evening.";
        System.out.println(result);
        System.out.println("----------");

        //exercicio 30:
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                System.out.println("----------");
                break;
            case 2:
                System.out.println("Sunday");
                System.out.println("----------");
                break;
        }

        //exercicio 31:
        int day2 = 4;
        switch (day2) {
            case 1:
                System.out.println("Saturday");
                System.out.println("----------");
                break;
            case 2:
                System.out.println("Sunday");
                System.out.println("----------");
                break;
            default:
                System.out.println("Weekend");
                System.out.println("----------");
        }

        //exercicio 32:
        int cont = 1;
        while (cont < 6) {
            System.out.println(cont);
            cont++;
        }
        System.out.println("----------");

        //exercicio 33:
        int cont2 = 1;
        do {
            System.out.println(cont2);
            cont2++;
        } while (cont2 < 6);
        System.out.println("----------");

        //exercicio 34:
        for (int foro = 0; foro < 5; foro++) {
            System.out.println("Sim");
        }
        System.out.println("----------");

        //exercicio 35:
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String cont3 : cars) {
            System.out.println(cont3);
        }
        System.out.println("----------");

        //exercicio 36:
        for (int breiki = 0; breiki < 10; breiki++) {
            if (breiki == 5) {
                break;
            }
            System.out.println(breiki);
        }
        System.out.println("----------");

        //exercicio 37:
        for (int cont33 = 0; cont33 < 10; cont33++) {
            if (cont33 == 4) {
                cont33++;
            }
            System.out.println(cont33);
        }
        System.out.println("----------");

        //exercicio 38:
        String[] cars2 = {"Volvo", "BMW", "Ford"};

        //exercicio 39:
        String[] cars3 = {"Volvo", "BMW", "Ford"};
        System.out.println(cars3[1]);
        System.out.println("----------");

        //exercicio 40:
        String[] cars4 = {"Volvo", "BMW", "Ford"};
        cars4[0] = "Opel";
        System.out.println(cars4[0]);
        System.out.println("----------");

        //exercicio 41:
        String[] cars5 = {"Volvo", "BMW", "Ford"};
        System.out.println(cars5.length);
        System.out.println("----------");

        //exercicio 42:
        String[] cars6 = {"Volvo", "BMW", "Ford"};
        for (String cont6 : cars6) {
            System.out.println(cont6);
        }
        System.out.println("----------");

        //exercicio 43:
        int meusnumbero[][] = {{1, 2, 3, 4}, {5, 6, 7}};

        //exercicio 44:
        ExercicioGigantesco oi = new ExercicioGigantesco();
        oi.meumetodo();

        //exercicio 45:
        oi.meumetodo();
        oi.meumetodo();

        //exercicio 46:
        oi.meumetodo2("John");

        //exercicio 47:
        oi.meumetodo3(3);

        //exercicio 48: OUTRO ARQUIVO
    }

}
