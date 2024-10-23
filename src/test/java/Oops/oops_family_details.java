package Oops;

import java.util.ArrayList;
import java.util.List;

// Class representing a FamilyMember
    class FamilyMember {
        // Attributes (fields)
        private String name;
        private int age;
        private String relation;
        private String gender;

        // Constructor to initialize FamilyMember object
        public FamilyMember(String name, int age, String relation, String gender) {
            this.name = name;
            this.age = age;
            this.relation = relation;
            this.gender = gender;
        }

        // Getter methods (optional, for encapsulation)
        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getRelation() {
            return relation;
        }

        public String getGender() {
            return gender;
        }

        // Method to display family member's details
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age + " years");
            System.out.println("Relation: " + relation);
            System.out.println("Gender: " + gender);
            System.out.println();
        }
    }

    // Class representing a Family (aggregation of FamilyMember)
    class Family {
        private List<FamilyMember> members;

        // Constructor to initialize the family list
        public Family() {
            this.members = new ArrayList<>();
        }

        // Method to add a family member to the family
        public void addMember(FamilyMember member) {
            members.add(member);
        }

        // Method to display the details of all family members
        public void displayFamilyDetails() {
            System.out.println("Family Members:");
            for (FamilyMember member : members) {
                member.displayDetails();
            }
        }
    }

    // Main class to test the Family and FamilyMember classes
    public class oops_family_details {
        public static void main(String[] args) {
            // Creating individual family members
            FamilyMember father = new FamilyMember("John", 45, "Father", "Male");
            FamilyMember mother = new FamilyMember("Jane", 42, "Mother", "Female");
            FamilyMember daughter = new FamilyMember("Emily", 18, "Daughter", "Female");
            FamilyMember son = new FamilyMember("Michael", 15, "Son", "Male");

            // Creating a Family object
            Family myFamily = new Family();

            // Adding family members to the family
            myFamily.addMember(father);
            myFamily.addMember(mother);
            myFamily.addMember(daughter);
            myFamily.addMember(son);

            // Displaying details of all family members
            myFamily.displayFamilyDetails();
        }
    }

