package all.pc.shared;

public class EquipmentLaptop extends Equipment {

    private String memory;
    private String diskCapacity;
    private String screenSize;
    
    public String getMemory() {
        return memory;
    }
    
    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public String getDiskCapacity() {
        return diskCapacity;
    }
    
    public void setDiskCapacity(String diskCapacity) {
        this.diskCapacity = diskCapacity;
    }
    
    public String getScreenSize() {
        return screenSize;
    }
    
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
