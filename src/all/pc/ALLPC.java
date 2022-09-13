package all.pc;
import all.pc.shared.Equipment;
import all.pc.shared.EquipmentDesktop;
import java.util.ArrayList;

public class ALLPC {

    public static void main(String[] args) {
        
        ArrayList<Equipment> equipments = new ArrayList<Equipment>();
        
        EquipmentDesktop eq = new EquipmentDesktop("DELL", "Ak47", "CoreDUO", "8Ghz", "GT710", "2cm", "20kb");
        equipments.add(eq);
        
        for (Equipment equipment : equipments) {
            System.out.println(equipment);
        }
    }
    
}
