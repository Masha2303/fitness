import java.util.Date;
import java.util.List;
public class FitnessClub {

    List<Membership> gymMemberships;
    List<Membership> poolMemberships;
    List<Membership> groupClassMemberships;

    public FitnessClub() {
        this.gymMemberships = gymMemberships;
        this.poolMemberships = poolMemberships;
        this.groupClassMemberships = groupClassMemberships;
    }

    public void registerMember(Membership membership, String zone) {
        if (membership.endDate.before(new Date())) {
            System.out.println("Абонемент просрочен");
            return;
        }

        switch (zone) {
            case "тренажерный зал":
                if (gymMemberships.size() >= 20) {
                    System.out.println("Нет свободных мест в тренажерном зале");
                    return;
                }
                gymMemberships.add(membership);
                break;
            case "бассейн":
                if (poolMemberships.size() >= 20) {
                    System.out.println("Нет свободных мест в бассейне");
                    return;
                }
                poolMemberships.add(membership);
                break;
            case "групповые занятия":
                if (groupClassMemberships.size() >= 20) {
                    System.out.println("Нет свободных мест на групповых занятиях");
                    return;
                }
                groupClassMemberships.add(membership);
                break;
            default:
                System.out.println("Данная зона не разрешена по вашему абонементу");
        }
    }

    public void displayMembers() {
        System.out.println("Посетители тренажерного зала:");
        for (Membership membership : gymMemberships) {
            System.out.println(membership.owner.firstName + " " + membership.owner.lastName + " (" + membership.owner.birthYear + ")");
        }

        System.out.println("Посетители бассейна:");
        for (Membership membership : poolMemberships) {
            System.out.println(membership.owner.firstName + " " + membership.owner.lastName + " (" + membership.owner.birthYear + ")");
        }

        System.out.println("Посетители групповых занятий:");
        for (Membership membership : groupClassMemberships) {
            System.out.println(membership.owner.firstName + " " + membership.owner.lastName + " (" + membership.owner.birthYear + ")");
        }
    }

    public List<Membership> getGymMemberships() {
        return gymMemberships;
    }

    public void setGymMemberships(List<Membership> gymMemberships) {
        this.gymMemberships = gymMemberships;
    }

    public List<Membership> getPoolMemberships() {
        return poolMemberships;
    }

    public void setPoolMemberships(List<Membership> poolMemberships) {
        this.poolMemberships = poolMemberships;
    }

    public List<Membership> getGroupClassMemberships() {
        return groupClassMemberships;
    }

    public void setGroupClassMemberships(List<Membership> groupClassMemberships) {
        this.groupClassMemberships = groupClassMemberships;
    }

    @Override
    public String toString() {
        return "FitnessClub{" +
                "gymMemberships=" + gymMemberships +
                ", poolMemberships=" + poolMemberships +
                ", groupClassMemberships=" + groupClassMemberships +
                '}';
    }
}
