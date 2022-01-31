public class Sthread extends Thread{
public void run() {
System.out.println("Task 1");}
public static void main(String[] args) {
Sthread s=new Sthread();
s.start();
Sthread ss=new Sthread();
ss.start();} }
