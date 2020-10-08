# 计192 2019310194 任博淼

# JAVA实验二
# 阅读程序
## 实验目的
1.掌握类的设计
2.写出程序并初步学会调试
3.利用GitHub平台写实验报告
## 实验过程
1.首先按照实验要求和PC,CPU，HardDisk类关联他UML图创建以PC,CPU,HardDisk,Test为类名的四个类，Test为主类。
2.根据要求设置变量.
3.设置主类：main方法中创建一个 CPU对象cpu。
main方法中创建一个HardDisk对象disk。
main方法中创建一一个 PC对象pc。
pc调用setCPU(CPU c)方法，调用时实参是cpu。
pc调用setHardDisk (HardDisk h)方法，调用时实参是disk.
pc调用show(方法。
4.根据要求，每个类增加1~2个构造方法。
5.更改部分数值访问权限。
## 核心方法
（1）  
public CPU(double speed, String type, int Ram, int Cores) {  
	setSpeed(speed);  
	setType(type);  
    setRam(Ram);  
    setCores(Cores);  
}  
（2）  
public void setSpeed(double m) {  
	speed=m;  
}  
public double getSpeed() {  
	return speed;  
}  
（3）  
public HardDisk(int SSDamount,int readSSDSpeed,int HDDamount,int readHDDSpeed) {  
	setSSDAmount(SSDamount);  
	setReadSSDSpeed(readSSDSpeed);  
	setHDDAmount(HDDamount);  
	setReadHDDSpeed(readHDDSpeed);  
}  
（4）  
public int getSSDAmount() {  
	return SSDamount;  
}  
public void setSSDAmount(int SSDamount) {  
    this.SSDamount = SSDamount;  
 }  
 （5）  
 void show() {  
	System.out.println("CPU brand is "+cpu.getType()+".");  
	System.out.println("CPU speed is "+cpu.getSpeed()+" GHZ.");  
	System.out.println("CPU three-level buffer is "+cpu.getRam()+"MB.");  
	System.out.println("CPU Cores is "+cpu.getCores()+"cores.");  
	System.out.println("SSD HardDisk is "+HD.getSSDAmount()+" G.");  
	System.out.println("SSD HardDisk readspeed is "+HD.getReadSSDSpeed()+" MB/s.");  
	System.out.println("HHD HardDisk is "+HD.getHDDAmount()+" G.");  
	System.out.println("HHD HardDisk readspeed is "+HD.getReadHDDSpeed()+" MB/s.");  
}  
## 实验结果
![1](https://github.com/RBMCOPY/experiment1/blob/main/4f4eabddd7e4d4ad07ed4716e1ee77f.png)
## 实验感想
  根据这次实验，我深刻了解了JAVA的魅力。这次实验真正为我打开了JAVA的大门，在这一次的实验中，我基本掌握了Java的编程规则、知识要点和一些小技巧，特别是对面向对象的编程思想和风格有了进一步的认识和体会。同时，因正确的编出程序而带来的成就感让我对编程更加感兴趣。
