package put.io.patterns.implement;

import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;
import oshi.software.os.OperatingSystem;

import java.util.ArrayList;
import java.util.List;

public class SystemInfoObserver implements SystemStateObserver {

   public void update(SystemState newstate) {


       // Print information to the console
       System.out.println("============================================");
       System.out.println(String.format("CPU Load: %2.2f%%", newstate.getCpu()));
       System.out.println(String.format("CPU temperature: %.2f C", newstate.getCpuTemp()));
       System.out.println(String.format("Available memory: %.2f MB", newstate.getAvailableMemory()));
       System.out.println(String.format("USB devices: %d", newstate.getUsbDevices()));

       // Run garbage collector when out of memory
       if (newstate.getAvailableMemory() < 200.00){
           System.out.println("> Running garbage collector...");
       }

       // Increase CPU cooling if the temperature is to high
       if (newstate.getCpuTemp() > 60.00){
           System.out.println("> Increasing cooling of the CPU...");
       }

   }
}
