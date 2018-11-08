import java.util.ArrayList;

public class TeamBuilding {

    private static Member[] teamMember;

    public static void main(String[] args){
        InputOutput.output("Welcome to the Team Builder System");
        InputOutput.output("========================");
        int number = InputOutput.inputInt( "How many members are there in team?");
        teamMember = new Member[number];
        String raw;

        for (int i = 0; i<number; i++){
            raw = InputOutput.input("Input the team members (Name:Surname:Sex:DD/MM/YYYY) :");

            int start = raw.indexOf(":");
            String name = raw.substring(0,start);
            raw = raw.substring(start+1);

            start = raw.indexOf(":");
            String surname = raw.substring(0,start);
            raw = raw.substring(start+1);

            start = raw.indexOf(":");
            char sex = raw.charAt(0);
            raw = raw.substring(start+1);

            start = raw.indexOf("/");
            String dateStr = raw.substring(0,start);
            raw = raw.substring(start+1);

            start = raw.indexOf("/");
            String monthStr = raw.substring(0, start);

            String yearStr = raw.substring(start+1);

            int year = Integer.valueOf(yearStr).intValue();

            int birthday = Integer.valueOf(yearStr + monthStr + dateStr).intValue();

            teamMember [i] = new Member(name, surname, sex, birthday, year,yearStr, monthStr, dateStr);
        }


        showMenu();
    };





    public static void showMenu() {
        InputOutput.output("========================");
        InputOutput.output("Team Builder menu");
        InputOutput.output("========================");
        InputOutput.output("");
        InputOutput.output("Select one of the following actions:");
        InputOutput.output("1) List the team members");
        InputOutput.output("2) Find the oldest member");
        InputOutput.output("3) FInd the youngest member");
        InputOutput.output("4) Exit");
        InputOutput.output("");
        InputOutput.output("");

        char selection = InputOutput.inputChar("Which action do you want to perform? ");

        switch (selection) {
            case '1' : listAllMember(teamMember);
                break;
            case '2' : showOldest(teamMember);
                break;
            case '3' : showYoungest(teamMember);
                break;
            case '4' : System.exit(0);
                break;
            default : showMenu();
                break;
        }
    }


    public static void listAllMember(Member[] teamMember){
        for(int i=0; i < teamMember.length; i++) {

            Member temp = teamMember[i];

            String name = temp.getName();
            String surname = temp.getSurname();
            String sex;
            if (temp.getSex() == 'f'){
                sex = "female";
            }else{
                 sex = "male";
            }

            String dateStr = temp.getDateStr();
            String monthStr = temp.getMonthStr();
            String yearStr = temp.getYearStr();

            InputOutput.output("");
            InputOutput.output("=================================");
            InputOutput.output(name + ", "+ surname + " " + sex + ", born" + dateStr + "/" + monthStr + "/" + yearStr);

            InputOutput.output("=================================");
            InputOutput.output("");
        }
        InputOutput.output("");
        InputOutput.input("Press ANY BUTTON to continue.");
        InputOutput.output("");
        showMenu();
    }


    public static void showOldest(Member[] teamMember){

        Member[] sorted = Sort.bubbleSort(teamMember,true);
        int age = 2018 - sorted[0].getYear();
        System.out.println("Oldest member is : "+ sorted[0].getName()+ " "+ sorted[0].getSurname() + age);
        System.out.println();
        showMenu();
    }

    public static void showYoungest(Member[] teamMember){

        Member[] sorted = Sort.bubbleSort(teamMember,false);
        int age = 2018 - sorted[0].getYear();
        System.out.println("Youngest member is : "+ sorted[0].getName()+ " "+ sorted[0].getSurname() + "age: " + age);
        System.out.println();
        showMenu();
    }
}
