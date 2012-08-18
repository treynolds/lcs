/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lcs.model;

import java.util.*;
import javax.swing.*;
/**
 *
 * @author Timothy
 */
public class lcsDictionaryEntry {

    public lcsDictionaryEntry(){
        definition = "";
        meaning = "";
        pos = "";
    }
    public lcsDictionaryEntry(String[] stuff){
        pos = stuff[0];
        definition = stuff[1];
        root = stuff[2];
        meaning = "";
        //syllableCount = Integer.parseInt(stuff[3]);
    }

    public void setDefinition(String def){
        definition = def;
    }

    public void setMeaning(String mean){
        meaning = mean;
    }

    public void setPos(String p){
        pos = p;
    }

    public void setRoot(String rt){
        root = rt;
    }

    public void setSyllableCount(int c){
        syllableCount = c;
    }

    public void setSyllableCount(String syllables){
        syllableCount = Integer.parseInt(syllables);
    }

    public String getMeaning(){
        return meaning;
    }

    public String getDefinition(){
        return definition;
    }

    public String getPos(){
        return pos;
    }

    public String getRoot(){
        return root;
    }

    public int getSyllableCount(){
        return syllableCount;
    }

    public void setSyllableBreak(int syllableBreak){
        syllableBreaks.addElement(syllableBreak);
    }

    public void insertSyllableBreak(int position){
        syllableBreaks.insertElementAt(position, 0);
    }

    public int getLastSyllableBreak(){
        return ((Integer)syllableBreaks.elementAt(syllableBreaks.size()-1)).intValue();
    }

    public int getFirstSyllableBreak(){
        return ((Integer)syllableBreaks.elementAt(1)).intValue();
    }

    public boolean equals(lcsDictionaryEntry lde){
        if(this.meaning.equals(lde.getMeaning())){
            return true;
        } else {
            return false;
        }
    }

    public String generateMeaning(lcsSyllableStructure syllable, ArrayList vowels,
            ArrayList consonants, String pos, HashMap rules, String original, int maxSylls){        
        String word="";
        syllableBreaks.clear();
        Vector rule = (Vector)rules.get(pos);
        int numberOfSyllables=(int)(Math.random()*maxSylls)+1;
        for(int ns = 0; ns < numberOfSyllables; ns++){
            setSyllableBreak(word.length());
            for(int a = 0; a < syllable.length(); a++){
                if(syllable.charAt(a) == 'C'){
                    int b=(int)(Math.random()*consonants.size());
                    word += consonants.get(b);
                }
                if(syllable.charAt(a) == 'V'){
                    int b=(int)(Math.random()*vowels.size());
                    word += vowels.get(b);
                }
                if(syllable.charAt(a) == '['){
                    if(syllable.indexOf(']',a) >= 0){
                        int z = syllable.indexOf(']',a);
                        String[] choosables= syllable.substring(a + 1, z).split(",");
                        int b = (int)(Math.random()*choosables.length);
                        word += choosables[b];
                        a = z;
                    } else {
                        JOptionPane.showMessageDialog(null, "Illegal Syllable Structure\n expected ]", "Oops!",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    a = syllable.indexOf(']',a);
                }
                if(syllable.charAt(a) == '{'){
                    if(syllable.indexOf('}',a) > 0){
                        char let=syllable.charAt(a + 1);
                        if(word.charAt(word.length()-1) == let){
                            int z = syllable.indexOf('}',a);
                            String[] choosables = syllable.substring(syllable.indexOf(":", a + 1) + 1, z).split(",");
                            int x = (int)(Math.random()*choosables.length);
                            word += choosables[x];
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Illegal Syllable Structure\n expected }", "Oops!",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    a= syllable.indexOf('}',a);
                }
                char z =syllable.charAt(a);
                if(Character.isLowerCase(z) || isPunct(z))
                    word += syllable.charAt(a);
            }
        }
        if(((Boolean)rule.elementAt(0)).booleanValue()){
            int exception = (int)(Math.random()*100);
            if (exception > ((Integer)rule.elementAt(2)).intValue()){
                System.out.println(syllableBreaks.size());
                if(((Boolean)rule.elementAt(3)).booleanValue()){
                    if(((Boolean)rule.elementAt(4)).booleanValue()){
                        insertSyllableBreak(rule.elementAt(1).toString().length());
                        word = rule.elementAt(1) + word;
                    } else {
                        if (syllableBreaks.size()<=1){
                            insertSyllableBreak(word.length());
                            word = rule.elementAt(1) + word;
                        } else {
                            word = (String)rule.elementAt(1) + word.substring(getFirstSyllableBreak());
                        }
                    }
                } else {
                    if(((Boolean)rule.elementAt(4)).booleanValue()){
                        setSyllableBreak(word.length());
                        word = word + rule.elementAt(1);
                    } else {
                        if (syllableBreaks.size()<=1){
                            setSyllableBreak(word.length());
                            word = word + rule.elementAt(1);
                        } else {
                            word = word.substring(0,getLastSyllableBreak()) + (String)rule.elementAt(1);
                        }
                    }
                }
            } else {
                System.out.println("Exception Found: " + exception);
            }
        }
        return word;
    }

    public boolean isPunct(char z){
        return ((z >= '!') && (z <= '/')) || ((z >= ':') && (z <= '?'));
    }

    public String toString(){
        return definition + ": " + meaning + ", " + pos + ", " +root;
    }

    public String applyPosRule(lcsDictionaryEntry rde, HashMap rules){
        String word =rde.getMeaning();
        String partOfSpeech = rde.getPos();
        Vector rule = (Vector)rules.get(partOfSpeech);
        if(((Boolean)rule.elementAt(0)).booleanValue()){
            int exception = (int)(Math.random()*100);
            if (exception >= ((Integer)rule.elementAt(2)).intValue()){
                if(((Boolean)rule.elementAt(3)).booleanValue()){
                    if(((Boolean)rule.elementAt(4)).booleanValue()){
                        word = rule.elementAt(1) + word;
                    } else {
                        if (syllableBreaks.size()<2){
                            word = rule.elementAt(1) + word;
                        } else {
                            word = (String)rule.elementAt(1) + word.substring(getFirstSyllableBreak());
                        }
                    }
                } else {
                    if(((Boolean)rule.elementAt(4)).booleanValue()){
                        word = word + rule.elementAt(1);
                    } else {
                        if (syllableBreaks.size()<2){
                            word = word + rule.elementAt(1);
                        } else {
                            word = word.substring(0,getLastSyllableBreak()) + (String)rule.elementAt(1);
                        }
                    }
                }
            } else {
                System.out.println("Exception Found: " + exception);
            }
        }
        return word;
    }

    private String definition;
    private String meaning;
    private String pos;
    private String root;
    private int syllableCount;
    private Vector syllableBreaks = new Vector();
}
