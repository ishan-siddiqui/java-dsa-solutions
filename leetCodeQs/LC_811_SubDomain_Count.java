package com.leetCodeQs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC_811_SubDomain_Count {
    public static void main(String[] args) {
    String[] domains = {"9001 discuss.leetcode.com"};
    List<String> result = subdomainVisits(domains);
    for (String value:result){
        System.out.println(value);
    }
    }


    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap <String,Integer> table = new HashMap<>();
        List<String> result = new ArrayList<String>();
        for (String domain: cpdomains) {
            String[] values = domain.split(" ");
            int count = Integer.parseInt(values[0]);
            String current = values[1];
            table.put(current, table.getOrDefault(current,0)+count);
            int start = current.indexOf(".");
            while (start>=0){
                String next = current.substring(start+1);
                table.put(next,table.getOrDefault(next,0)+count);
                current = next;
                start = current.indexOf(".");
            }
        }
        //Creating result list
        for(Map.Entry<String, Integer> item: table.entrySet()){
            String answer = item.getValue() + " " + item.getKey();
            result.add(answer);
        }
        return result;
    }
}
