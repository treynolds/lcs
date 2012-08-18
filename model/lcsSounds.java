/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lcs.model;

import java.util.*;

/**
 *
 * @author Timothy
 */
public class lcsSounds {

    public lcsSounds(){
        //vowels.addAll(Arrays.asList(new char[]{'a','e','i','o','u'}));
        //consonants.addAll(Arrays.asList(new char[] {'b','c','d','f','g','h','j','k','l','m','n','p'
        //        ,'q','r','s','t','v','w','x','y','z'}));
        String vwls ="aeiou";
        String cons = "bcdfghjklmnpqrstvwxyz";
        for(int a=0;a<vwls.length();a++){
            vowels.add(vwls.charAt(a));
        }
        for(int a=0;a<cons.length();a++){
            consonants.add(cons.charAt(a));
        }
    }

    public void setVowels(char[] v){
        vowels.clear();
        vowels.addAll(Arrays.asList(v));
    }

    public void setConsonants(char[] c){
        consonants.clear();
        consonants.addAll(Arrays.asList(c));
    }

    public ArrayList getVowels(){
        return vowels;
    }

    public ArrayList getConsonants(){
        return consonants;
    }


    private ArrayList vowels = new ArrayList();
    private ArrayList consonants = new ArrayList();
}
