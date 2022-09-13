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
public class EquipmentDesktop extends Equipment {
    
    public String memory;
    public String graphic_card;
    public String tower_size;
    public String disk_capacity;
    
    
    public EquipmentDesktop(String maker, String model, String processor, String memory, String graphic_card, String tower_size, String disk_capacity){
        super(maker, model, processor);
        this.memory = memory;
        this.graphic_card = graphic_card;
        this.tower_size = tower_size;
        this.disk_capacity = disk_capacity;

    }
}
