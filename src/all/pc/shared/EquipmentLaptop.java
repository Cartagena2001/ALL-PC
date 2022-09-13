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
    
    EquipmentLaptop(String maker, String model, String processor, String memory, String disk_capacity, String screen_size){
        super(maker, model, processor);
        this.memory = memory;
        this.disk_capacity = disk_capacity;
        this.screen_size = screen_size;
    }
}
