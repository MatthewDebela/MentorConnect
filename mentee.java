// mentee.java
// done by jadelyne

package mentorconnect;

import java.util.ArrayList;

public class Mentee extends User 
{
   private ArrayList<String> interests;
   private ArrayList<Mentor> connections;

   // new mentee object
   public Mentee(String name, String field, String community, ArrayList<String> interests)
   {
      super(name, field, community);
      this.interests = interests;
      this.connections = new ArrayList<Mentor>();
   }

   public ArrayList<String> getInterests() 
   {
      return interests;
   }

   public void setInterests(ArrayList<String> interests) 
   {
      this.interests = interests;
   }

   public ArrayList<Mentor> getConnections() 
   {
      return connections;
   }

   public void setConnections(ArrayList<Mentor> connections) 
   {
      this.connections = connections;
   }

   // edit interests
   public void addInterest(String interest) 
   {
      if (!interests.contains(interest)) 
      {
         interests.add(interest);
      }
   }

   public void removeInterest(String interest) 
   {
      interests.remove(interest);
   }

   // edit connections
   public void addConnection(Mentor mentor) 
   {
      if (!connections.contains(mentor)) 
      {
         connections.add(mentor);
      }
   }

   public void removeConnection(Mentor mentor) 
   {
      connections.remove(mentor);
   }

   // displays MENTEE profile
   @Override
   public void displayProfile() 
   {
      System.out.println("name: " + getName());
      System.out.println("role: mentee");
      System.out.println("field: " + getField());
      System.out.println("community: " + getCommunity());
      System.out.println("interested in: " + interests);
      System.out.println("amount of connections: " + connections.size());

      if (connections.size() > 0)
      {
         System.out.println("connected mentors:");
         for (Mentor mentor : connections) {
            System.out.println("- " + mentor.getName());
         }
      }
   }
}
