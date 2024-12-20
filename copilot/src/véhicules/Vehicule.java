package véhicules;

public abstract class Vehicule {
private String brand ; private int year;
public Vehicule(String brand , int year) {
	this.brand=brand;
	this.year=year;
}
public String getBrand() {return brand;}
public void setBrand(String brand) { this.brand=brand;}
public int getYear() {return year;}
public void setBrand(int year) { this.year=year;}
public abstract void startEngine();
}
