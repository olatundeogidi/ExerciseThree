package Exercise.three;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class will keep the club member in a team
 */
public class Club {
    ArrayList<Member> members;

    /**
     * New club object to be created
     * @param members members in the club team
     */
    public Club(ArrayList<Member> members) {
        this.members = members;
    }

    /**
     * This will create team based on age group
     * and gender
     * @param minAge is the minimum age if the team
     * @param maxAge the maximum age of the team
     * @param gender the gender of the team
     * @param numberOfPlayers total number of members in the team
     * @return the team name and members in the team
     * @throws Exception when team can not be created due to insufficient numbers of members
     */
    public ArrayList<Member> createTeam(int minAge, int maxAge, String gender, int numberOfPlayers) throws Exception{
        ArrayList<Member> teamMembers = new ArrayList<>();
        int count=0;
        for (Member member : members) {
            if(member instanceof Coach){
                continue;
            }
            if (count==numberOfPlayers) {
                break;
            }
            if (member.getAge()>=minAge && member.getAge()<=maxAge){
                if(member.getGender().equalsIgnoreCase(gender)){
                    teamMembers.add(member);
                    count++;
                } else if (gender.equals("Mixed")){
                    teamMembers.add(member);
                    count++;
                }
            }
        }
        if (teamMembers.size()<numberOfPlayers){
            throw new Exception("Team cannot be created due to insufficient team numbers");
        }
        //add random coach - no criteria set for coach
        ArrayList<Member>Allcoaches=new ArrayList<>();
            for (Member member : members) {
                if(member instanceof Coach) {
                    Allcoaches.add(member);
                }
            }
            Collections.shuffle(Allcoaches);
            teamMembers.add(Allcoaches.get(0));

        return teamMembers;
    }
}
