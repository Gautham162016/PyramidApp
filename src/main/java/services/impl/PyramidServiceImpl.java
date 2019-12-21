package services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import services.PyramidService;
@Service
public class PyramidServiceImpl implements PyramidService{

	
	public boolean isPyramid(String inputKey) {
		// TODO Auto-generated method stub
		
		// remove white spaces
        inputKey = inputKey.replaceAll("\\s","");

        // handle empty string case.
        if(inputKey.length()==0)
            return false;

        // convert everything to lower case
        inputKey  = inputKey.toLowerCase();
        
        // construct a map.
        Map<Character,Integer> wordMap = new HashMap<>();
        char[] wordCharArray = inputKey.toCharArray();
        for(char ch:wordCharArray){
            if(wordMap.containsKey(ch)){
                wordMap.put(ch, wordMap.get(ch)+1);
            }else{
                wordMap.put(ch,1);
            }
        }

        // sort the list of values.
        ArrayList<Integer> valueList = new ArrayList<>(wordMap.values());
        Collections.sort(valueList);
     
 	// it should start with one.
        if(valueList.get(0)!=1)
            return false;


        // check for gaps.
        for (int i=0;i<valueList.size()-1;i++){
            if(valueList.get(i)==valueList.get(i+1)){
                return false;
            }
            if( Math.abs(valueList.get(i)-valueList.get(i+1))>1)
                return false;
        }
        return true;

	}

}
