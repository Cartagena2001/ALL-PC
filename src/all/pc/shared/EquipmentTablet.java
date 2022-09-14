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
public class EquipmentTablet extends Equipment{
    
    public String screen_diagonal_size;
    public String resistive_capacity;
    public String nand_memory_size;
    public String os;
    
    public String getScreen_diagonal_size() {
        return screen_diagonal_size;
    }
    
    public void setScreen_diagonal_size(String screen_diagonal_size) {
        this.screen_diagonal_size = screen_diagonal_size;
    }
    
    public String getResistive_capacity() {
        return resistive_capacity;
    }
    
    public void setResistive_capacity(String resistive_capacity) {
        this.resistive_capacity = resistive_capacity;
    }
    
    public String getNand_memory_size() {
        return nand_memory_size;
    }
    
    public void setNand_memory_size(String nand_memory_size) {
        this.nand_memory_size = nand_memory_size;
    }
    
    public String getOs() {
        return os;
    }
    
    public void setOs(String os) {
        this.os = os;
    }
}
