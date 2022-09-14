package all.pc.shared;

public class EquipmentTablet extends Equipment{

    private String screenDiagonalSize;
    private String resistive_capacity;
    private String nandMemorySize;
    private String os;
    
    public String getScreenDiagonalSize() {
        return screenDiagonalSize;
    }
    
    public void setScreenDiagonalSize(String screenDiagonalSize) {
        this.screenDiagonalSize = screenDiagonalSize;
    }
    
    public String getResistive_capacity() {
        return resistive_capacity;
    }
    
    public void setResistive_capacity(String resistive_capacity) {
        this.resistive_capacity = resistive_capacity;
    }
    
    public String getNandMemorySize() {
        return nandMemorySize;
    }
    
    public void setNandMemorySize(String nandMemorySize) {
        this.nandMemorySize = nandMemorySize;
    }
    
    public String getOs() {
        return os;
    }
    
    public void setOs(String os) {
        this.os = os;
    }
}
