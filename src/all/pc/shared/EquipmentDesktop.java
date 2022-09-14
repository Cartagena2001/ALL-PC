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

    
    public EquipmentDesktop() {
        
    }
    
    public String getMemory() {
        return memory;
    }
    
    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public String getGraphic_card() {
        return graphic_card;
    }
    
    public void setGraphic_card(String graphic_card) {
        this.graphic_card = graphic_card;
    }
    
    public String getTower_size() {
        return tower_size;
    }
    
    public void setTower_size(String tower_size) {
        this.tower_size = tower_size;
    }
    
    public String getDisk_capacity_size() {
        return disk_capacity;
    }
    
    public void setDisk_capacity(String disk_capacity) {
        this.disk_capacity = disk_capacity;
    }
    
    public void details(String maker, String model, String processor, String memory, String graphic_card, String tower_size, String disk_capacity) {
        details(maker, model, processor);
        this.memory = memory;
        this.graphic_card = graphic_card;
        this.tower_size = tower_size;
        this.disk_capacity = disk_capacity;
    }
}
