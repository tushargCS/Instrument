package com.automobile;

abstract class Vehical{
abstract public String getModelName();
abstract public String getRegistrationNumber();
abstract Public  String getOwnerName();  

}


package com.automobile.TwoWheeler;
import com.automobile.Vehical;
class Hero extends Vehical{
@override
public String getModelName(String a){
System.out.println("the model is"+a);
}
public String getRegistrationNumber(String d){
system.out.println("the get no is"+d);
}
public String getOwnerName(String n){
system.out.println("the owner name is "+n);
}
public int getSpeed(int s){
system.out.println("the current speed is"+ s);
}

public void radio(){}
}

Class Honda extends vehical{
@override
public String getModelName(String a){
System.out.println("the model is"+a);
}
public String getRegistrationNumber(String d){
system.out.println("the get no is"+d);
}
public String getOwnerName(String n){
system.out.println("the owner name is "+n);
}
public int getSpeed(int s){
system.out.println("the current speed is"+ s);
}
public void cdPlayer(){
systrm.out.println("");

}

}


class Test{
Hero hero= new Hero();
                            hero.getModelName("");
		hero.getOwnerName("");
		hero.getRegistrationNumber("");
		hero.getSpeed();
		hero.radio();
		

Honda honda = new Honda();
                            honda.getModelName("");
		honda.getOwnerName("");
		honda.getRegistrationNumber("");
		honda.getSpeed("");
		honda.cdplayer("");


}
