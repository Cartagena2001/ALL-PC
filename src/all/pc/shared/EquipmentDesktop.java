package all.pc.shared;

public class EquipmentDesktop extends Equipment {
    
    private String memory;
    private String graphicCard;
    private String towerSize;
    private String diskCapacity;
    
    public String getMemory() {
        return memory;
    }
    
    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public String getGraphicCard() {
        return graphicCard;
    }
    
    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }
    
    public String getTowerSize() {
        return towerSize;
    }
    
    public void setTowerSize(String towerSize) {
        this.towerSize = towerSize;
    }
    
    public String getDisk_capacity_size() {
        return diskCapacity;
    }
    
    public void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
    }
}
