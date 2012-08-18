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
public class lcsPosRules extends HashMap {

    public lcsPosRules(){
        Vector rule = new Vector();
        rule.add(new Boolean(true));
        rule.add("");
        rule.add(0);
        rule.add(new Boolean(false));
        rule.add(new Boolean(true));
        put("Adjective", rule);
        put("Adverb",rule);
        put("Article",rule);
        put("Conjunction",rule);
        put("Interjection",rule);
        put("Noun",rule);
        put("Preposition",rule);
        put("Pronoun",rule);
        put("Verb",rule);
    }
}
