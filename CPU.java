package information;

public class CPU {
private double speed;
private String brand;
private int Ram;
private int Cores;
public CPU(){

}
public CPU(double speed, String type, int Ram, int Cores) {
	setSpeed(speed);
	setType(type);
    setRam(Ram);
    setCores(Cores);
}

public void setSpeed(double m) {
	speed=m;
}
public double getSpeed() {
	return speed;
}

public void setType(String m) {
	brand=m;
}
public String getType() {
	return brand;
}

public void setRam(int m) {
	Ram=m;
}
public int getRam() {
	return Ram;
}

public void setCores(int m) {
	Cores=m;
}
public int getCores() {
	return Cores;
}

}
