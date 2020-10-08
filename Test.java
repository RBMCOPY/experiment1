package show;

import information.CPU;
import information.HardDisk;

public class Test {

   public static void main(String args[]) {

       CPU cpu = new CPU(2.6,"Intel i7-9750H",12,6);

       HardDisk HD=new HardDisk(256,200,1024,90);

       PC pc =new PC(cpu,HD);

       pc.show();

    }

}