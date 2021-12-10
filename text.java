abstract class Instrument{
public void play();
}

class Piano extends Instruments{
@override
public void play(){
System.out.println("tan tan tan tan");

}
}
class Flute extends Instruments{
@override
public void play(){
System.out.println("toon toon toon toon");

}
}
class Guiter extends Instruments{
@override
public void play(){
System.out.println("tin tin tin tin");
}
 
}
public class test{
public Static void main(String[]args){
Instructions[] in= new Instructions[10];
Randon no= new Random();
for(int i=0;i<10;i++){
int a=no.nextInt(4);
if(a==1){
in[i]=new piano;
}
else if(a==2){
in[i]=new Flute();
}
else if(a==3){
in [i]=new Guiter();

in[i].play();
}
}

for(int i=0;i<10;i++){
if(in[i] instanceof Piano){
      System.out.println("Piano is stored at index"+i);
}

else if(in[i] instanceof Flute){
  System.out.println("Flute is Stored at index"+ i);

}
else if(in[i] instanceof Guiter){
System.out.println("Guitar is stored at index of"+i);
}
}


}
}
