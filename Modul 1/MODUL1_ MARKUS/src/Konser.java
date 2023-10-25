public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String bandName;
    private String playDate;
    private String location;
    private int priceTicket;

    Konser(String name, String playDate, String localtion, int priceTicket){
        setBandName(name);
        setPlayDate(playDate);
        setLocation(localtion);
        setPriceTicket(priceTicket);
    }

    public String getBandName() {
        return bandName;
    }
    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public String getPlayDate() {
        return playDate;
    }
    public void setPlayDate(String playDate) {
        this.playDate = playDate;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getPriceTicket() {
        return priceTicket;
    }
    public void setPriceTicket(int priceTicket) {
        this.priceTicket = priceTicket;
    }
}