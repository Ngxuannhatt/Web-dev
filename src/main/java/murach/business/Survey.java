package murach.business;
import java.io.Serializable;
public class Survey implements Serializable {
    private User user;
    private String heardFrom;
    private String wantsUpdates;
    private String contactVia;

    public Survey() {
        this.heardFrom = "";
        this.wantsUpdates = "";
        this.contactVia = "";
    }

    public Survey(User user, String heardFrom, String wantsUpdates, String contactVia) {
        this.user = user;
        this.heardFrom = heardFrom;
        this.wantsUpdates = wantsUpdates;
        this.contactVia = contactVia;
    }

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getHeardFrom() {
        return heardFrom;
    }
    public void setHeardFrom(String heardFrom) {
        this.heardFrom = heardFrom;
    }
    public String getWantsUpdates () {
        return wantsUpdates;
    }
    public void setWantsUpdates() {
        this.wantsUpdates = wantsUpdates;
    }
    public String getContactVia(){
        return contactVia;
    }
    public void setContactVia() {
        this.contactVia = contactVia;
    }
}
