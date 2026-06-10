# MentorConnect

A Java console application that connects mentors and mentees from underrepresented communities based on shared skills and interests.

---

## Project Overview

MentorConnect is built around a social equity theme — helping students from underrepresented communities find mentors in their field. Users register as a Mentor or Mentee, select their field, community, and skills, and instantly see ranked matches based on shared interests.

---

## Object Model Hierarchy

```
[Abstract Base Class: User]
          /              \
  [Subclass: Mentor]   [Subclass: Mentee]     ← Polymorphic Behavior
          \              /
   [Class: MentorshipPlatform]                ← Handles ArrayList<Mentor> and ArrayList<Mentee>
          |
   [Class: Main]                              ← Console UI and driver
```

- **User** — abstract base class with private fields (name, field, community) and abstract displayProfile()
- **Mentor** — extends User, adds skills and yearsOfExperience, overrides displayProfile()
- **Mentee** — extends User, adds interests and connections, overrides displayProfile()
- **MentorshipPlatform** — manages all users, runs matching algorithm, handles filtering and connections
- **Main** — entry point, handles all console menus, registration, and navigation

---

## OOP Concepts Demonstrated

| Concept | Implementation |
|---------|---------------|
| **Encapsulation** | All fields are private across every class, accessed only through public getters and setters |
| **Inheritance** | Mentor and Mentee both extend the abstract User class |
| **Polymorphism** | displayProfile() is defined in User and overridden differently in Mentor and Mentee |
| **Abstraction** | User is abstract — only Mentor and Mentee can be instantiated |
| **ArrayList of Objects** | ArrayList<Mentor>, ArrayList<Mentee>, ArrayList<String> used throughout every class |

---

## Quantitative Calculation

**Match Score Algorithm** — located in `MentorshipPlatform.calculateMatchScore()`

```
Score = (shared skills / total mentor skills) x 100
```

Counts how many of a mentee's interests appear in a mentor's skill list, divides by the total number of mentor skills, and multiplies by 100 to produce a percentage. Results are sorted highest to lowest so the best matches appear first.

**Example:**
- Mentee interests: Programming, Leadership, Design
- Mentor skills: Programming, Data Science, Leadership, Research
- Shared: Programming, Leadership (2 of 4)
- Score: (2 / 4) x 100 = **50% match**

---

## Features

- Register as a Mentor or Mentee
- Select field, community, and skills/interests
- Find ranked mentor matches with compatibility scores and shared skills displayed
- Browse all mentors or mentees
- Filter by field or community
- View full profiles
- Connect with mentors
- Edit your profile at any time

---

## Preloaded Data

The platform launches with **25 mentors** and **20 mentees** spanning **19 fields** and **14 communities** including BIPOC, Women in STEM, LGBTQ+, First-Generation, Veterans, Latina/Latino, Asian/Pacific Islander, Muslim/Arab, and more.

---

## How to Run

**Compile:**
```
javac -d out src/mentorconnect/*.java
```

**Run:**
```
java -cp out mentorconnect.Main
```

---

## Project Structure

```
src/
  mentorconnect/
    User.java                ← Abstract base class
    Mentor.java              ← Mentor subclass
    Mentee.java              ← Mentee subclass
    MentorshipPlatform.java  ← Platform logic and matching algorithm
    Main.java                ← Console UI and entry point
README.md
```

---

## Team Contributions

| Member | File | Contribution |
|--------|------|-------------|
| **Navy ** | User.java | Designed and implemented the abstract User base class including all private fields, getters, setters, and the abstract displayProfile() method |
| **Jadelyne** | Mentor.java, Mentee.java | Built the Mentor and Mentee subclasses with skills, interests, connections, add/remove methods, and polymorphic displayProfile() implementations |
| **Matthew ** | MentorshipPlatform.java | Wrote the platform engine including the matching algorithm, match score calculation, filtering by field and community, connection management, and all 25 mentor and 20 mentee preloaded profiles |
| **Abenezer** | Main.java | Built the full console UI including registration flow, dashboard navigation, find matches, browse and filter, edit profile, view connections, and all input handling with go-back support |

---

## Course Information

**Course:** CS 143 — Java II  
**Institution:** Everett Community College  
**Term:** Spring 2026
