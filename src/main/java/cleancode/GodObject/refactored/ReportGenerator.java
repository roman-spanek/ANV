package cleancode.GodObject.refactored;

import java.util.List;

class ReportGenerator {
    public void generateReport(List<String> users, List<String> orders) {
        //TODO je to ideální reseni?
        System.out.println("Users: " + users);
        System.out.println("Orders: " + orders);
    }
}
