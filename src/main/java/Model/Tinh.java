package Model;

import java.util.Objects;

public class Tinh {
    private int maTinh;
    private String tenTinh;

    public Tinh() {
    }

    public Tinh(int maTinh, String tenTinh) {
        this.maTinh = maTinh;
        this.tenTinh = tenTinh;
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    @Override
    public String toString() {
        return "Tinh{" +
                "maTinh=" + maTinh +
                ", tenTinh='" + tenTinh + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tinh)) return false;
        Tinh tinh = (Tinh) o;
        return maTinh == tinh.maTinh && Objects.equals(tenTinh, tinh.tenTinh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maTinh, tenTinh);
    }
}
