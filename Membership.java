import java.util.Date;
public class Membership {

    Date registrationDate;
    Date endDate;
    Customer owner;

    public Membership(Date registrationDate, Date endDate, Customer owner) {
        this.registrationDate = registrationDate;
        this.endDate = endDate;
        this.owner = owner;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Membership{" +
                "registrationDate=" + registrationDate +
                ", endDate=" + endDate +
                ", owner=" + owner +
                '}';
    }
}
