import javax.swing.*;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Guest on 7/18/15.
 */
public class Hangman {


    JFrame frame;

    ArrayList<JLabel> characters = new ArrayList<JLabel>();
    Stack<String> words = new Stack<String>();
    JPanel pan;
    String currentWord = "test";

    public Hangman(){

        UISetup();
        addWords();
        currentWord = words.pop();
        pickWord();
    }

    public static void main(String [] args){

        Hangman hm = new Hangman();


    }

    public void addWords(){

        words.push("apple");
        words.push("orange");
        words.push("grape");
        words.push("testword");
        words.push("testpuzzle");

    }

    public void pickWord(){
        for(int i = 0; i < currentWord.length(); i++) {
            characters.set(i, currentWord.charAt(i) + "");
        }
    }

    public void UISetup(){
        frame = new JFrame();
        pan = new JPanel();
        for(int i = 0; i < currentWord.length(); i++) {
            //System.out.println("crash at i="+i);
            characters.add(new JLabel("_"));
            pan.add(characters.get(i));
        }
        frame.add(pan);
        frame.setVisible(true);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);







    }



}
