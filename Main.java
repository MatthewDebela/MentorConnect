package mentorconnect;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	   // Starts the program
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      MentorshipPlatform platform = new MentorshipPlatform();

	      startupMenu(platform, scnr);

	      scnr.close();
	   }

	   // Shows the first menu
	   public static void startupMenu(MentorshipPlatform platform, Scanner scnr) {
	      boolean running = true;

	      while (running) {
	         System.out.println("\nWelcome to MentorConnect!");
	         System.out.println("1. Register");
	         System.out.println("2. Exit");
	         System.out.print("Choice: ");

	         int choice = scnr.nextInt();
	         scnr.nextLine();

	         if (choice == 1) {
	            User user = registerUser(platform, scnr);

	            if (user != null) {
	               mainMenu(user, platform, scnr);
	            }
	         }
	         else if (choice == 2) {
	            running = false;
	            System.out.println("Goodbye!");
	         }
	         else {
	            System.out.println("Invalid choice.");
	         }
	      }
	   }

	   // Creates a mentor or mentee profile
	   public static User registerUser(MentorshipPlatform platform, Scanner scnr) {
	      System.out.println("\nAre you a:");
	      System.out.println("1. Mentor");
	      System.out.println("2. Mentee");
	      System.out.println("0. Back");
	      System.out.print("Choice: ");

	      int role = scnr.nextInt();
	      scnr.nextLine();

	      if (role == 0) {
	         return null;
	      }

	      System.out.print("Name: ");
	      String name = scnr.nextLine();

	      if (platform.isNameTaken(name)) {
	         System.out.println("Name already taken.");
	         return null;
	      }

	      System.out.print("Field: ");
	      String field = scnr.nextLine();

	      System.out.print("Community: ");
	      String community = scnr.nextLine();

	      ArrayList<String> list = new ArrayList<String>();

	      System.out.println("Enter 3 skills/interests:");
	      for (int i = 0; i < 3; i++) {
	         System.out.print((i + 1) + ": ");
	         list.add(scnr.nextLine());
	      }

	      if (role == 1) {
	         System.out.print("Years of experience: ");
	         int years = scnr.nextInt();
	         scnr.nextLine();

	         Mentor mentor = new Mentor(name, field, community, list, years);
	         platform.addMentor(mentor);

	         System.out.println("Mentor profile created.");
	         return mentor;
	      }
	      else if (role == 2) {
	         Mentee mentee = new Mentee(name, field, community, list);
	         platform.addMentee(mentee);

	         System.out.println("Mentee profile created.");
	         return mentee;
	      }
	      else {
	         System.out.println("Invalid choice.");
	         return null;
	      }
	   }

	   // Shows the menu after registration
	   public static void mainMenu(User user, MentorshipPlatform platform, Scanner scnr) {
	      boolean running = true;

	      while (running) {
	         System.out.println("\nMain Menu");
	         System.out.println("1. View Profile");
	         System.out.println("2. Edit Profile");
	         System.out.println("3. Find Matches");
	         System.out.println("4. Browse Users");
	         System.out.println("5. Connect with Mentor");
	         System.out.println("6. View Connections");
	         System.out.println("7. Disconnect");
	         System.out.println("8. Exit");
	         System.out.print("Choice: ");

	         int choice = scnr.nextInt();
	         scnr.nextLine();

	         if (choice == 1) {
	            user.displayProfile();
	         }
	         else if (choice == 2) {
	            editProfile(user, scnr);
	         }
	         else if (choice == 3) {
	            findMatches(user, platform);
	         }
	         else if (choice == 4) {
	            browseUsers(platform, scnr);
	         }
	         else if (choice == 5) {
	            connectWithMentor(user, platform, scnr);
	         }
	         else if (choice == 6) {
	            viewConnections(user);
	         }
	         else if (choice == 7) {
	            disconnect(user, scnr);
	         }
	         else if (choice == 8) {
	            running = false;
	         }
	         else {
	            System.out.println("Invalid choice.");
	         }
	      }
	   }

	   // Edits field, community, skills, or interests
	   public static void editProfile(User user, Scanner scnr) {
	      System.out.println("\nEdit Profile");
	      System.out.println("1. Change Field");
	      System.out.println("2. Change Community");
	      System.out.println("3. Add Skill/Interest");
	      System.out.println("4. Remove Skill/Interest");
	      System.out.print("Choice: ");

	      int choice = scnr.nextInt();
	      scnr.nextLine();

	      if (choice == 1) {
	         System.out.print("New field: ");
	         String field = scnr.nextLine();
	         user.setField(field);
	         System.out.println("Field updated.");
	      }
	      else if (choice == 2) {
	         System.out.print("New community: ");
	         String community = scnr.nextLine();
	         user.setCommunity(community);
	         System.out.println("Community updated.");
	      }
	      else if (choice == 3) {
	         System.out.print("Skill/interest to add: ");
	         String item = scnr.nextLine();

	         if (user instanceof Mentor) {
	            ((Mentor) user).addSkill(item);
	         }
	         else if (user instanceof Mentee) {
	            ((Mentee) user).addInterest(item);
	         }

	         System.out.println("Added.");
	      }
	      else if (choice == 4) {
	         System.out.print("Skill/interest to remove: ");
	         String item = scnr.nextLine();

	         if (user instanceof Mentor) {
	            ((Mentor) user).removeSkill(item);
	         }
	         else if (user instanceof Mentee) {
	            ((Mentee) user).removeInterest(item);
	         }

	         System.out.println("Removed.");
	      }
	      else {
	         System.out.println("Invalid choice.");
	      }
	   }

	   // Calls the matching methods from MentorshipPlatform
	   public static void findMatches(User user, MentorshipPlatform platform) {
	      if (user instanceof Mentee) {
	         platform.findMatchesForMentee((Mentee) user);
	      }
	      else if (user instanceof Mentor) {
	         platform.findMatchesForMentor((Mentor) user);
	      }
	   }

	   // Shows all mentors/mentees or filters them
	   public static void browseUsers(MentorshipPlatform platform, Scanner scnr) {
	      System.out.println("\nBrowse Users");
	      System.out.println("1. View All Mentors");
	      System.out.println("2. View All Mentees");
	      System.out.println("3. Filter Mentors by Field");
	      System.out.println("4. Filter Mentees by Field");
	      System.out.println("5. Filter Mentors by Community");
	      System.out.println("6. Filter Mentees by Community");
	      System.out.print("Choice: ");

	      int choice = scnr.nextInt();
	      scnr.nextLine();

	      if (choice == 1) {
	         platform.displayAllMentors();
	      }
	      else if (choice == 2) {
	         platform.displayAllMentees();
	      }
	      else if (choice == 3) {
	         System.out.print("Field: ");
	         String field = scnr.nextLine();
	         platform.filterMentorsByField(field);
	      }
	      else if (choice == 4) {
	         System.out.print("Field: ");
	         String field = scnr.nextLine();
	         platform.filterMenteesByField(field);
	      }
	      else if (choice == 5) {
	         System.out.print("Community: ");
	         String community = scnr.nextLine();
	         platform.filterMentorsByCommunity(community);
	      }
	      else if (choice == 6) {
	         System.out.print("Community: ");
	         String community = scnr.nextLine();
	         platform.filterMenteesByCommunity(community);
	      }
	      else {
	         System.out.println("Invalid choice.");
	      }
	   }

	   // Lets a mentee connect with a mentor
	   public static void connectWithMentor(User user, MentorshipPlatform platform, Scanner scnr) {
	      if (!(user instanceof Mentee)) {
	         System.out.println("Only mentees can connect with mentors.");
	         return;
	      }

	      platform.displayAllMentors();

	      System.out.print("Enter mentor name: ");
	      String name = scnr.nextLine();

	      Mentor mentor = platform.findMentorByName(name);

	      if (mentor == null) {
	         System.out.println("Mentor not found.");
	      }
	      else {
	         ((Mentee) user).addConnection(mentor);
	         System.out.println("Connected with " + mentor.getName() + ".");
	      }
	   }

	   // Shows a mentee's current mentor connections
	   public static void viewConnections(User user) {
	      if (!(user instanceof Mentee)) {
	         System.out.println("Only mentees have connections.");
	         return;
	      }

	      Mentee mentee = (Mentee) user;
	      ArrayList<Mentor> connections = mentee.getConnections();

	      if (connections.size() == 0) {
	         System.out.println("No connections yet.");
	      }
	      else {
	         System.out.println("\nConnections:");

	         for (int i = 0; i < connections.size(); i++) {
	            Mentor mentor = connections.get(i);
	            System.out.println((i + 1) + ". " + mentor.getName());
	         }
	      }
	   }

	   // Removes a mentor from a mentee's connections
	   public static void disconnect(User user, Scanner scnr) {
	      if (!(user instanceof Mentee)) {
	         System.out.println("Only mentees have connections.");
	         return;
	      }

	      Mentee mentee = (Mentee) user;
	      ArrayList<Mentor> connections = mentee.getConnections();

	      if (connections.size() == 0) {
	         System.out.println("No connections to remove.");
	         return;
	      }

	      viewConnections(user);

	      System.out.print("Enter number to remove: ");
	      int choice = scnr.nextInt();
	      scnr.nextLine();

	      if (choice >= 1 && choice <= connections.size()) {
	         Mentor mentor = connections.get(choice - 1);
	         mentee.removeConnection(mentor);
	         System.out.println("Disconnected from " + mentor.getName() + ".");
	      }
	      else {
	         System.out.println("Invalid choice.");
	      }
	   }
}
