package Pertemuan_10.Tugas;

public class Compact {
    protected String merk;
    protected String shade;

    public Compact(String merk, String shade)
    {
        this.merk = merk;
        this.shade = shade;
    }

    public String getMerk()
    {
        return merk;
    }
    
    
    public void setShade(String shade ) {
    	this.shade = shade;
    }

    public String getShade()
    {
        return shade;
    }
}
