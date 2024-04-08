import java.util.Date;
public class Main {
    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub();
        Customer customer1 = new Customer("Иван", "Иванов", 1985);
        Membership membership1 = new Membership(new Date(), new Date(System.currentTimeMillis() + 86400000), customer1);

        fitnessClub.registerMember(membership1, "тренажерный зал");
        fitnessClub.registerMember(membership1, "групповые занятия");
        fitnessClub.registerMember(membership1, "бассейн");

        fitnessClub.displayMembers();
    }
}