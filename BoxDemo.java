class MyBox{
   int l;
   int b; 
   int h;
}
class BoxDemo{
   public static void main(String args[]){
   	int vol;
   	MyBox box=new MyBox();
   	box.l=10;
   	box.b=5;
   	box.h=2;
   	vol=box.l*box.b*box.h;
   	System.out.println("Vol="+vol);
   }
}
