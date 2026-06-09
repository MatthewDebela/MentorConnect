// mentor.java
// done by jadelyne

package mentorconnect;

import java.util.ArrayList;

public class Mentor extends User 
{
   private ArrayList <String> skills;
   private int yearsOfExperience;

   // new mentor object
   public Mentor(String name, String field, String community, ArrayList<String> skills, int yearsOfExperience) 
   {
      super(name, field, community);
      this.skills = skills;
      this.yearsOfExperience = yearsOfExperience;
   }

   public ArrayList<String> getSkills() 
   {
      return skills;
   }

   public void setSkills(ArrayList<String> skills) 
   {
      this.skills = skills;
   }

   // editing experience
   public int getYearsOfExperience() {
      return yearsOfExperience;
   }

   public void setYearsOfExperience(int yearsOfExperience) 
   {
      this.yearsOfExperience = yearsOfExperience;
   }

   // editing skills
   public void addSkill(String skill) 
   {
      if (!skills.contains(skill)) 
      {
         skills.add(skill);
      }
   }

   public void removeSkill(String skill) 
   {
      skills.remove(skill);
   }

   // displays MENTOR profile
   @Override
   public void displayProfile() 
   {
      System.out.println("name: " + getName());
      System.out.println("role: mentor");
      System.out.println("field: " + getField());
      System.out.println("community: " + getCommunity());
      System.out.println("skills: " + skills);
      System.out.println("years of experience: " + yearsOfExperience);
   }
}
