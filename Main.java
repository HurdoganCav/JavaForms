package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import javax.swing.JButton;

class WelcomeMessage {
    void printMessage() {
        System.out.println("This is my project.");
    }
}

class ExceptionHandler extends WelcomeMessage {
    void handleException() {
        try {
        } catch (Exception e) {
            System.out.println(""+ e.getMessage());
        }
    }
}
//1 inheritance 1 Exception 2 methods

public class Main {

    class AsterisksPrinter {
        static class NestedClass {
            void printAsterisks() {
                for (int i = 0; i < 50; i++) {
                    System.out.print("*");
                }
            }
        }
    }
    //Nested class and a method
    public static void printString(String s1, String s2) {
        System.out.println("Welcome to " + s1 + "" + s2);
    }

    public static void printString(String s1, int n) {
        System.out.println("You need to check "+n+" boxes for us to reccomend you a great "+ s1 +" game.");

    }

    public static void printString(String s1, String s2, String s3) {
        System.out.println("Its one more "+s3+" "+s1+" game reccomendation from our "+s2+"!");
    }

    public static void printString(String s1, String[] arr) {
        System.out.println("And hopeffuly it will be a great "+s1+" experience for you. ");
    }
//3 overloads 4 methods




    private static class Printer {
        public void printAsterisks(int num) {
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//One more method
    public static boolean createButtons() {

        AsterisksPrinter.NestedClass nested = new AsterisksPrinter.NestedClass();




        String s1 = "RTS";
        String s2 = "Reccomender";
        String s3 = "Great";
        int n = 3;

        printString(s1, s2);
        printString(s1, n);



        JLabel label = new JLabel("What art style do u want?");
        JLabel label2 = new JLabel("Which era do u want the to be in?");
        JLabel label3 = new JLabel("Maybe something more exotic?");

        JFrame frame = new JFrame("First Part");
        frame.setLayout(new BorderLayout());

        JButton button1 = new JButton("Realistic");
        JButton button2 = new JButton("Cartoony");

        JButton button3 = new JButton("Medieval");
        JButton button4 = new JButton("Modern");
        JButton button5 = new JButton("WW2");
        JButton button6 = new JButton("Civilizations like");

        JButton button7 = new JButton("Clasic");
        JButton button8 = new JButton("Original");

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 2));

