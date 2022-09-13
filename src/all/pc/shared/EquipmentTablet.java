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
    
    EquipmentTablet(String maker, String model, String processor, String screen_diagonal_size, String resistive_capacity, String nand_memory_size, String os){
        super(maker, model, processor);
        this.screen_diagonal_size = screen_diagonal_size;
        this.resistive_capacity = resistive_capacity;
        this.nand_memory_size = nand_memory_size;
        this.os = os;
    }
}
