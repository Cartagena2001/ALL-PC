package all.pc;
import all.pc.shared.EquipmentDesktop;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AllPc {

    public static void main(String[] args) {

        ArrayList<EquipmentDesktop> equipments = new ArrayList<>();
        EquipmentDesktop eq = new EquipmentDesktop();

        System.out.println(eq.getDisk_capacity_size());
        eq.setMaker(JOptionPane.showInputDialog(null, "Enter Manufacturer"));
        eq.setModel(JOptionPane.showInputDialog(null, "Enter Model"));
        eq.setProcessor(JOptionPane.showInputDialog(null, "Enter MicroProcessor"));
        eq.setMemory(JOptionPane.showInputDialog(null, "Enter Memory"));
        eq.setGraphicCard(JOptionPane.showInputDialog(null, "Enter Graphic card"));
        eq.setTowerSize(JOptionPane.showInputDialog(null, "Enter Tower Size"));
        eq.setDiskCapacity(JOptionPane.showInputDialog(null, "Enter Disk Capacity"));

        int n =1;
        StringBuilder msg = new StringBuilder();
        for(int i=0 ; i < n ; i++){
            msg.append("Desktops(").append(i + 1).append(")").append("\nMaker  = ").append(eq.getMaker()).append("\nModel  = ").append(eq.getModel()).append("\nProcessor  = ").append(eq.getProcessor()).append("\nMemory  = ").append(eq.getMemory()).append("\nGraphic Card  = ").append(eq.getGraphicCard()).append("\nTower size  = ").append(eq.getTowerSize()).append("\nDisk capacity  = ").append(eq.getDisk_capacity_size()).append("\n--------------------------------\n");
        }

        JOptionPane.showMessageDialog(null, msg.toString());
    }
}