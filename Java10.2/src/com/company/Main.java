package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti polinomul 1, exponentul urmat de coeficientul fiecarui termen:");
        int e = scanner.nextInt();
        int c;
        Polinom head1 = null;
        Polinom previous1 = null;
        while (e >= 0) {
            c = scanner.nextInt();
            Polinom actual = new Polinom(e, c);
            actual.setHead(head1);
            if (head1 == null) {
                head1 = actual;
            } else {
                previous1.setNext(actual);
            }
            previous1 = actual;
            e = scanner.nextInt();
        }
        System.out.println("Introduceti polinomul 2, exponentul urmat de coeficientul fiecarui termen:");
        Polinom head2 = null;
        Polinom previous2 = null;
        e = scanner.nextInt();
        while (e >= 0) {
            c = scanner.nextInt();
            Polinom actual = new Polinom(e, c);
            actual.setHead(head2);
            if (head2 == null) {
                head2 = actual;
            } else {
                previous2.setNext(actual);
            }
            previous2 = actual;
            e = scanner.nextInt();
        }
        polinomsuma(previous1.getHead(),previous2.getHead());
    }
    static void polinomsuma(Polinom a, Polinom b)
    {
        int ea,eb,s;
        Polinom head3 = null;
        Polinom previous3 = null;
        while (a!=null||b!=null){
            ea=a.getE();
            eb=b.getE();
            if(ea==eb)
            {
                s=a.getC()+b.getC();
                Polinom actual = new Polinom(ea, s);
                actual.setHead(head3);
                if(head3==null)
                    head3=actual;
                else
                    previous3.setNext(actual);
                previous3 = actual;
                a=a.getNext();
                b=b.getNext();
            }
            else
            if(ea>eb)
            {
                s=a.getC();
                Polinom actual = new Polinom(ea,s);
                actual.setHead(head3);
                if(head3==null)
                    head3=actual;
                else
                    previous3.setNext(actual);
                previous3 = actual;
                a=a.getNext();
            }
            else
            if(ea<eb)
            {
                s=b.getC();
                Polinom actual = new Polinom(eb,s);
                actual.setHead(head3);
                if(head3==null)
                    head3=actual;
                else
                    previous3.setNext(actual);
                previous3 = actual;
                b=b.getNext();
            }
        }
        System.out.println("Termenii polinomul suma sunt: ");
        print(previous3.getHead());
    }
    static void print(Polinom s){
        while (s!=null){
            System.out.println(s.getC()+"X^"+s.getE());
            s=s.getNext();
        }
    }
}
