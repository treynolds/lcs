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
public class lcsDictionary {

    public lcsDictionary(){
        dictionary=new ArrayList();
    }

    public void addEntry(lcsDictionaryEntry lce){
        dictionary.add(lce);
    }

    public lcsDictionaryEntry getEntryAt(int index){
        return (lcsDictionaryEntry)dictionary.get(index);
    }

    public void setDefinitonAt(String def, int a){
        ((lcsDictionaryEntry)dictionary.get(a)).setDefinition(def);
    }

    public void setMeaningAt(String mean, int a){
        ((lcsDictionaryEntry)dictionary.get(a)).setMeaning(mean);
    }
    public boolean contains(lcsDictionaryEntry entry){
        boolean contains=false;
        if(dictionary.contains(entry)){
            contains=true;
        }
        return contains;
    }

    public String getDefiniton(String meaning){
        String definition="";
        lcsDictionaryEntry b;
        for(int a=0;a<dictionary.size();a++){
            b=(lcsDictionaryEntry)dictionary.get(a);
            if(b.getMeaning().equals(meaning)){
                definition = b.getDefinition();
            }
        }
        return definition;
    }

    public boolean setDefinition(lcsDictionaryEntry entry){
        boolean defset=false;
        for(int a=0;a<dictionary.size();a++){
            if(dictionary.get(a).equals(entry)){
                ((lcsDictionaryEntry)dictionary.get(a))
                        .setDefinition(entry.getDefinition());
                defset=true;
            }
        }
        return defset;
    }

    public String getMeaning(String definition){
        String meaning="";
        lcsDictionaryEntry b;
        for(int a=0;a<dictionary.size();a++){
            b=(lcsDictionaryEntry)dictionary.get(a);
            if(b.getDefinition().equals(definition)){
                meaning=b.getMeaning();
            }
        }
        return meaning;
    }

    public boolean setMeaning(lcsDictionaryEntry entry){
        boolean meanset = false;
        for(int a=0;a<dictionary.size();a++){
            if(((lcsDictionaryEntry)dictionary.get(a)).getDefinition()
                    .equals(entry.getDefinition())){
                ((lcsDictionaryEntry)dictionary.get(a))
                        .setMeaning(entry.getMeaning());
                meanset=true;
            }
        }
        return meanset;
    }

    public lcsDictionaryEntry findFromDefinition(String definition){
        int low = 0;
        int high = dictionary.size()-1;
        int mid;

        while (low <= high){
            mid = (low + high)/2;
            if(definition.compareTo(((lcsDictionaryEntry)dictionary
                    .get(mid)).getDefinition())<0){
                high = mid - 1;
            }
            else if(definition.compareTo(((lcsDictionaryEntry)dictionary
                    .get(mid)).getDefinition()) > 0)
            {
                low = mid + 1;
            }
            else {
                return (lcsDictionaryEntry)dictionary.get(mid);
            }
        }
        return null;
    }

    public lcsDictionaryEntry findRootFromDefinition(String definition){
        lcsDictionaryEntry rde = new lcsDictionaryEntry();
        lcsDictionaryEntry rwd = new lcsDictionaryEntry();
        rde = findFromDefinition(definition);
        rwd = rde;
        //System.out.println(rde +" --> "+definition);
        int location = indexOf(rde);
        int lookBack = 0;
        int lookForward = 0;
        while(lookBack < 11 && !rwd.getRoot().equals("r")){
            rwd=getEntryAt(location - lookBack++);
        }
        if(!rwd.getRoot().equals("r")){
            while(lookForward < 11 && !rwd.getRoot().equals("r")){
                rwd=getEntryAt(location + lookForward++);
            }
        }
        if(rwd.getRoot().equals("r")){
            rde=rwd;
            return rde;
        } else {
            return null;
        }
    }

    public lcsDictionaryEntry find(lcsDictionaryEntry rde){
        int p = dictionary.indexOf(rde);
        if (p>0){
            return (lcsDictionaryEntry)dictionary.get(dictionary.indexOf(rde));
        } else {
            return null;
        }
    }

    public int indexOf(lcsDictionaryEntry rde){
        return dictionary.indexOf(rde);
    }

    public void clear(){
        dictionary.clear();
    }

    public int size(){
        return dictionary.size();
    }

    private ArrayList dictionary;
}
