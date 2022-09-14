package all.pc;
import all.pc.shared.Equipment;
import all.pc.shared.EquipmentDesktop;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ALLPC {

    public static void main(String[] args) {
        
        ArrayList<EquipmentDesktop> equipments = new ArrayList<EquipmentDesktop>();
        EquipmentDesktop eq = new EquipmentDesktop();
        
        System.out.println(eq.getDisk_capacity_size());
        eq.setMaker(JOptionPane.showInputDialog(null, "Enter Manufacturer"));
        eq.setModel(JOptionPane.showInputDialog(null, "Enter Model"));
        eq.setProcessor(JOptionPane.showInputDialog(null, "Enter MicroProcessor"));
        eq.setMemory(JOptionPane.showInputDialog(null, "Enter Memory"));
        eq.setGraphic_card(JOptionPane.showInputDialog(null, "Enter Graphic card"));
        eq.setTower_size(JOptionPane.showInputDialog(null, "Enter Tower Size"));
        eq.setDisk_capacity(JOptionPane.showInputDialog(null, "Enter Disk Capacity"));
        
        int n =1;
        String msg ="";
        for(int i=0 ; i < n ; i++){
            msg += "Desktops(" + (i+1) + ")" +"\nMaker  = " +eq.getMaker() +"\nModel  = " +eq.getModel() +"\nProcessor  = " +eq.getProcessor() +"\nMemory  = " +eq.getMemory() +"\nGraphic Card  = " +eq.getGraphic_card() +"\nTower size  = " +eq.getTower_size() +"\nDisk capacity  = " +eq.getDisk_capacity_size() + "\n--------------------------------\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
