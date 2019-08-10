class GoodDogTestDrive{
public static void main (String[] args){

GoodDog d = new GoodDog();
d.setSize(70);
GoodDog e = new GoodDog();
e.setSize(15);
System.out.println("get size of reference object d" +d.getSize());
System.out.println("get size of reference object e" +e.getSize());
d.bark();

e.bark();}}