import java.util.*;
public class Testinterrupt {
public static void main(String[] args){
MThread thread = new MThread();
Thread Th = new Thread(thread);
Th.start();
}
} class MThread implements Runnable{
boolean flag = true;
public void run(){
while(flag){
System.out.println("=="+ new Date() +"==");
try{
Thread.sleep(5000);
}catch(InterruptedException e){
return;
}
}
}
}


