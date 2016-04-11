package com.micles92;

/**
 * Created by lesiulol on 09.04.16.
 */
public class Para {
    public final String KLUCZ;
    private double wartosc;


    public Para(String KLUCZ, double wartosc) {
        this.KLUCZ = KLUCZ;
        this.wartosc = wartosc;
    }

    public String getKLUCZ() {
        return KLUCZ;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Para para = (Para) o;

        if (Double.compare(para.wartosc, wartosc) != 0) return false;
        return KLUCZ != null ? KLUCZ.equals(para.KLUCZ) : para.KLUCZ == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = KLUCZ != null ? KLUCZ.hashCode() : 0;
        temp = Double.doubleToLongBits(wartosc);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "com.micles92.Para{" +
                "KLUCZ='" + KLUCZ + '\'' +
                ", wartosc=" + wartosc +
                '}';
    }
}
