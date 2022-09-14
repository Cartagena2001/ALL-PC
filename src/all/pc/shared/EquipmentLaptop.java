/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.pc.shared;

/**
 *
 * @author Cartagena
 */
public class EquipmentLaptop extends Equipment {
    
    public String memory;
    public String disk_capacity;
    public String screen_size;
    
    
    public EquipmentLaptop(){

    }
    
    public String getMemory() {
        return memory;
    }
    
    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public String getDisk_capacity() {
        return disk_capacity;
    }
    
    public void setDisk_capacity(String disk_capacity) {
        this.disk_capacity = disk_capacity;
    }
    
    public String getScreen_size() {
        return screen_size;
    }
    
    public void setScreen_size(String screen_size) {
        this.screen_size = screen_size;
    }
}
