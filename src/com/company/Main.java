package com.company;
import java.util.*;


// kitaphana kostik

class Jqueue{
    public int count = 0; // schetchik ainimalisi
    public int element; // el kos
    Scanner Sc=new Scanner(System.in); // scanner kosu
    int n=Sc.nextInt();
    int []a=new int[n]; // massiv kosu
    void enqueue()
    {
        try
        {
            System.out.print("Enter the element: ");
            a[count++]=Sc.nextInt();// engizgen razmerli massiv
        }
        catch(Exception e)
        {
            System.out.println(e+ "the queue is full");
        }
    }
    void dequeue()
    {
        try
        {
            System.out.println("the deleted element is"+a[0]);
            for(int i=0; i<count-1; i++)
            {
                a[i] = a[i+1];
            }
            a[count-1] =0;
            count -= 1;

        }
        catch(Exception e)
        {
            System.out.println(e +"the queue is empty");
        }
    }
    void  display()
    {
        try
        {
            for(int i=0;i<count;++i)
            {
                System.out.println("Elements in queue are" + a[i]);
            }
        }
        catch(Exception j)
        {
            System.out.println(j+"the queue is  empty");
        }
    }
}
class Main
{
    public static void main(String args[])
    {
        int opt,v;
        Scanner S=new Scanner(System.in);
        System.out.println("Enter queue size: ");
        Jqueue A=new Jqueue(); // inisalizacia
        System.out.println("\nqueue\n1.enqueue\n2.dequeue\n3.display"); // tandau
        do
        {
            System.out.println("Enter the choice");
            opt=S.nextInt();
            switch(opt) // engizgen man boyinsha case-ti orindaidy
            {
                case 1:
                    A.enqueue();
                    break;
                case 2:
                    A.dequeue();
                    break;
                case 3:
                    A.display();
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }
            System.out.println("do you wish to contnue(1/0)?");
            v=S.nextInt();
        }while(v==1);
    }
}