package all.pc;
import all.pc.shared.Equipment;
import all.pc.shared.EquipmentDesktop;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ALLPC {

    public static void main(String[] args) {
        
        ArrayList<EquipmentDesktop> equipments = new ArrayList<EquipmentDesktop>();

        EquipmentDesktop eq = new EquipmentDesktop();
        eq.setDisk_capacity("hola");
        
        eq.setMaker("Dell");
        System.out.println(eq.getDisk_capacity_size());
    }
    
}
