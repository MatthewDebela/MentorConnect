package mentorconnect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * MentorshipPlatform.java
 *
 * Manages all mentors and mentees in the system.
 * Handles matching and filtering.
 *
 * @author Matthew Debela
 * @version 1.0
 */
public class MentorshipPlatform {

    private ArrayList<Mentor> mentors;
    private ArrayList<Mentee> mentees;

    public MentorshipPlatform() {
        mentors = new ArrayList<>();
        mentees = new ArrayList<>();
        preloadProfiles();
    }

    private void preloadProfiles() {

        // Mentors
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Programming"); s1.add("Data Science"); s1.add("Leadership"); s1.add("Project Management");
        mentors.add(new Mentor("Sarah Chen", "Technology", "BIPOC", s1, 8));

        ArrayList<String> s2 = new ArrayList<>();
        s2.add("Networking"); s2.add("Business"); s2.add("Finance"); s2.add("Public Speaking");
        mentors.add(new Mentor("James Williams", "Finance", "Veterans", s2, 12));

        ArrayList<String> s3 = new ArrayList<>();
        s3.add("Research"); s3.add("Writing"); s3.add("Healthcare"); s3.add("Leadership");
        mentors.add(new Mentor("Maria Lopez", "Healthcare", "LGBTQ+", s3, 6));

        ArrayList<String> s4 = new ArrayList<>();
        s4.add("Engineering"); s4.add("Programming"); s4.add("Design"); s4.add("Project Management");
        mentors.add(new Mentor("David Kim", "Engineering", "First-Generation", s4, 10));

        ArrayList<String> s5 = new ArrayList<>();
        s5.add("Teaching"); s5.add("Leadership"); s5.add("Writing"); s5.add("Public Speaking");
        mentors.add(new Mentor("Aisha Johnson", "Education", "Women in STEM", s5, 9));

        ArrayList<String> s6 = new ArrayList<>();
        s6.add("Entrepreneurship"); s6.add("Networking"); s6.add("Finance"); s6.add("Leadership");
        mentors.add(new Mentor("Marcus Thompson", "Business", "BIPOC", s6, 15));

        ArrayList<String> s7 = new ArrayList<>();
        s7.add("Data Science"); s7.add("Programming"); s7.add("Research"); s7.add("Machine Learning");
        mentors.add(new Mentor("Priya Patel", "Technology", "Women in STEM", s7, 7));

        ArrayList<String> s8 = new ArrayList<>();
        s8.add("Research"); s8.add("Writing"); s8.add("Public Speaking"); s8.add("Networking");
        mentors.add(new Mentor("Carlos Rivera", "Law", "First-Generation", s8, 11));

        ArrayList<String> s9 = new ArrayList<>();
        s9.add("Engineering"); s9.add("Data Science"); s9.add("Research"); s9.add("Project Management");
        mentors.add(new Mentor("Fatima Hassan", "Engineering", "BIPOC", s9, 8));

        ArrayList<String> s10 = new ArrayList<>();
        s10.add("Design"); s10.add("Writing"); s10.add("Leadership"); s10.add("Entrepreneurship");
        mentors.add(new Mentor("Rachel Nguyen", "Design", "LGBTQ+", s10, 5));

        ArrayList<String> s11 = new ArrayList<>();
        s11.add("Programming"); s11.add("Networking"); s11.add("Cybersecurity"); s11.add("Leadership");
        mentors.add(new Mentor("Darius Monroe", "Technology", "BIPOC", s11, 6));

        ArrayList<String> s12 = new ArrayList<>();
        s12.add("Healthcare"); s12.add("Research"); s12.add("Teaching"); s12.add("Writing");
        mentors.add(new Mentor("Elena Vasquez", "Healthcare", "Women in STEM", s12, 9));

        ArrayList<String> s13 = new ArrayList<>();
        s13.add("Finance"); s13.add("Business"); s13.add("Entrepreneurship"); s13.add("Networking");
        mentors.add(new Mentor("Kevin Okafor", "Finance", "First-Generation", s13, 7));

        ArrayList<String> s14 = new ArrayList<>();
        s14.add("Engineering"); s14.add("Programming"); s14.add("Data Science"); s14.add("Research");
        mentors.add(new Mentor("Leila Ahmadi", "Engineering", "LGBTQ+", s14, 10));

        ArrayList<String> s15 = new ArrayList<>();
        s15.add("Teaching"); s15.add("Leadership"); s15.add("Public Speaking"); s15.add("Writing");
        mentors.add(new Mentor("Trevor Bennett", "Education", "Veterans", s15, 14));

        ArrayList<String> s16 = new ArrayList<>();
        s16.add("Programming"); s16.add("Game Development"); s16.add("Design"); s16.add("Project Management");
        mentors.add(new Mentor("Yuki Tanaka", "Technology", "Asian/Pacific Islander", s16, 5));

        ArrayList<String> s17 = new ArrayList<>();
        s17.add("Research"); s17.add("Healthcare"); s17.add("Public Speaking"); s17.add("Writing");
        mentors.add(new Mentor("Amira Osei", "Public Health", "BIPOC", s17, 8));

        ArrayList<String> s18 = new ArrayList<>();
        s18.add("Finance"); s18.add("Networking"); s18.add("Entrepreneurship"); s18.add("Business");
        mentors.add(new Mentor("Brandon Lee", "Finance", "First-Generation", s18, 9));

        ArrayList<String> s19 = new ArrayList<>();
        s19.add("Counseling"); s19.add("Teaching"); s19.add("Writing"); s19.add("Leadership");
        mentors.add(new Mentor("Gabriela Santos", "Social Work", "Latina/Latino", s19, 7));

        ArrayList<String> s20 = new ArrayList<>();
        s20.add("Data Science"); s20.add("Machine Learning"); s20.add("Programming"); s20.add("Research");
        mentors.add(new Mentor("Tariq Hussain", "Artificial Intelligence", "Muslim/Arab", s20, 6));

        ArrayList<String> s21 = new ArrayList<>();
        s21.add("Writing"); s21.add("Public Speaking"); s21.add("Networking"); s21.add("Leadership");
        mentors.add(new Mentor("Monique Clark", "Journalism", "BIPOC", s21, 10));

        ArrayList<String> s22 = new ArrayList<>();
        s22.add("Design"); s22.add("Engineering"); s22.add("Project Management"); s22.add("Research");
        mentors.add(new Mentor("Ryan Nakamura", "Architecture", "Asian/Pacific Islander", s22, 11));

        ArrayList<String> s23 = new ArrayList<>();
        s23.add("Healthcare"); s23.add("Teaching"); s23.add("Leadership"); s23.add("Research");
        mentors.add(new Mentor("Destiny Williams", "Nursing", "BIPOC", s23, 8));

        ArrayList<String> s24 = new ArrayList<>();
        s24.add("Cybersecurity"); s24.add("Networking"); s24.add("Programming"); s24.add("Engineering");
        mentors.add(new Mentor("Omar Farooq", "Cybersecurity", "Veterans", s24, 9));

        ArrayList<String> s25 = new ArrayList<>();
        s25.add("Research"); s25.add("Writing"); s25.add("Teaching"); s25.add("Public Speaking");
        mentors.add(new Mentor("Sasha Petrov", "Environmental Science", "LGBTQ+", s25, 6));

        // Mentees
        ArrayList<String> i1 = new ArrayList<>();
        i1.add("Programming"); i1.add("Data Science"); i1.add("Leadership");
        mentees.add(new Mentee("Jordan Lee", "Technology", "BIPOC", i1));

        ArrayList<String> i2 = new ArrayList<>();
        i2.add("Research"); i2.add("Healthcare"); i2.add("Writing");
        mentees.add(new Mentee("Sofia Martinez", "Healthcare", "First-Generation", i2));

        ArrayList<String> i3 = new ArrayList<>();
        i3.add("Finance"); i3.add("Networking"); i3.add("Entrepreneurship");
        mentees.add(new Mentee("Tyler Brooks", "Business", "Veterans", i3));

        ArrayList<String> i4 = new ArrayList<>();
        i4.add("Engineering"); i4.add("Programming"); i4.add("Design");
        mentees.add(new Mentee("Amara Diallo", "Engineering", "Women in STEM", i4));

        ArrayList<String> i5 = new ArrayList<>();
        i5.add("Data Science"); i5.add("Programming"); i5.add("Research");
        mentees.add(new Mentee("Ethan Park", "Technology", "First-Generation", i5));

        ArrayList<String> i6 = new ArrayList<>();
        i6.add("Teaching"); i6.add("Writing"); i6.add("Public Speaking");
        mentees.add(new Mentee("Zoe Robinson", "Education", "LGBTQ+", i6));

        ArrayList<String> i7 = new ArrayList<>();
        i7.add("Research"); i7.add("Public Speaking"); i7.add("Networking");
        mentees.add(new Mentee("Isaiah Flores", "Law", "BIPOC", i7));

        ArrayList<String> i8 = new ArrayList<>();
        i8.add("Design"); i8.add("Leadership"); i8.add("Entrepreneurship");
        mentees.add(new Mentee("Maya Sinclair", "Design", "Women in STEM", i8));

        ArrayList<String> i9 = new ArrayList<>();
        i9.add("Programming"); i9.add("Leadership"); i9.add("Project Management");
        mentees.add(new Mentee("Nadia Osei", "Technology", "BIPOC", i9));

        ArrayList<String> i10 = new ArrayList<>();
        i10.add("Finance"); i10.add("Business"); i10.add("Networking");
        mentees.add(new Mentee("Lucas Ferreira", "Finance", "First-Generation", i10));

        ArrayList<String> i11 = new ArrayList<>();
        i11.add("Healthcare"); i11.add("Research"); i11.add("Leadership");
        mentees.add(new Mentee("Camille Dubois", "Healthcare", "LGBTQ+", i11));

        ArrayList<String> i12 = new ArrayList<>();
        i12.add("Engineering"); i12.add("Data Science"); i12.add("Project Management");
        mentees.add(new Mentee("Andre Washington", "Engineering", "Veterans", i12));

        ArrayList<String> i13 = new ArrayList<>();
        i13.add("Machine Learning"); i13.add("Data Science"); i13.add("Programming");
        mentees.add(new Mentee("Preethi Nair", "Artificial Intelligence", "Women in STEM", i13));

        ArrayList<String> i14 = new ArrayList<>();
        i14.add("Entrepreneurship"); i14.add("Leadership"); i14.add("Networking");
        mentees.add(new Mentee("DeShawn Harris", "Business", "BIPOC", i14));

        ArrayList<String> i15 = new ArrayList<>();
        i15.add("Counseling"); i15.add("Writing"); i15.add("Teaching");
        mentees.add(new Mentee("Catalina Reyes", "Social Work", "Latina/Latino", i15));

        ArrayList<String> i16 = new ArrayList<>();
        i16.add("Cybersecurity"); i16.add("Networking"); i16.add("Programming");
        mentees.add(new Mentee("Felix Wong", "Cybersecurity", "Asian/Pacific Islander", i16));

        ArrayList<String> i17 = new ArrayList<>();
        i17.add("Writing"); i17.add("Public Speaking"); i17.add("Leadership");
        mentees.add(new Mentee("Aaliyah Grant", "Journalism", "BIPOC", i17));

        ArrayList<String> i18 = new ArrayList<>();
        i18.add("Design"); i18.add("Engineering"); i18.add("Project Management");
        mentees.add(new Mentee("Marco Esposito", "Architecture", "First-Generation", i18));

        ArrayList<String> i19 = new ArrayList<>();
        i19.add("Research"); i19.add("Writing"); i19.add("Teaching");
        mentees.add(new Mentee("Hana Yamamoto", "Environmental Science", "Asian/Pacific Islander", i19));

        ArrayList<String> i20 = new ArrayList<>();
        i20.add("Healthcare"); i20.add("Leadership"); i20.add("Research");
        mentees.add(new Mentee("Quincy Thomas", "Nursing", "BIPOC", i20));
    }

