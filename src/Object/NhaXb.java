
package Object;

import java.sql.Date;


public class NhaXb {
    
    private String maNXB;
    private String tenNXB;
    
    public NhaXb() {
        
    }
    
    public NhaXb(String maNXB, String tenNXB) {
        this.maNXB = maNXB;
        this.tenNXB = tenNXB;
    }
    
    public String getMaNXB() {
        return maNXB;
    }
    public void setMaNXB(String m) {
        this.maNXB = m;
    }
    
    public String getTenNXB() {
        return tenNXB;
    }
    public void setTenNXB(String t) {
        this.tenNXB = t;
    }
    
}
