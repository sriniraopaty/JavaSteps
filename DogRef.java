public class DogRef{

String name ;

public static void main(String[] args){

DogRef d = new DogRef();

d.name = "Boxy";
d.bark();

DogRef[] mydog = new DogRef[3];

mydog[0] = new DogRef();
mydog[1] = new DogRef();
mydog[2] = d;

mydog[0].name = "Fred";
mydog[1].name = "Charles";

System.out.println(" My second log name");
System.out.println(mydog[1].name);

int x = 0;
while(x < mydog.length)
{
mydog[x].bark();
x = x + 1;
}

}

public void bark()
{
System.out.println(name + "Says Ruff");
}
}