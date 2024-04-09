
package model;

public class Model_Tau {
    private String tenTau;
    private String TGDi;
    private String TGDen;

    public Model_Tau() {
    }

    public Model_Tau(String tenTau, String TGDi, String TGDen) {
        this.tenTau = tenTau;
        this.TGDi = TGDi;
        this.TGDen = TGDen;
    }

    
    
    public String getTenTau() {
        return tenTau;
    }

    public void setTenTau(String tenTau) {
        this.tenTau = tenTau;
    }

    public String getTGDi() {
        return TGDi;
    }

    public void setTGDi(String TGDi) {
        this.TGDi = TGDi;
    }

    public String getTGDen() {
        return TGDen;
    }

    public void setTGDen(String TGDen) {
        this.TGDen = TGDen;
    }
    
}
