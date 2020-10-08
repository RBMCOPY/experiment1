package show;

import information.CPU;
import information.HardDisk;

public class PC {
private HardDisk HD;
private CPU cpu;
public PC(){
	
}
public PC(CPU cpu,HardDisk HD) {
	setCPU(cpu);
	setHardDisk(HD);
}

public void setCPU(CPU c) {
	cpu=c;
}
void setHardDisk(HardDisk h) {
	HD=h;
}
void show() {
	System.out.println("CPU brand is "+cpu.getType()+".");
	System.out.println("CPU speed is "+cpu.getSpeed()+" HZ.");
	System.out.println("CPU three-level buffer is "+cpu.getRam()+"MB.");
	System.out.println("CPU Cores is "+cpu.getCores()+"cores.");
	System.out.println("SSD HardDisk is "+HD.getSSDAmount()+" G.");
	System.out.println("SSD HardDisk readspeed is "+HD.getReadSSDSpeed()+" MB/s.");
	System.out.println("HHD HardDisk is "+HD.getHDDAmount()+" G.");
	System.out.println("HHD HardDisk readspeed is "+HD.getReadHDDSpeed()+" MB/s.");
}
}
