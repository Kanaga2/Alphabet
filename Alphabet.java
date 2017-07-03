# Alphabet
import java.io.*;
import java.util.*;
public class Alphabet
{
public static void main(String args[])
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the alphabet");
ch=sc.next().charAt(0);
if((ch>='a'&&ch>='z')||(ch>='A'&&ch>='Z'))
{
System.out.println("It is a alphabet");
}
else
{
System.out.println("It is not a alphabet");
}
}
}
