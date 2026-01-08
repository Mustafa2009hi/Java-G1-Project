import java.util.*;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the G1 Test Road Test!");
        System.out.println("To choose from the options , enter the corresponding number.");
        System.out.println("1. Write the G1 test");
        System.out.println("2. Login as Admin");
        int choice = sc.nextInt();
        String password = "VroomVroom"; // PASSWORD
        int mark = 0;
        int correctA = 0;  // CORRECT QUESTIONS IN PART A
        int correctB = 0;// CORRECT QUESTIONS IN PART B
        int wrong = 0;
        ArrayList<String> questionsA = new ArrayList<>();  // ArrayList for Part A
        ArrayList<String> answersA = new ArrayList<>();
        ArrayList<String> questionsB = new ArrayList<>(); //ArrayList for part B
        ArrayList<String> answersB = new ArrayList<>();

            questionsA.add("What is the speed limit in a school zone?\n" +
                    "a) 30 km/h\n" +
                    "b) 50 km/h\n" +
                    "c) 40 km/h\n" +
                    "d) 60 km/h\n");
            questionsA.add("At a four-way stop, who has the right of way?\n" +
                    "a) The car on the left\n" +
                    "b) The car on the right\n" +
                    "c) The car that signals first\n" +
                    "d) The fastest car");
            questionsA.add("When approaching a stop sign, you must:\n" +
                    "a) Slow down and go if clear\n" +
                    "b) Stop only if other cars are present\n" +
                    "c) Come to a complete stop before the line or crosswalk\n" +
                    "d) Stop halfway");
            questionsA.add("A flashing red traffic light means:\n" +
                    "a) Stop completely, then proceed when safe\n" +
                    "b) Slow down and proceed\n" +
                    "c) Yield to pedestrians only\n" +
                    "d) Go immediately");
            questionsA.add("When must you stop for a school bus?\n" +
                    "a) Only if the lights are flashing\n" +
                    "b) Always when red lights are flashing\n" +
                    "c) Never\n" +
                    "d) Only during school hours");
            questionsA.add("A triangular road sign usually indicates:\n" +
                    "a) Stop\n" +
                    "b) Warning\n" +
                    "c) Yield\n" +
                    "d) Speed limit");
            questionsA.add("When approaching a yield sign, you must:\n" +
                    "a) Stop only if other cars are coming\n" +
                    "b) Slow down and give the right of way to traffic\n" +
                    "c) Speed up to merge\n" +
                    "d) Ignore it if the road is clear");
            questionsA.add("A red octagon-shaped sign always means:\n" +
                    "a) Stop\n" +
                    "b) Yield\n" +
                    "c) Warning\n" +
                    "d) No parking");
            questionsA.add("A broken white line on the road means:\n" +
                    "a) You may change lanes if safe\n" +
                    "b) No passing\n" +
                    "c) Bus lane only\n" +
                    "d) Stop line");
            questionsA.add("If traffic lights are not working at an intersection, you should:\n" +
                    "a) Treat it as a four-way stop\n" +
                    "b) Wait for someone to direct you\n" +
                    "c) Continue normally\n" +
                    "d) Turn around");

            answersA.add("a");
            answersA.add("b");
            answersA.add("b");
            answersA.add("a");
            answersA.add("b");
            answersA.add("b");
            answersA.add("a");
            answersA.add("a");
            answersA.add("a");
            answersA.add("c");

            questionsB.add("When must you use your headlights?\n" +
                    "a) Only at night\n" +
                    "b) When visibility is poor\n" +
                    "c) Only in tunnels\n" +
                    "d) All the time");
            questionsB.add("What does a solid yellow line mean?\n" +
                    "a) No passing\n" +
                    "b) Passing allowed\n" +
                    "c) Bus lane\n" +
                    "d) Yield");
            questionsB.add("How far must you park from a fire hydrant?\n" +
                    "a) 1 meter\n" +
                    "b) 3 meters\n" +
                    "c) 5 meters\n" +
                    "d) 10 meters");
            questionsB.add("If you are involved in a minor collision with no injuries, you must:\n" +
                    "a) Leave the scene immediately\n" +
                    "b) Exchange information with the other driver and report to police if necessary\n" +
                    "c) Only report if the other driver asks\n" +
                    "d) Take photos but don’t notify anyone");
            questionsB.add("What is the purpose of a “No Stopping” sign?\n" +
                    "a) You may park but not leave the car\n" +
                    "b) You may stop only to drop off passengers\n" +
                    "c) You cannot stop at all\n" +
                    "d) You can stop for emergency only");
            questionsB.add("When entering a highway from an on-ramp, you should:\n" +
                    "a) Stop at the end and wait for a gap\n" +
                    "b) Accelerate to match the highway traffic speed\n" +
                    "c) Drive slowly and merge\n" +
                    "d) Use the shoulder to speed up");
            questionsB.add("What is the legal blood alcohol concentration (BAC) for a G1 driver?\n" +
                    "a) 0.05%\n" +
                    "b) 0.08%\n" +
                    "c) 0.00%\n" +
                    "d) 0.02%");
            questionsB.add("When must you signal a turn?\n" +
                    "a) At least 30 meters before turning\n" +
                    "b) Only if other cars are nearby\n" +
                    "c) Only if turning left\n" +
                    "d) Just as you begin turning");
            questionsB.add("What should you do if an emergency vehicle is approaching with flashing lights?\n" +
                    "a) Continue driving normally\n" +
                    "b) Pull over to the right and stop\n" +
                    "c) Speed up to get out of the way\n" +
                    "d) Stop in the middle of the lane");
            questionsB.add("How far should you follow another vehicle in ideal conditions?\n" +
                    "a) 1 car length\n" +
                    "b) 2 seconds behind\n" +
                    "c) 5 meters behind\n" +
                    "d) Touching the rear bumper");

            answersB.add("b");
            answersB.add("a");
            answersB.add("c");
            answersB.add("b");
            answersB.add("c");
            answersB.add("b");
            answersB.add("c");
            answersB.add("a");
            answersB.add("b");
            answersB.add("b");

        if(choice == 1) {   // TEST
            System.out.println("Enter the answer to each question. Make sure to answer in Lower Case. This is Section A of the test.");
            System.out.println();
            for (int j = 0; j < 6; j++) {
                if(wrong > 3){
                    break;
                }
                int i = (int) (Math.random() * questionsA.size());
                System.out.println(questionsA.get(i));
                String answer = sc.next();
                if (answer.equals(answersA.get(i))) {
                    System.out.println("The answer is correct!");
                    System.out.println();
                    correctA++;
                } else {
                    System.out.println("The answer is wrong");
                    wrong++;
                    System.out.println();
                }
                questionsA.remove(i);
                answersA.remove(i);
            }

            if(!(wrong > 3)) {
                System.out.println("Now we will start with part B of the test");
                System.out.println();
            }

            for (int x = 0; x < 6; x++) {
                if(wrong > 3){
                    break;
                }
                int b = (int) (Math.random() * questionsB.size()); //
                System.out.println(questionsB.get(b));
                String answer = sc.next();
                if (answer.equals(answersB.get(b))) {
                    System.out.println("The answer is correct!");
                    System.out.println();
                    correctB++;
                } else {
                    System.out.println("The answer is wrong");
                    wrong++;
                    System.out.println();
                }
                questionsB.remove(b);
                answersB.remove(b);
            }
            int finalscore = correctA + correctB;
            System.out.println("The final score is " + finalscore + " / 12 ");
            System.out.println("Section A score is " + correctA + " / 6 ");
            System.out.println("Section B score is " + correctB + " / 6 ");
            if((finalscore/12.0)*100 >= 75 && correctB >= 4 && correctA >=4){
                System.out.println(" You passed :) ");
            } else{
                System.out.println(" You failed :( ");
            }
        } else {
            System.out.println("Please enter the Password."); //Password is VroomVroom
            String pass = sc.next();
            if(pass.equals(password)){
                System.out.println("Choose from the 2 options below by typing the corresponding number");
                System.out.println("1. Add a question");
                System.out.println("2. Remove a question");
                int chosen = sc.nextInt();
                if(chosen == 1){
                    System.out.println("Within which section would you want to add the question, A or B");
                    String alph = sc.next();
                    sc.nextLine();
                    if(alph.equals("A")){
                        System.out.println("Please type your question");
                        String question = sc.nextLine();
                        System.out.println("An option must be written like this : a) Truck " + "\nPlease type option a");
                        String a = sc.nextLine();
                        System.out.println("Please type option b");
                        String b = sc.nextLine();
                        System.out.println("Please type option c");
                        String c = sc.nextLine();
                        System.out.println("Please type option d");
                        String d = sc.nextLine();
                        questionsA.add(question + "\n" + a + "\n" + b + "\n" + c + "\n" + d);
                        System.out.println("What is the answer to the question?");
                        String answer = sc.nextLine();
                        answersA.add(answer);
                        for(int f = 0; f < questionsA.size(); f++){
                            System.out.println(questionsA.get(f));
                        }
                        System.out.println("Added Successfully");

                    } else {
                        System.out.println("Please type your question");
                        String question = sc.nextLine();
                        System.out.println("An option must be written like this : a) Truck " + "\nPlease type option a");
                        String a = sc.nextLine();
                        System.out.println("Please type option b");
                        String b = sc.nextLine();
                        System.out.println("Please type option c");
                        String c = sc.nextLine();
                        System.out.println("Please type option d");
                        String d = sc.nextLine();
                        questionsB.add(question + "\n" + a + "\n" + b + "\n" + c + "\n" + d);
                        System.out.println("What is the answer to the question?");
                        String answer = sc.nextLine();
                        answersB.add(answer);
                        for(int e = 0; e < questionsB.size(); e++){
                            System.out.println(questionsB.get(e));
                        }
                        System.out.println("Added Successfully");
                    }

                } else{
                    System.out.println("Is the question that you want to remove from section A or B?");
                    String remove = sc.next();
                    sc.nextLine();
                    if(remove.equals("A")){
                        System.out.println("Which question number would you like to remove?");
                        System.out.println();
                        for(int c = 0; c < questionsA.size(); c++){
                            System.out.println(c+1 + questionsA.get(c));
                        }
                        int numremove = sc.nextInt();
                        sc.nextLine();
                        questionsA.remove(numremove - 1);
                        answersA.remove(numremove - 1);
                        for(int w = 0; w < questionsA.size(); w++) {
                            System.out.println(w+1 + questionsA.get(w));

                        } System.out.println("Removed Successfully");
                    } else {
                        System.out.println("Which question number would you like to remove?");
                        System.out.println();
                        for(int a = 0; a < questionsB.size(); a++) {
                                System.out.println(a+1 + questionsB.get(a));
                            }
                        int numremove = sc.nextInt();
                        sc.nextLine();
                        questionsB.remove(numremove - 1);
                        answersB.remove(numremove - 1);
                                for(int q = 0; q < questionsB.size(); q++) {
                                    System.out.println(q+1 + questionsB.get(q));
                                }
                        System.out.println("Removed Successfully");

                    }
                }

            }
        }

        }
            }











    