        JPanel middlePanel = new JPanel();
        middlePanel.setLayout(new GridLayout(1, 4));

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 2));

        topPanel.add(label);
        middlePanel.add(label2);
        bottomPanel.add(label3);

        topPanel.add(button1);
        topPanel.add(button2);
        middlePanel.add(button3);
        middlePanel.add(button4);
        middlePanel.add(button5);
        middlePanel.add(button6);
        bottomPanel.add(button7);
        bottomPanel.add(button8);

        frame.add(middlePanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(topPanel, BorderLayout.NORTH);

        frame.setSize(1000, 150);
        frame.setVisible(true);

        final boolean[] button1Clicked = {false};
        final boolean[] button2Clicked = {false};
        final boolean[] button3Clicked = {false};
        final boolean[] button4Clicked = {false};
        final boolean[] button5Clicked = {false};
        final boolean[] button6Clicked = {false};
        final boolean[] button7Clicked = {false};
        final boolean[] button8Clicked = {false};

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1Clicked[0] = true;
                button1.setBackground(Color.GREEN);
                button2.setEnabled(false);
                System.out.println("You picked realistic.");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button2Clicked[0] = true;
                button2.setBackground(Color.GREEN);
                button1.setEnabled(false);
                System.out.println("You picked cartoony.");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button3Clicked[0] = true;
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button3.setBackground(Color.GREEN);
                System.out.println("You picked medieval.");
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button4Clicked[0] = true;
                button3.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
                button4.setBackground(Color.GREEN);
                System.out.println("You picked modern.");
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button5Clicked[0] = true;
                button3.setEnabled(false);
                button4.setEnabled(false);
                button6.setEnabled(false);
                button5.setBackground(Color.GREEN);
                System.out.println("You picked you picked ww2.");
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button6Clicked[0] = true;
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setBackground(Color.GREEN);
                System.out.println("You picked civilizations like.");
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button7Clicked[0] = true;
                button7.setBackground(Color.GREEN);
                button8.setEnabled(false);
                System.out.println("You picked classic.");

                if (button1Clicked[0] && (button3Clicked[0] && button7Clicked[0])) {
                    System.out.println("You should try Age of Empires II: Definitive Edition");
                    System.out.println("Age of Empires II: Definitive Edition features “The Last Khans” with 3 new campaigns and 4 new Civilizations. Frequent updates include events, additional content, new game modes, and enhanced features with the recent addition of Co-Op mode!");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button1Clicked[0] && (button4Clicked[0] && button7Clicked[0])) {
                    System.out.println("You should try WARNO");
                    System.out.println("Realistic, immersive, breathtaking. WARNO is the ultimate World War III battle simulator from the masters of strategy, Eugen Systems. A Cold War turns decisively hot as you command hundreds of units on a beautiful and brutal battlefield. Outsmart, outfight, and lead your forces to total victory.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button1Clicked[0] && (button5Clicked[0] && button7Clicked[0])) {
                    System.out.println("Steel Division 2");
                    System.out.println("Steel Division 2 is a historically-accurate WW2 real-time strategy game set on the Eastern Front. Features 1:1-scale turn-based army management and real-time tactical battles with thousands of men at your order.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button1Clicked[0] && (button6Clicked[0] && button7Clicked[0])) {
                    System.out.println("RISE OF NATIONS: RISE OF LEGENDS");
                    System.out.println("Rise of Nations: Rise of Legends is a real time strategy game that attempts to blend the worlds of fantasy magic and technology together into one. Despite the change in setting the game stays closely to the original Rise of Nations experience although does shed some of the deeper 4X and turn based elements which purists of the original may hold dear.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button2Clicked[0] && (button3Clicked[0] && button7Clicked[0])) {
                    System.out.println(("You should try Age of Empire IV"));
                    System.out.println("Celebrating its first year of delighting millions of global players, the award-winning and best-selling strategy franchise continues with Age of Empires IV: Anniversary Edition, putting you at the center of even more epic historical battles that shaped the world.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button2Clicked[0] && (button4Clicked[0] && button7Clicked[0])) {
                    System.out.println("You should try Command & Conquer™ Remastered Collection");
                    System.out.println("A loving tribute to a genre milestone. The Command and Conquer Remastered package does exactly what it needs to do for fans of the classic real-time strategy game, which is exactly what a classic of this stature deserves.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button2Clicked[0] && (button5Clicked[0] && button7Clicked[0])) {
                    System.out.println("Men of War: Assault Squad 2");
                    System.out.println("Men of War: Assault Squad 2 features new single player style skirmish modes that take players from extreme tank combat to deadly sniper stealth missions. Commanders can now faceoff against opponents on various new multiplayer 1v1 – 8v8 maps.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button2Clicked[0] && (button6Clicked[0] && button7Clicked[0])) {
                    System.out.println("Total War: MEDIEVAL II – Definitive Edition");
                    System.out.println("Spanning the most turbulent era in Western history, your quest for territory and power takes you through Europe, Africa, the Middle East, and even onto the shores of the New World.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                }
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button8Clicked[0] = true;
                button8.setBackground(Color.GREEN);
                button7.setEnabled(false);
                System.out.println("You picked original.");

                if ((button1Clicked[0] && (button3Clicked[0] && button8Clicked[0]))) {
                    System.out.println("You should try Ancestors legacy");
                    System.out.println("Ancestors Legacy is a squad-based real time strategy with a strong focus on tactics. Inspired by medieval European history, it brings to life four different nations and their conflicts, usually solved by war");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button1Clicked[0] && (button4Clicked[0] && button8Clicked[0])) {
                    System.out.println("You should try Call To Arms");
                    System.out.println("Call to Arms offers an innovative mix of real-time strategy and 3rd, as well as 1st person controls. Set in the time of modern warfare, the game offers realistically modeled vehicles and heavy weaponry. Command your troops to victory or fight by yourself in the 3rd or 1st person action mode.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button1Clicked[0] && (button5Clicked[0] && button8Clicked[0])) {
                    System.out.println("You Should try Gates Of Hell");
                    System.out.println("Gates of Hell is a realistic RTS/ RTT game that offers endless replay value. Command all types of troops in historical singleplayer, dynamic campaign, PvP and PvE battles. Are you ready for some serious immersion in World War 2?");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button1Clicked[0] && (button6Clicked[0] && button8Clicked[0])) {
                    System.out.println("You should try Empire Earth");
                    System.out.println(("Control the destiny of a fledgling civilization through as many as 500,000 years of human history. From meagre beginnings you must exploit the natural resources around you to build an empire capable of dominating the Earth. But your rise to supremacy will not go unchallenged. As was the case throughout history, rival civilizations are certain to oppose you every step of the way."));
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button2Clicked[0] && (button3Clicked[0] && button8Clicked[0])) {
                    System.out.println(("You should try Northgard"));
                    System.out.println("Northgard is a strategy game based on Norse mythology in which you control a clan of Vikings vying for the control of a mysterious newfound continent.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button2Clicked[0] && (button4Clicked[0] && button8Clicked[0])) {
                    System.out.println("You should try Iron Harvest");
                    System.out.println("A classic real-time strategy game with an epic single player campaign, multiplayer & coop, set in the alternate reality of 1920+");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button2Clicked[0] && (button5Clicked[0] && button8Clicked[0])) {
                    System.out.println("Company of heroes 3");
                    System.out.println("Bigger and better than ever, Company of Heroes 3 combines heart-pounding combat with deeper strategic choices in a stunning Mediterranean theatre of war. In Company of Heroes 3, every battle tells a story...what's yours?");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                } else if (button2Clicked[0] && (button6Clicked[0] && button8Clicked[0])) {
                    System.out.println("You should try Rise of Nations");
                    System.out.println("The game has taken several concepts from turn-based strategy games such as territories and attrition warfare.[2] Rise of Nations features 18 civilizations, playable through eight ages of world history.");
                    printString(s1, s2, s3);
                    nested.printAsterisks();
                }
//8 more methods
            }
        });

        return true;
    }

    public static void main(String[] args) throws IOException {
        ExceptionHandler handler = new ExceptionHandler();
        handler.handleException();
        handler.printMessage();


        Printer printer = new Printer();
        printer.printAsterisks(50);
        printer.printAsterisks(50);

        LoadingBar loadingBar = new ConsoleLoadingBar();
        loadingBar.start();
        System.out.println("\nApplication is ready!");

        createButtons();

        printer.printAsterisks(50);
        printer.printAsterisks(50);


    }
}