    public ArrayList<Mentor> getMentors() {
        return mentors;
    }

    public ArrayList<Mentee> getMentees() {
        return mentees;
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void addMentee(Mentee mentee) {
        mentees.add(mentee);
    }

    public Mentor findMentorByName(String name) {
        for (Mentor m : mentors) {
            if (m.getName().equalsIgnoreCase(name)) return m;
        }
        return null;
    }

    public Mentee findMenteeByName(String name) {
        for (Mentee m : mentees) {
            if (m.getName().equalsIgnoreCase(name)) return m;
        }
        return null;
    }

    public boolean isNameTaken(String name) {
        return findMentorByName(name) != null || findMenteeByName(name) != null;
    }

    public int calculateMatchScore(Mentee mentee, Mentor mentor) {
        ArrayList<String> interests = mentee.getInterests();
        ArrayList<String> skills = mentor.getSkills();
        if (skills.isEmpty()) return 0;
        int shared = 0;
        for (String interest : interests) {
            if (skills.contains(interest)) shared++;
        }
        return (shared * 100) / skills.size();
    }

    public ArrayList<String> getSharedSkills(Mentee mentee, Mentor mentor) {
        ArrayList<String> shared = new ArrayList<>();
        for (String interest : mentee.getInterests()) {
            if (mentor.getSkills().contains(interest)) shared.add(interest);
        }
        return shared;
    }

    public void findMatchesForMentee(Mentee mentee) {
        ArrayList<Mentor> sorted = new ArrayList<>(mentors);
        Collections.sort(sorted, new Comparator<Mentor>() {
            public int compare(Mentor a, Mentor b) {
                return calculateMatchScore(mentee, b) - calculateMatchScore(mentee, a);
            }
        });
        System.out.println("\n--- Mentor Matches for " + mentee.getName() + " ---");
        for (int i = 0; i < sorted.size(); i++) {
            Mentor m = sorted.get(i);
            int score = calculateMatchScore(mentee, m);
            ArrayList<String> shared = getSharedSkills(mentee, m);
            System.out.printf("%d. %-20s | %3d%% match | Field: %s%n", (i + 1), m.getName(), score, m.getField());
            if (!shared.isEmpty()) System.out.println("   Shared: " + String.join(", ", shared));
        }
    }

    public void findMatchesForMentor(Mentor mentor) {
        ArrayList<Mentee> sorted = new ArrayList<>(mentees);
        Collections.sort(sorted, new Comparator<Mentee>() {
            public int compare(Mentee a, Mentee b) {
                return calculateMatchScore(b, mentor) - calculateMatchScore(a, mentor);
            }
        });
        System.out.println("\n--- Mentee Matches for " + mentor.getName() + " ---");
        for (int i = 0; i < sorted.size(); i++) {
            Mentee m = sorted.get(i);
            int score = calculateMatchScore(m, mentor);
            ArrayList<String> shared = getSharedSkills(m, mentor);
            System.out.printf("%d. %-20s | %3d%% match | Field: %s%n", (i + 1), m.getName(), score, m.getField());
            if (!shared.isEmpty()) System.out.println("   Shared: " + String.join(", ", shared));
        }
    }

    public void filterMentorsByCommunity(String community) {
        System.out.println("\n--- Mentors in Community: " + community + " ---");
        int count = 1; boolean found = false;
        for (Mentor m : mentors) {
            if (m.getCommunity().equalsIgnoreCase(community)) {
                System.out.println(count++ + ". " + m.getName() + " | " + m.getField());
                found = true;
            }
        }
        if (!found) System.out.println("No mentors found in this community.");
    }

    public void filterMenteesByCommunity(String community) {
        System.out.println("\n--- Mentees in Community: " + community + " ---");
        int count = 1; boolean found = false;
        for (Mentee m : mentees) {
            if (m.getCommunity().equalsIgnoreCase(community)) {
                System.out.println(count++ + ". " + m.getName() + " | " + m.getField());
                found = true;
            }
        }
        if (!found) System.out.println("No mentees found in this community.");
    }

    public void filterMentorsByField(String field) {
        System.out.println("\n--- Mentors in Field: " + field + " ---");
        int count = 1; boolean found = false;
        for (Mentor m : mentors) {
            if (m.getField().equalsIgnoreCase(field)) {
                System.out.println(count++ + ". " + m.getName() + " | " + m.getCommunity());
                found = true;
            }
        }
        if (!found) System.out.println("No mentors found in this field.");
    }

    public void filterMenteesByField(String field) {
        System.out.println("\n--- Mentees in Field: " + field + " ---");
        int count = 1; boolean found = false;
        for (Mentee m : mentees) {
            if (m.getField().equalsIgnoreCase(field)) {
                System.out.println(count++ + ". " + m.getName() + " | " + m.getCommunity());
                found = true;
            }
        }
        if (!found) System.out.println("No mentees found in this field.");
    }

    public void displayAllMentors() {
        System.out.println("\n--- All Mentors ---");
        for (int i = 0; i < mentors.size(); i++) {
            Mentor m = mentors.get(i);
            System.out.println((i + 1) + ". " + m.getName() + " | " + m.getField() + " | " + m.getCommunity());
        }
    }

    public void displayAllMentees() {
        System.out.println("\n--- All Mentees ---");
        for (int i = 0; i < mentees.size(); i++) {
            Mentee m = mentees.get(i);
            System.out.println((i + 1) + ". " + m.getName() + " | " + m.getField() + " | " + m.getCommunity());
        }
    }
}
