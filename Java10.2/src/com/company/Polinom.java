package com.company;

public class Polinom {

    private int c;
    private int e;

    private Polinom head;
    private Polinom next;

    public Polinom(int e, int c) {
        this.e = e;
        this.c = c;
    }

    public int getE() {
        return e;
    }

    /*public void setE(int e) {
        this.e = e;
    }
*/
    public int getC() {
        return c;
    }

    /*public void setC(int c) {
        this.c = c;
    }
*/
    public Polinom getHead() {
        return head;
    }

    public void setHead(Polinom head) {
        this.head = head;
    }

    public Polinom getNext() {
        return next;
    }

    public void setNext(Polinom next) {
        this.next = next;
    }
}