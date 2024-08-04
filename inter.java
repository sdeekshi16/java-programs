 interface a
 {
  void aa();
 }
 interface b
 {
  void bb();
 }
 class child implements a,b
 {
   public void aa()
   {
     System.out.println("a");
   }
   public void bb()
   {
     System.out.println("b");
   }
 }
 public class inter
 {
   public static void main(String args[])
   {
   	child ch=new child();
    ch.aa();
    ch.bb();
   }
 }