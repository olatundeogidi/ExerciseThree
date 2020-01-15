package Exercise.three;

import java.util.ArrayList;

/**
 * this class will keep the club member in a team
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
            if (count==numberOfPlayers) {
                break;
            }
            if (member.getAge()>=minAge && member.getAge()<=maxAge){
                if (gender.equals("Mixed")){
                    teamMembers.add(member);
                    count++;
                } else if (member.getGender().equals(gender)){
                    teamMembers.add(member);
                    count++;
                }
            }
        }
        if (teamMembers.size()<numberOfPlayers){
            throw new Exception("Team cannot be created due to insufficient team numbers");
        }
        return teamMembers;
    }
}
