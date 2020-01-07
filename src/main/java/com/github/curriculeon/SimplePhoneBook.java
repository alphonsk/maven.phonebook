package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 12/16/2019.
 */
public class SimplePhoneBook {
    ArrayList<String> simplePhoneBook = new ArrayList<>();
    // HashMap<String, String> phoneBook = new HashMap<>();
    LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

    public void add(String name, String phoneNumberToAdd) {
        phoneBook.put(name, phoneNumberToAdd);
    }

    public String get(String name) {
        return phoneBook.get(name);
    }

    public Boolean hasEntry(String phoneNumber) {
        return phoneBook.containsValue(phoneNumber);
    }

    public void remove(String name) {
        phoneBook.remove(name);
    }

    public String lookup(String name){
        String answer = null;
        if (phoneBook.containsValue(name)){
            answer = phoneBook.get(name);
        }
        return answer;
    }

    public List<String> getAllContactNames() {
        String ans[];
        ArrayList<String> arr = new ArrayList<>();
        for(String key: phoneBook.keySet()) {
            arr.add(key);
        }
        return arr;
    }

    public String reverseLookup(String phoneNumber) {
        String ans = null;
        for(String key: phoneBook.keySet()) {
            if(phoneBook.get(key).equals(phoneNumber)) {
                ans = (key);
            }
        }
        return ans;
    }
}
