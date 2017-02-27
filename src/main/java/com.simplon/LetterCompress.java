package com.simplon;


import java.util.ArrayList;


public class LetterCompress {

    private class count{
        char caractere;
        int  compt=1;

        public count(char c){caractere=c;}
        public char getCaractere(){return caractere;}
        public void increment(){compt++;}
        @Override
        public String toString(){
            return new StringBuilder().append(caractere).append(String.valueOf(compt)).toString();}
    }

    private ArrayList<count> Letter = new ArrayList<count>();
    private String result="";
    private char currentc;
    boolean inc;

    String LetterComp(String chaine)
    {
        for (int i = 0; i < chaine.length(); i++) {
            currentc = chaine.charAt(i);
            inc=false;
            for (count c : Letter) {
                if (c.getCaractere() == currentc) {
                    c.increment();
                    inc = true;
                }
            }
            if(!inc) {
                Letter.add(new count(currentc));    // nouveaux caractere
            }
        }

        for (count c:Letter)
        {
            result += c.toString();
        }
        return result;
    }
}
