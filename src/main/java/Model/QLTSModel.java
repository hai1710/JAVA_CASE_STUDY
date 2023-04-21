package Model;

import java.util.ArrayList;

public class QLTSModel {
    private ArrayList<ThiSinh> dsThiSinh;
    private String luaChon;

    public String getLuaChon() {
        return luaChon;
    }

    public void setLuaChon(String luaChon) {
        this.luaChon = luaChon;
    }

    public QLTSModel() {
        this.dsThiSinh = new ArrayList<ThiSinh>();
        this.luaChon = "";
    }

    public QLTSModel(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }

    public ArrayList<ThiSinh> getDsThiSinh() {
        return dsThiSinh;
    }

    public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
        this.dsThiSinh = dsThiSinh;
    }
    public void insert(ThiSinh thiSinh){
        this.dsThiSinh.add(thiSinh);
    }
    public void delete(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
    }
    public void edit(ThiSinh thiSinh){
        // TODO: 20/04/2023
    }
    public void update(ThiSinh thiSinh){
        this.dsThiSinh.remove(thiSinh);
        this.dsThiSinh.add(thiSinh);
    }


}
