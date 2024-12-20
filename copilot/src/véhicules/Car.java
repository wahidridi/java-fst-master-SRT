package véhicules;

public class Car extends Vehicule{
private int nmPo ; 
public int getNmPo() {return nmPo;}
public void setNmPo(int nmPo) {this.nmPo=nmPo;}
public Car (String brand , int year , int nmPo) {
	super(brand , year );
	this.nmPo=nmPo;
}
public void startEngine() {
	System.out.println("the car engine is starting...");
}

}