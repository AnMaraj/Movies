import java.util.List;

public class Filmat {
    //viti i prodhimit
    //Zhanerat
    //kohezgjatja
    //nje list me klasen aktoret  List<Aktoret>


  private List<Aktoret>aktoret;
  private List<String >zhanerat;
  private long vitiIProdhimit;
  private String kohezgjatja;

  public Filmat(){

  }

    public List<Aktoret> getAktoret() {
        return aktoret;
    }

    public void setAktoret(List<Aktoret> aktoret) {
        this.aktoret = aktoret;
    }

    public List<String> getZhanerat() {
        return zhanerat;
    }

    public void setZhanerat(List<String> zhanerat) {
        this.zhanerat = zhanerat;
    }

    public long getVitiIProdhimit() {
        return vitiIProdhimit;
    }

    public void setVitiIProdhimit(long vitiIProdhimit) {
        this.vitiIProdhimit = vitiIProdhimit;
    }

    public String getKohezgjatja() {
        return kohezgjatja;
    }

    public void setKohezgjatja(String kohezgjatja) {
        this.kohezgjatja = kohezgjatja;
    }

    @Override
    public String toString() {
        return "Filmat{" +
                "aktoret=" + aktoret +
                ", zhanerat=" + zhanerat +
                ", vitiIProdhimit=" + vitiIProdhimit +
                ", kohezgjatja='" + kohezgjatja + '\'' +
                '}';
    }


}
