package lcs.model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ted
 */
public class lcsSyllableStructure {
    
    public lcsSyllableStructure(){
        structure = new StringBuffer("CV");
    }

    public lcsSyllableStructure(String s){
        structure = new StringBuffer(s);
    }
    
    public char charAt(int a){
        return structure.charAt(a);
    }
    
    public int indexOf(char c){
        return structure.toString().indexOf(c);
    }

    public int indexOf(String c){
        return structure.indexOf(c);
    }

    public int indexOf(char c, int start){
        return structure.toString().indexOf(c, start);
    }

    public int indexOf(String c, int start){
        return structure.indexOf(c, start);
    }
    
    public int length(){
        return structure.length();
    }
    
    public String substring(int s, int e){
        return structure.substring(s,e);
    }

    public String toString(){
        return structure.toString();
    }

    private StringBuffer structure;
}
