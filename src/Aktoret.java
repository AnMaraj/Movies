public class Aktoret {

    //cdo aktor ka nje emer te plote, ka nje rol, ka dhe nje moshe.
    //per keteo duhet te krijojme konstruktore me dhe pa parametra,
    // getters dhe setters
    // to string

    String emerIPlote;
    String roli;
    int mosha;
    public Aktoret(){

    }

    public String getEmerIPlote() {
        return emerIPlote;
    }

    public String getRoli() {
        return roli;
    }

    public int getMosha() {
        return mosha;
    }

    public void setEmerIPlote(String emerIPlote) {
        this.emerIPlote = emerIPlote;
    }

    public void setRoli(String roli) {
        this.roli = roli;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return "Aktoret{" +
                "emerIPlote='" + emerIPlote + '\'' +
                ", roli='" + roli + '\'' +
                ", mosha=" + mosha +
                '}';
    }

}
