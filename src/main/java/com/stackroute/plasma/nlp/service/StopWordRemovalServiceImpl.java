package com.stackroute.plasma.nlp.service;

//import java.util.Arrays;
//import java.util.HashSet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StopWordRemovalServiceImpl {

    List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<String> readfile() {
//        try {
//            FileInputStream fileInputStream = new FileInputStream("/home/sunil/Desktop/nlp/src/main/java/com/stackroute/plasma/nlp/dict/stopwords.csv");
//            System.out.println("hello");
//            byte b[] = new byte[fileInputStream.available()];
//            fileInputStream.read();
//            //fileInputStream.close();
//            System.out.println("next hello");
//            String data[] = new String(b).trim().split("\n");
//            System.out.println("concat" + data[0]);
//            for (String s : data
//            ) {
//                System.out.println("thirdhello");
//                System.out.println(s);
//                list.add(s.trim());
//
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/sunil/Desktop/nlp/src/main/java/com/stackroute/plasma/nlp/dict/stopwords.csv"));
            String line = "";
             line = line + bufferedReader.readLine() + " " ;
            while (bufferedReader.readLine() != null){
                line = line + bufferedReader.readLine() + " " ;
            }
            String data[] = line.split(" ");
            for (String s : data
            ) {
                 // System.out.println("thirdhello");
                // System.out.println(s);
                list.add(s);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;

    }


//    private final static HashSet<String> stopwords = new HashSet<>();
//
//    public static HashSet<String> getStopwords() {
//        return stopwords;
//    }
//
//    static {
//        String s = "a\n"
//                + "about\n"
//                + "above\n"
//                + "after\n"
//                + "again\n"
//                + "against\n"
//                + "all\n"
//                + "am\n"
//                + "an\n"
//                + "and\n"
//                + "any\n"
//                + "are\n"
//                + "aren't\n"
//                + "as\n"
//                + "at\n"
//                + "be\n"
//                + "because\n"
//                + "been\n"
//                + "before\n"
//                + "being\n"
//                + "below\n"
//                + "between\n"
//                + "both\n"
//                + "but\n"
//                + "by\n"
//                + "can't\n"
//                + "cannot\n"
//                + "could\n"
//                + "couldn't\n"
//                + "did\n"
//                + "didn't\n"
//                + "do\n"
//                + "does\n"
//                + "doesn't\n"
//                + "doing\n"
//                + "don't\n"
//                + "down\n"
//                + "during\n"
//                + "each\n"
//                + "few\n"
//                + "for\n"
//                + "from\n"
//                + "further\n"
//                + "had\n"
//                + "hadn't\n"
//                + "has\n"
//                + "hasn't\n"
//                + "have\n"
//                + "haven't\n"
//                + "having\n"
//                + "he\n"
//                + "he'd\n"
//                + "he'll\n"
//                + "he's\n"
//                + "her\n"
//                + "here\n"
//                + "here's\n"
//                + "hers\n"
//                + "herself\n"
//                + "him\n"
//                + "himself\n"
//                + "his\n"
//                + "how\n"
//                + "how's\n"
//                + "i\n"
//                + "i'd\n"
//                + "i'll\n"
//                + "i'm\n"
//                + "i've\n"
//                + "if\n"
//                + "in\n"
//                + "into\n"
//                + "is\n"
//                + "isn't\n"
//                + "it\n"
//                + "it's\n"
//                + "its\n"
//                + "itself\n"
//                + "let's\n"
//                + "me\n"
//                + "more\n"
//                + "most\n"
//                + "mustn't\n"
//                + "my\n"
//                + "myself\n"
//                + "no\n"
//                + "nor\n"
//                + "not\n"
//                + "of\n"
//                + "off\n"
//                + "on\n"
//                + "once\n"
//                + "only\n"
//                + "or\n"
//                + "other\n"
//                + "ought\n"
//                + "our\n"
//                + "ours	ourselves\n"
//                + "out\n"
//                + "over\n"
//                + "own\n"
//                + "same\n"
//                + "shan't\n"
//                + "she\n"
//                + "she'd\n"
//                + "she'll\n"
//                + "she's\n"
//                + "should\n"
//                + "shouldn't\n"
//                + "so\n"
//                + "some\n"
//                + "such\n"
//                + "than\n"
//                + "that\n"
//                + "that's\n"
//                + "the\n"
//                + "their\n"
//                + "theirs\n"
//                + "them\n"
//                + "themselves\n"
//                + "then\n"
//                + "there\n"
//                + "there's\n"
//                + "these\n"
//                + "they\n"
//                + "they'd\n"
//                + "they'll\n"
//                + "they're\n"
//                + "they've\n"
//                + "this\n"
//                + "those\n"
//                + "through\n"
//                + "to\n"
//                + "too\n"
//                + "under\n"
//                + "until\n"
//                + "up\n"
//                + "very\n"
//                + "was\n"
//                + "wasn't\n"
//                + "we\n"
//                + "we'd\n"
//                + "we'll\n"
//                + "we're\n"
//                + "we've\n"
//                + "were\n"
//                + "weren't\n"
//                + "what\n"
//                + "what's\n"
//                + "when\n"
//                + "when's\n"
//                + "where\n"
//                + "where's\n"
//                + "which\n"
//                + "while\n"
//                + "who\n"
//                + "who's\n"
//                + "whom\n"
//                + "why\n"
//                + "why's\n"
//                + "with\n"
//                + "won't\n"
//                + "would\n"
//                + "wouldn't\n"
//                + "you\n"
//                + "you'd\n"
//                + "you'll\n"
//                + "you're\n"
//                + "you've\n"
//                + "your\n"
//                + "yours\n"
//                + "yourself\n"
//                + "yourselves\n'";
//        stopwords.addAll(Arrays.asList(s.split("\\\n")));
//        stopwords.add("");
   // }


}
