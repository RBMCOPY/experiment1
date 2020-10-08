package information;

public class HardDisk {
private int SSDamount;
private int readSSDSpeed;
private int HDDamount;
private int readHDDSpeed;
public HardDisk(){
	
}
public HardDisk(int SSDamount,int readSSDSpeed,int HDDamount,int readHDDSpeed) {
	setSSDAmount(SSDamount);
	setReadSSDSpeed(readSSDSpeed);
	setHDDAmount(HDDamount);
	setReadHDDSpeed(readHDDSpeed);
}
public int getSSDAmount() {
	return SSDamount;
}
public void setSSDAmount(int SSDamount) {
    this.SSDamount = SSDamount;
 }

public int getReadSSDSpeed() {
	return readSSDSpeed;
}
public void setReadSSDSpeed(int readSSDSpeed) {
    this.readSSDSpeed = readSSDSpeed;
 }

public int getHDDAmount() {
	return HDDamount;
}
public void setHDDAmount(int HDDamount) {
    this.HDDamount = HDDamount;
 }

public int getReadHDDSpeed() {
	return readHDDSpeed;
}
public void setReadHDDSpeed(int readHDDSpeed) {
    this.readHDDSpeed = readHDDSpeed;
 }

}
