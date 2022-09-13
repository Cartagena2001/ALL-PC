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
public class Equipment {
    
    public String maker;
    public String model;
    public String processor;

    
    Equipment(String maker, String model, String processor){
        this.maker = maker;
        this.model = model;
        this.processor = processor;
        
    }
}
