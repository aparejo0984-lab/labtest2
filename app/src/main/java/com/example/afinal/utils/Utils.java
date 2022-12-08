package com.example.afinal.utils;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static String getOverAllStatus(int correctAnswer) {
        switch (correctAnswer) {
            case 3:
                return "Good job!";
            case 4:
                return "Excellent work!";
            case 5:
                return "You are a genius!";
            default:
                return "Please try again!";
        }
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("2 x 2","4");
        questions.put("13 - 3","10");
        questions.put("3 + 3","6");
        questions.put("4 / 4","1");
        questions.put("5 x 5","25");
        questions.put("6 - 6","0");
        questions.put("7 + 7","14");
        questions.put("8 - 4","4");
        questions.put("9 / 3","3");
        questions.put("10 + 10","20");

        return questions;
    }

    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }


    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("San Francisco",true);
        answer1.put("Chicago",false);
        answer1.put("New York ",false);
        answer1.put("Boston",false);
        questions.put("In which American city is the Golden Gate Bridge located?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Asia",false);
        answer2.put("Antartica",false);
        answer2.put("Africa",true);
        answer2.put("Australia",false);
        questions.put("What is the hottest continent on Earth?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Peru",false);
        answer3.put("Cuba",false);
        answer3.put("China",false);
        answer3.put("Japan",true);
        questions.put("Which country is called the Land of Rising Sun?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Hindu Raj",false);
        answer4.put("Andes",false);
        answer4.put("Pares",false);
        answer4.put("Himalayas",true);
        questions.put("Mount Everest lies in which mountain range?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Amazon",true);
        answer5.put("Yavari",false);
        answer5.put("Mantra",false);
        answer5.put("Ucayali",false);
        questions.put("Which river rises in Peru, has no bridge crossing it and enters the sea in Brazil?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("Fleet",false);
        answer6.put("Thames",true);
        answer6.put("Peck",false);
        answer6.put("Effra",false);
        questions.put("Which large river flows through London?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Russia",true);
        answer7.put("India",false);
        answer7.put("South America",false);
        answer7.put("China",false);
        questions.put("What is the name of the largest country in the world?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Toronto",false);
        answer8.put("Vancouver",false);
        answer8.put("Ottawa",true);
        answer8.put("Quebec",false);
        questions.put("What is the capital of Canada?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Atlantic Ocean",true);
        answer9.put("South China Sea",false);
        answer9.put("Indian Ocean",false);
        answer9.put("Pacific Ocean",true);
        questions.put("What is the name of the largest ocean in the world?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("The Vatican City",true);
        answer10.put("Cuba",false);
        answer10.put("Palau",false);
        answer10.put("Hawii",false);
        questions.put("What is the name of the smallest country in the world?",answer10);

        return questions;
    }

    public static Map<String,Map<String,Boolean>> getRandomGeographyQuestions(int SIZE){
        Map<String,Map<String,Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;

        originalQuestion = getGeographyQuestions();

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }
}
