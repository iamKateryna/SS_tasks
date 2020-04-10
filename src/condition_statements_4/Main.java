package condition_statements_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //practical task
        //1
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Enter three integer numbers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int count = 0;

        if (a % 2 == 1) {
            count++;
        }
        if (b % 2 == 1) {
            count++;
        }
        if (c % 2 == 1) {
            count++;
        }
        System.out.println("there (is)are " + count + " odd number(s)");
        //2
        System.out.println("Enter the number of a weekday");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday Lunes ");
                break;
            case 2:
                System.out.println("Tuesday Martes ");
                break;
            case 3:
                System.out.println("Wednesday Miercoles ");
                break;
            case 4:
                System.out.println("Thursday Jueves ");
                break;
            case 5:
                System.out.println("Friday Viernes ");
                break;
            case 6:
                System.out.println("Saturday Sabado ");
                break;
            case 7:
                System.out.println("Sunday Domingo ");

        }
        //3
        System.out.println("Country?");
        String name = scanner.nextLine();

        switch (name) {
            case "Morocco":
            case "Kenya":
            case "Ghana":
                System.out.println(Continent.AFRICA);
                break;
            case "France":
                System.out.println(Continent.EUROPE);
                break;
            case "Singapore":
                System.out.println(Continent.ASIA);
                break;
            case "Canada":
                System.out.println(Continent.NORTHAMERICA);
                break;
            case "Brazil":
                System.out.println(Continent.SOUTHAMERICA);
                break;
            case "Australia":
                System.out.println(Continent.AUSTRALIA);
                break;
            default:
                System.out.println("No such country");
                System.exit(0);*/
        //4
        /*Product p1 = new Product("Grecha", 36.90, 15);
        Product p2 = new Product("Toilet Paper", 32.40, 20);
        Product p3 = new Product("Mask", 12.60, 50);
        Product p4 = new Product("Sanitiser", 35.99, 23);

        if (p1.getPrice() > p2.getPrice()) {
            if (p1.getPrice() > p3.getPrice()) {
                if (p1.getPrice() > p4.getPrice()) {
                    System.out.println(p1.getName());
                } else {
                    System.out.println(p4.getName());
                }
            } else {
                if (p3.getPrice() > p4.getPrice()) {
                    System.out.println(p3.getName());
                } else {
                    System.out.println(p4.getName());
                }
            }
        } else {
            if (p2.getPrice() > p3.getPrice()) {
                if (p2.getPrice() > p4.getPrice()) {
                    System.out.println(p2.getName());
                } else {
                    System.out.println(p4.getName());
                }
            } else {
                if (p3.getPrice() > p4.getPrice()) {
                    System.out.println(p3.getName());
                } else {
                    System.out.println(p4.getName());
                }
            }
        }

        if (p1.getQuantity() > p2.getQuantity()) {
            if (p1.getQuantity() > p3.getQuantity()) {
                if (p1.getQuantity() > p4.getQuantity()) {
                    System.out.println(p1.getName());
                } else {
                    System.out.println(p4.getName());
                }
            } else {
                if (p3.getQuantity() > p4.getQuantity()) {
                    System.out.println(p3.getName());
                } else {
                    System.out.println(p4.getName());
                }
            }
        } else {
            if (p2.getQuantity() > p3.getQuantity()) {
                if (p2.getQuantity() > p4.getQuantity()) {
                    System.out.println(p2.getName());
                } else {
                    System.out.println(p4.getName());
                }
            } else {
                if (p3.getQuantity() > p4.getQuantity()) {
                    System.out.println(p3.getName());
                } else {
                    System.out.println(p4.getName());
                }
            }
        }*/
        //homework
        //1
        double q = 3.6;
        double w = 4;
        double e = -7;

        if ((q < 5) && (q > -5)) {
            if ((w < 5) && (w > -5)) {
                if ((e < 5) && (e > -5)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }

    }
}


