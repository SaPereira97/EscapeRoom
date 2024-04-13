package io.codeforall.javatars;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Question {

    private Socket socket;
    private int point;
    public static int counter = 3;
    private String helpCounter = "\nRemaining: ";
    private String help = "\nThe answer start with letter ";
    private String noHelp = "\nYou don´t have anymore helps";
    private String success;


    public Question(Socket socket) throws IOException {
        this.socket = socket;
    }

    public String question1() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 1" + "\nWho is the creator of the One Ring?\n(6 characters)\n");

            String answer = prompt.getUserInput(question); // sauron

            if (answer.equals("sauron")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + (point) + " point\n" + "Now you go to question 2 " + "\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "s");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String question2() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 2" + "\nWhat is the name of the wizard who guides the Fellowship?\n(7 characters)\n");

            String answer = prompt.getUserInput(question); //gandalf

            if (answer.equals("gandalf")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to question 3" + "\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "g");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String question3() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 3" + "\nWhat is the name of Gandalf's horse?\n(9 characters)\n");

            String answer = prompt.getUserInput(question); //shadowfax

            if (answer.equals("shadowfax")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to question 4" + "\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "s");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String question4() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 4" + "\nWhat creature does Gandalf confront in the Mines of Moria?\n(6 characters)\n");

            String answer = prompt.getUserInput(question); //balrog

            if (answer.equals("balrog")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to question 5" + "\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "b");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }


    public String question5() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 5" + "\nWhat is the name of Aragorn's sword presented by Elrond?\n(7 characters)\n");

            String answer = prompt.getUserInput(question); // anduril

            if (answer.equals("anduril")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "a");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    ////////////////////////////////ENTERING GOLLUM ROOM///////////////////////////////

    public String riddle1() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nRiddle 1\nWhat has roots as nobody sees,\n" +
                    "Is taller than trees,\n" +
                    "Up, up it goes,\n" +
                    "And yet never grows?\n(8 characters)\n");

            String answer = prompt.getUserInput(question); // mountain

            if (answer.equals("mountain")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to riddle 2.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "m");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String riddle2() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nRiddle 2\nVoiceless it cries,\n" +
                    "Wingless flutters,\n" +
                    "Toothless bites,\n" +
                    "Mouthless mutters.\n(4 characters)\n");

            String answer = prompt.getUserInput(question); // wind

            if (answer.equals("wind")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to riddle 3.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "w");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String riddle3() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nRiddle 3\nIt cannot be seen, cannot be felt,\n" +
                    "Cannot be heard, cannot be smelt.\n" +
                    "It lies behind stars and under hills,\n" +
                    "And empty holes it fills.\n" +
                    "It comes out first and follows after,\n" +
                    "Ends life, kills laughter.\n(4 characters)\n");

            String answer = prompt.getUserInput(question); // dark

            if (answer.equals("dark")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to riddle 4.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "d");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String riddle4() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nRiddle 4\nAlive without breath,\n" +
                    "As cold as death;\n" +
                    "Never thirsty, ever drinking,\n" +
                    "All in mail never clinking.\n(4 characters)\n");

            String answer = prompt.getUserInput(question); // fish

            if (answer.equals("fish")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to riddle 5.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "f");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String riddle5() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nRiddle 5\nThis thing all things devours;\n" +
                    "Birds, beasts, trees, flowers;\n" +
                    "Gnaws iron, bites steel;\n" +
                    "Grinds hard stones to meal;\n" +
                    "Slays king, ruins town,\n" +
                    "And beats mountain down.\n(4 characters)\n");

            String answer = prompt.getUserInput(question); // time

            if (answer.equals("time")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "You are good! You manage to guess all the riddles.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "t");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    ////////////////////////////////ENTERING Silmarillion ROOM///////////////////////////////

    public String question6() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 6\nWho created the Silmarils?\n(6 characters)\n");

            String answer = prompt.getUserInput(question); // feanor

            if (answer.equals("feanor")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to question 7.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "f");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String question7() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 7\nWho was the original Dark Lord?\n(6 characters)\n");

            String answer = prompt.getUserInput(question); // melkor

            if (answer.equals("melkor")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to question 8.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "m");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String question8() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 8\nWho created the Two Trees of Valinor, Laurelin and Telperion?\n(7 characters)\n");

            String answer = prompt.getUserInput(question); // yavanna

            if (answer.equals("yavanna")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to question 9.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "y");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String question9() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nQuestion 9\nWhat is the name of the giant spider that accompanied Melkor?\n(9 characters)\n");

            String answer = prompt.getUserInput(question); // ungoliant

            if (answer.equals("ungoliant")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n" + "Now you go to the final question.\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "u");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }

    public String question10() throws IOException {
        while (true) {
            Prompt prompt = new Prompt(socket.getInputStream(), new PrintStream(socket.getOutputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            StringInputScanner question = new StringInputScanner();
            question.setMessage("\nFINAL QUESTION\nWhat is the name of the divine being who created the world of Arda?\n(2 words)\n");

            String answer = prompt.getUserInput(question); // eru iluvatar

            if (answer.equals("eru iluvatar")) {
                point++;
                success = "\nAmazing " + answer + " is right answer, you now have " + point + " points\n";
                out.println(success);
                break;
            } else if (answer.equals("h") && counter > 0) {
                counter--;
                out.println(help + "First word - 3 characters\nSecond word - 8 characters");
                out.println(helpCounter + counter);
            } else if (answer.equals("h") && counter == 0) {
                out.println(noHelp);
            } else {
                out.println("\nWrong answer");
            }
        }
        return success;
    }
}



