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
public class lcsWritingSystem {

    public lcsWritingSystem(){
        glyphUseMap=new HashMap();
        letterMap=new HashMap();
        info=new HashMap();
        glyphUseMap.put("Glyph_1", "Lower");
        info.put("System", "Alphabet");
        info.put("GlyphsPerLetter", "1");
        info.put("CapRule", "None");
        info.put("Font", "Code2000");
        info.put("FontType", "Custom");
        info.put("NumbverOfLetters", "26");
        String[] letters = {"a","b","c","d","e","f","g","h","i","j",
                            "k","l","m","n","o","p","q","r","s","t",
                            "u","v","w","x","y","z"};
        for (int a = 0; a < letters.length; a++){
            letterMap.put(letters[a], letters[a]);
        }
    }

    public HashMap getGlyphUseMap(){
        return glyphUseMap;
    }

    public HashMap getInfo(){
        return info;
    }

    public HashMap getLetterMap(){
        return letterMap;
    }

    public void putGlyphUse(String key, String value){
        glyphUseMap.put(key, value);
    }

    public void setGlyphUseMap(HashMap gu){
        glyphUseMap.clear();
        glyphUseMap.putAll(gu);
    }

    public void putLetter(String key, String value){
        letterMap.put(key, value);
    }

    public void setLetterMap(HashMap lm){
        letterMap.clear();
        letterMap.putAll(lm);
    }

    public void putInfo(String key, String value){
        info.put(key, value);
    }

    public void setInfo(HashMap in){
        info.clear();
        info.putAll(in);
    }

    public boolean containsKey(String key){
        if(glyphUseMap.containsKey(key)
                || letterMap.containsKey(key)
                || info.containsKey(key)){
            return true;
        } else {
            return false;
        }
    }

    public boolean containsValue(String value){
        if(glyphUseMap.containsKey(value)
                || letterMap.containsKey(value)
                || info.containsKey(value)){
            return true;
        } else {
            return false;
        }
    }

    private HashMap glyphUseMap;
    private HashMap letterMap;
    private HashMap info;
}
