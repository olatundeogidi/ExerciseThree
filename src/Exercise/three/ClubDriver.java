package Exercise.three;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ClubDriver {
    public static void main(String[] args) throws Exception {
        /**
         * This is to initiate the club class
         */
        Club club = new Club(generateDummyMembers());

        String res = "yes";
        Scanner in = new Scanner(System.in);
        while (res.equalsIgnoreCase("yes")) {
            System.out.println("Generating a football team\n");
            System.out.println("Enter number of players : ");
            int numberOfPlayers = in.nextInt();
            System.out.println("Enter Minimum Age : ");
            int minAge = in.nextInt();
            System.out.println("Enter Maximum Age : ");
            int maxAge = in.nextInt();
            System.out.println("Enter Gender [Male, Female or Mixed]: ");
            String gender = in.next();

            /**
             * The try and catch are Java keywords to run the function and throw exceptions if any
             */
            try {
                System.out.println("******************************************************");
                System.out.print("Generating a " + gender + " team of " + numberOfPlayers + " players (ages (" + minAge + "-" + maxAge + "))\n");
                System.out.println("******************************************************");
                //System.out.println("**********************************************");
                //System.out.print("Generating a male team of 11 players (Under17)\n");
                //System.out.println("**********************************************");
                ArrayList<Member> m1 = club.createTeam(minAge, maxAge, gender, numberOfPlayers);
                for (Member member : m1) {
                    System.out.println(member.getBasicInfo());
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("******************************************************");
            System.out.println("Do you want to continue ? [Yes or No]: ");
            res = in.next();

            //System.out.println("////////////////////////////////////////////");
        }
        System.out.println("Application Exiting");
    }
    /*
        try {
            System.out.println("**********************************************");
            System.out.print("Generating a male team of 11 players (Under24)\n");
            System.out.println("**********************************************");
            ArrayList<Member> m1 = club.createTeam(14, 24, "Male", 11);
            for (Member member : m1) {
                System.out.println(member.toString());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("////////////////////////////////////////////");

        try {
            System.out.println("************************************************************");
            System.out.print("Generating a female five-a-side team of 5 members (Under25)\n");
            System.out.println("************************************************************");
            ArrayList<Member> m1 = club.createTeam(14, 25, "Female", 5);
            for (Member member : m1){
                System.out.println(member.toString());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("////////////////////////////////////////////");
        
        try {
            System.out.println("***********************************************");
            System.out.print("Generating a mixed team of 11 members (Under30)\n");
            System.out.println("***********************************************");
            ArrayList<Member> m1 = club.createTeam(21, 30, "Mixed", 11);
            for (Member member : m1) {
                System.out.println(member.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("////////////////////////////////////////////");

    }
    */
    /**
     * The dummy data to be used for the club
     * @return list of members within the constrains set
     */
    public static ArrayList<Member> generateDummyMembers() {
        //Dummy Address
        ArrayList<Address> addr = new ArrayList<>();
        addr.add(new Address("47", "Bellgrove", "Tulsa", "Oklahoma", "74126", "United States"));
        addr.add(new Address("2", "Hallows", "Seattle", "Washington", "98195", "United States"));
        addr.add(new Address("271", "Crescent Oaks", "Tyler", "Texas", "75705", "United States"));
        addr.add(new Address("5671", "Comanche", "Jefferson City", "Missouri", "65105", "United States"));
        addr.add(new Address("941", "Corscot", "Rochester", "New York", "14646", "United States"));
        addr.add(new Address("8", "Rusk", "Portland", "Oregon", "97240", "United States"));
        addr.add(new Address("014", "Ohio", "Laredo", "Texas", "78044", "United States"));
        addr.add(new Address("3", "Florence", "Phoenix", "Arizona", "85005", "United States"));
        addr.add(new Address("31549", "Mitchell", "Chattanooga", "Tennessee", "37416", "United States"));
        addr.add(new Address("62", "Sycamore", "Fort Worth", "Texas", "76147", "United States"));

        ArrayList<Member> members = new ArrayList<>();
        Random rand = new Random();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
/*
        members.add(new Member("Minda", "Houston", "Female", LocalDate.parse("4/7/2003", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Alverta", "Tesh", "Female", LocalDate.parse("2/6/1991", formatter), addr.get(rand.nextInt(addr.size())), "Greece"));
        members.add(new Member("Alec", "Spondley", "Male", LocalDate.parse("19/4/1998", formatter), addr.get(rand.nextInt(addr.size())), "Cameroon"));
        members.add(new Member("Far", "Clymer", "Male", LocalDate.parse("28/4/1995", formatter), addr.get(rand.nextInt(addr.size())), "Yemen"));
        members.add(new Member("Diahann", "Kirman", "Female", LocalDate.parse("17/3/1995", formatter), addr.get(rand.nextInt(addr.size())), "Argentina"));
        members.add(new Member("Ludovico", "Pudsey", "Male", LocalDate.parse("24/4/1995", formatter), addr.get(rand.nextInt(addr.size())), "Nigeria"));
        members.add(new Member("Guenna", "Overton", "Female", LocalDate.parse("26/2/1992", formatter), addr.get(rand.nextInt(addr.size())), "Argentina"));
        members.add(new Member("Franz", "Burgh", "Male", LocalDate.parse("15/5/1998", formatter), addr.get(rand.nextInt(addr.size())), "Greece"));
        members.add(new Member("Salomon", "Battrick", "Male", LocalDate.parse("19/2/1992", formatter), addr.get(rand.nextInt(addr.size())), "Bolivia"));
        members.add(new Member("Dru", "Camus", "Male", LocalDate.parse("11/1/1993", formatter), addr.get(rand.nextInt(addr.size())), "Indonesia"));
        members.add(new Member("Tabb", "MacAlister", "Male", LocalDate.parse("26/6/1998", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Zachariah", "Wibrow", "Male", LocalDate.parse("8/12/1998", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Gui", "Stebbings", "Female", LocalDate.parse("14/5/1996", formatter), addr.get(rand.nextInt(addr.size())), "Peru"));
        members.add(new Member("Garrik", "Ede", "Male", LocalDate.parse("14/6/1999", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Massimiliano", "Slobom", "Male", LocalDate.parse("12/2/1992", formatter), addr.get(rand.nextInt(addr.size())), "Bahrain"));
        members.add(new Member("Milzie", "Luckham", "Female", LocalDate.parse("19/7/1997", formatter), addr.get(rand.nextInt(addr.size())), "Canada"));
        members.add(new Member("Pierce", "Neising", "Male", LocalDate.parse("27/5/1990", formatter), addr.get(rand.nextInt(addr.size())), "Brazil"));
        members.add(new Member("Misha", "Croxall", "Female", LocalDate.parse("12/1/1993", formatter), addr.get(rand.nextInt(addr.size())), "Dominican Republic"));
        members.add(new Member("Mohandis", "Pooley", "Male", LocalDate.parse("6/9/1994", formatter), addr.get(rand.nextInt(addr.size())), "Canada"));
        members.add(new Member("Fanni", "Stut", "Female", LocalDate.parse("28/8/1990", formatter), addr.get(rand.nextInt(addr.size())), "France"));
        members.add(new Member("Denver", "Lockey", "Male", LocalDate.parse("12/1/1995", formatter), addr.get(rand.nextInt(addr.size())), "Portugal"));
        members.add(new Member("Marius", "Olding", "Male", LocalDate.parse("4/9/1996", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Boone", "Waples", "Male", LocalDate.parse("11/4/1997", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Klaus", "Sijmons", "Male", LocalDate.parse("30/4/1991", formatter), addr.get(rand.nextInt(addr.size())), "Georgia"));
        members.add(new Member("Elie", "Connechie", "Female", LocalDate.parse("25/11/1990", formatter), addr.get(rand.nextInt(addr.size())), "Malaysia"));
        members.add(new Member("Norby", "Bothe", "Male", LocalDate.parse("25/11/1994", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Anne-marie", "McAloren", "Female", LocalDate.parse("6/12/1995", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Kaja", "MacCrann", "Female", LocalDate.parse("30/6/1998", formatter), addr.get(rand.nextInt(addr.size())), "Lebanon"));
        members.add(new Member("Orlan", "Feehely", "Male", LocalDate.parse("8/10/1995", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Thelma", "Ellins", "Female", LocalDate.parse("29/6/1994", formatter), addr.get(rand.nextInt(addr.size())), "Austria"));
        members.add(new Member("Petronille", "Krolle", "Female", LocalDate.parse("29/1/1990", formatter), addr.get(rand.nextInt(addr.size())), "Czech Republic"));
        members.add(new Member("Meryl", "Tittershill", "Female", LocalDate.parse("25/6/1993", formatter), addr.get(rand.nextInt(addr.size())), "Iran"));
        members.add(new Member("Ariel", "Keenan", "Female", LocalDate.parse("25/4/1999", formatter), addr.get(rand.nextInt(addr.size())), "Japan"));
        members.add(new Member("Shanna", "Blades", "Female", LocalDate.parse("22/3/1998", formatter), addr.get(rand.nextInt(addr.size())), "Brazil"));
        members.add(new Member("Marcellina", "Dickons", "Female", LocalDate.parse("22/7/1992", formatter), addr.get(rand.nextInt(addr.size())), "Mali"));
        members.add(new Member("Heriberto", "Hackford", "Male", LocalDate.parse("21/3/1991", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Amanda", "Cosham", "Female", LocalDate.parse("18/10/1999", formatter), addr.get(rand.nextInt(addr.size())), "Indonesia"));
        members.add(new Member("Hagan", "Tottem", "Male", LocalDate.parse("9/3/1995", formatter), addr.get(rand.nextInt(addr.size())), "Philippines"));
        members.add(new Member("Aliza", "Faull", "Female", LocalDate.parse("22/2/1993", formatter), addr.get(rand.nextInt(addr.size())), "Serbia"));
        members.add(new Member("Culver", "Philipet", "Male", LocalDate.parse("3/10/1992", formatter), addr.get(rand.nextInt(addr.size())), "Philippines"));
        members.add(new Member("Zena", "Pykerman", "Female", LocalDate.parse("22/4/1997", formatter), addr.get(rand.nextInt(addr.size())), "Namibia"));
        members.add(new Member("Vonny", "Gruszczak", "Female", LocalDate.parse("1/3/1990", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Link", "Anster", "Male", LocalDate.parse("26/3/1991", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Ginny", "Rapaport", "Female", LocalDate.parse("25/3/1996", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Aurelia", "Pargetter", "Female", LocalDate.parse("9/2/1992", formatter), addr.get(rand.nextInt(addr.size())), "Indonesia"));
        members.add(new Member("Jose", "Breslau", "Male", LocalDate.parse("12/11/1997", formatter), addr.get(rand.nextInt(addr.size())), "Brazil"));
        members.add(new Member("Hilton", "Goodin", "Male", LocalDate.parse("30/7/1996", formatter), addr.get(rand.nextInt(addr.size())), "France"));
        members.add(new Member("Cristen", "Dellow", "Female", LocalDate.parse("20/10/1994", formatter), addr.get(rand.nextInt(addr.size())), "Poland"));
        members.add(new Member("Zane", "Trevascus", "Male", LocalDate.parse("15/1/1990", formatter), addr.get(rand.nextInt(addr.size())), "Poland"));
        members.add(new Member("Horatio", "Epilet", "Male", LocalDate.parse("21/6/1995", formatter), addr.get(rand.nextInt(addr.size())), "Pakistan"));

 */
        members.add(new Coach("Ginny", "Rapaport", "Female", LocalDate.parse("8/25/1976", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Coach("Aurelia", "Pargetter", "Female", LocalDate.parse("2/9/1972", formatter), addr.get(rand.nextInt(addr.size())), "Indonesia"));
        members.add(new Coach("Jose", "Breslau", "Male", LocalDate.parse("11/12/1967", formatter), addr.get(rand.nextInt(addr.size())), "Brazil"));
        members.add(new Coach("Hilton", "Goodin", "Male", LocalDate.parse("7/30/1966", formatter), addr.get(rand.nextInt(addr.size())), "France"));
        members.add(new Coach("Cristen", "Dellow", "Female", LocalDate.parse("10/20/1974", formatter), addr.get(rand.nextInt(addr.size())), "Poland"));
        members.add(new Coach("Zane", "Trevascus", "Male", LocalDate.parse("1/15/1970", formatter), addr.get(rand.nextInt(addr.size())), "Poland"));
        members.add(new Coach("Horatio", "Epilet", "Male", LocalDate.parse("6/19/1975", formatter), addr.get(rand.nextInt(addr.size())), "Pakistan"));

        members.add(new Member("Minda", "Houten", "Female", LocalDate.parse("7/4/2003", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Alverta", "Tesh", "Female", LocalDate.parse("6/2/1991", formatter), addr.get(rand.nextInt(addr.size())), "Greece"));
        members.add(new Member("Alec", "Spondley", "Male", LocalDate.parse("4/19/1998", formatter), addr.get(rand.nextInt(addr.size())), "Cameroon"));
        members.add(new Member("Far", "Clymer", "Male", LocalDate.parse("4/28/1995", formatter), addr.get(rand.nextInt(addr.size())), "Yemen"));
        members.add(new Member("Diahann", "Kirman", "Female", LocalDate.parse("3/17/1995", formatter), addr.get(rand.nextInt(addr.size())), "Argentina"));
        members.add(new Member("Ludovico", "Pudsey", "Male", LocalDate.parse("4/24/1995", formatter), addr.get(rand.nextInt(addr.size())), "Nigeria"));
        members.add(new Member("Guenna", "Overton", "Female", LocalDate.parse("2/26/1992", formatter), addr.get(rand.nextInt(addr.size())), "Argentina"));
        members.add(new Member("Franz", "Burgh", "Male", LocalDate.parse("5/15/1998", formatter), addr.get(rand.nextInt(addr.size())), "Greece"));
        members.add(new Member("Salomon", "Battrick", "Male", LocalDate.parse("2/19/1992", formatter), addr.get(rand.nextInt(addr.size())), "Bolivia"));
        members.add(new Member("Dru", "Camus", "Male", LocalDate.parse("1/11/1993", formatter), addr.get(rand.nextInt(addr.size())), "Indonesia"));
        members.add(new Member("Tabb", "MacAlister", "Male", LocalDate.parse("6/26/1998", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Zachariah", "Wibrow", "Male", LocalDate.parse("12/8/1998", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Gui", "Stebbings", "Female", LocalDate.parse("5/14/1996", formatter), addr.get(rand.nextInt(addr.size())), "Peru"));
        members.add(new Member("Garrik", "Ede", "Male", LocalDate.parse("6/14/1999", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Massimiliano", "Slobom", "Male", LocalDate.parse("2/12/1992", formatter), addr.get(rand.nextInt(addr.size())), "Bahrain"));
        members.add(new Member("Milzie", "Luckham", "Female", LocalDate.parse("7/19/1997", formatter), addr.get(rand.nextInt(addr.size())), "Canada"));
        members.add(new Member("Pierce", "Neising", "Male", LocalDate.parse("5/27/1990", formatter), addr.get(rand.nextInt(addr.size())), "Brazil"));
        members.add(new Member("Misha", "Croxall", "Female", LocalDate.parse("1/12/1993", formatter), addr.get(rand.nextInt(addr.size())), "Dominican Republic"));
        members.add(new Member("Mohandis", "Pooley", "Male", LocalDate.parse("9/6/1994", formatter), addr.get(rand.nextInt(addr.size())), "Canada"));
        members.add(new Member("Fanni", "Stut", "Female", LocalDate.parse("8/28/1990", formatter), addr.get(rand.nextInt(addr.size())), "France"));
        members.add(new Member("Denver", "Lockey", "Male", LocalDate.parse("1/12/1995", formatter), addr.get(rand.nextInt(addr.size())), "Portugal"));
        members.add(new Member("Marius", "Olding", "Male", LocalDate.parse("9/4/1996", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Boone", "Waples", "Male", LocalDate.parse("4/11/1997", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Klaus", "Sijmons", "Male", LocalDate.parse("11/30/1991", formatter), addr.get(rand.nextInt(addr.size())), "Georgia"));
        members.add(new Member("Elie", "Connechie", "Female", LocalDate.parse("11/25/1990", formatter), addr.get(rand.nextInt(addr.size())), "Malaysia"));
        members.add(new Member("Norby", "Bothe", "Male", LocalDate.parse("11/25/1994", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Anne-marie", "McAloren", "Female", LocalDate.parse("12/6/1995", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Kaja", "MacCrann", "Female", LocalDate.parse("11/30/1998", formatter), addr.get(rand.nextInt(addr.size())), "Lebanon"));
        members.add(new Member("Orlan", "Feehely", "Male", LocalDate.parse("10/8/1995", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Thelma", "Ellins", "Female", LocalDate.parse("7/29/1994", formatter), addr.get(rand.nextInt(addr.size())), "Austria"));
        members.add(new Member("Petronille", "Krolle", "Female", LocalDate.parse("1/29/1990", formatter), addr.get(rand.nextInt(addr.size())), "Czech Republic"));
        members.add(new Member("Meryl", "Tittershill", "Female", LocalDate.parse("6/25/1993", formatter), addr.get(rand.nextInt(addr.size())), "Iran"));
        members.add(new Member("Ariel", "Keenan", "Female", LocalDate.parse("4/25/1999", formatter), addr.get(rand.nextInt(addr.size())), "Japan"));
        members.add(new Member("Shanna", "Blades", "Female", LocalDate.parse("3/22/1998", formatter), addr.get(rand.nextInt(addr.size())), "Brazil"));
        members.add(new Member("Marcellina", "Dickons", "Female", LocalDate.parse("7/22/1992", formatter), addr.get(rand.nextInt(addr.size())), "Mali"));
        members.add(new Member("Heriberto", "Hackford", "Male", LocalDate.parse("3/21/1991", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Amanda", "Cosham", "Female", LocalDate.parse("10/18/1999", formatter), addr.get(rand.nextInt(addr.size())), "Indonesia"));
        members.add(new Member("Hagan", "Tottem", "Male", LocalDate.parse("3/9/1995", formatter), addr.get(rand.nextInt(addr.size())), "Philippines"));
        members.add(new Member("Aliza", "Faull", "Female", LocalDate.parse("2/22/1993", formatter), addr.get(rand.nextInt(addr.size())), "Serbia"));
        members.add(new Member("Culver", "Philipet", "Male", LocalDate.parse("10/3/1992", formatter), addr.get(rand.nextInt(addr.size())), "Philippines"));
        members.add(new Member("Zena", "Pykerman", "Female", LocalDate.parse("4/22/1997", formatter), addr.get(rand.nextInt(addr.size())), "Namibia"));
        members.add(new Member("Vonny", "Gruszczak", "Female", LocalDate.parse("3/1/1990", formatter), addr.get(rand.nextInt(addr.size())), "Russia"));
        members.add(new Member("Link", "Anster", "Male", LocalDate.parse("3/26/1991", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Ginny", "Rapaport", "Female", LocalDate.parse("8/25/1996", formatter), addr.get(rand.nextInt(addr.size())), "China"));
        members.add(new Member("Aurelia", "Pargetter", "Female", LocalDate.parse("2/9/1992", formatter), addr.get(rand.nextInt(addr.size())), "Indonesia"));
        members.add(new Member("Jose", "Breslau", "Male", LocalDate.parse("11/12/1997", formatter), addr.get(rand.nextInt(addr.size())), "Brazil"));
        members.add(new Member("Hilton", "Goodin", "Male", LocalDate.parse("7/30/1996", formatter), addr.get(rand.nextInt(addr.size())), "France"));
        members.add(new Member("Cristen", "Dellow", "Female", LocalDate.parse("10/20/1994", formatter), addr.get(rand.nextInt(addr.size())), "Poland"));
        members.add(new Member("Zane", "Trevascus", "Male", LocalDate.parse("1/15/1990", formatter), addr.get(rand.nextInt(addr.size())), "Poland"));
        members.add(new Member("Horatio", "Epilet", "Male", LocalDate.parse("6/19/1995", formatter), addr.get(rand.nextInt(addr.size())), "Pakistan"));

        return members;
    }

}
