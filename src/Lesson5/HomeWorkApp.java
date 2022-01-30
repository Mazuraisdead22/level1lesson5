package Lesson5;

public class HomeWorkApp {
    public static void main(String[] args) {

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 30);
        empArray[1] = new Employee("Svetov Stanislav", "cleaner", "svetov@mailbox.com", 892312319, 20000, 55);
        empArray[2] = new Employee("Tura Svetlana", "accountant", "tura@mailbox.com", 892312313, 25000, 43);
        empArray[3] = new Employee("Sirota Vladimir", "grinder", "sirota@mailbox.com", 892312310, 28000, 38);
        empArray[4] = new Employee("Zloba Gennadiy", "builder", "zlo@mailbox.com", 892312311, 35000, 41);

        for(int i = 0; i < empArray.length; i++){
            if(empArray[i].getAge() > 40){
                empArray[i].printInfo();
            }
        }


        }
}
