package com.mycompany.lab8;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/**
 *
 * @author yassine
 */
public class Lab8 {
    
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // Check if either array is null
        if (array1 == null || array2 == null) {
            return array1 == array2;
        }
        
        // Check if arrays have different lengths
        if (array1.length != array2.length) {
            return false;
        }
        
        // Compare each element
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == null) {
                if (array2[i] != null) {
                    return false;
                }
            } else {
                if (!array1[i].equals(array2[i])) {
                    return false;
                }
            }
        }
        
        return true;
    }
    
    public static <T extends Number> void sumOfEvenAndOdd(List<T> numbers) {
        // Initialize sums as double to handle all numeric types
        double evenSum ;
        double oddSum ;
        
        for (T number : numbers) {
            T double = number;
            
            // Check if the number is even or odd
            if ((double)value%2== 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
            
    public static <T> int firstOccurrence(List<T> ElementList, T target) {
        if (ElementList == null) {
         return -1;
        }
        
        for (int i = 0; i < ElementList.size(); i++) {
            if (target == null ? ElementList.get(i) == null : target.equals(ElementList.get(i))) {
                return i; 
            }
        }
        return -1;
    }
    
    public static <T> List<T> reverseList(List<T> originalList) {
        if (originalList == null) {
            return null;
        }
        
        List<T> reversedList = new ArrayList<>(originalList);
        
        // Reverse the new list
        Collections.reverse(reversedList);
        
        return reversedList;
    }
    
    public static <T> List<T> alternateMerge(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }            
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }
        return mergedList;
    }
    
    public static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        if (list == null || predicate == null) {
            return null;
        }
        
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
    
    public static <K, V> void printMap(Map<K, V> map) {
        if (map == null) {
            System.out.println("Map is null");
            return;
        }
        
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    
    public static <T> Set<T> unionSets(Set<T> set1, Set<T> set2) {
        if (set1 == null || set2 == null) {
            return null;
        }
        
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
    
    public static <T> Set<T> intersectionSets(Set<T> set1, Set<T> set2) {
        if (set1 == null || set2 == null) {
            return null;
        }
        
        Set<T> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
    
    public static <T> HashMap<T, Integer> frequencyCount(List<T> list) {
        if (list == null) {
            return null;
        }
        
        HashMap<T, Integer> frequencyMap = new HashMap<>();
        for (T element : list) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return frequencyMap;
    }
    
    public static <K, V> List<K> findKeysByValue(HashMap<K, V> map, V value) {
        if (map == null) {
            return null;
        }
        
        List<K> keysList = new ArrayList<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value == null ? entry.getValue() == null : value.equals(entry.getValue())) {
                keysList.add(entry.getKey());
            }
        }
        return keysList;
    }
    
    public static <T extends Comparable<T>> T findMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }
        return max;
    }
    
    public static <T extends Comparable<T>> List<T> sortList(List<T> list) {
        if (list == null) {
            return null;
        }
        
        List<T> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);
        return sortedList;
    }
    
    public static <T extends Comparable<T>> List<T> compareAndFindGreater(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null) {
            return null;
        }
        
        List<T> result = new ArrayList<>();
        int minSize = Math.min(list1.size(), list2.size());
        
        for (int i = 0; i < minSize; i++) {
            if (list1.get(i).compareTo(list2.get(i)) > 0) {
                result.add(list1.get(i));
            }
        }
        
        return result;
    }
    
    public static <T> List<T> removeDuplicates(List<T> list) {
        if (list == null) {
            return null;
        }
        
        Set<T> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
    
    public static <T> List<T> shuffleList(List<T> list) {
        if (list == null) {
            return null;
        }
        
        List<T> shuffledList = new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        return shuffledList;
    }
    
    public static <T> List<T> rotateList(List<T> list, int distance) {
        if (list == null) {
            return null;
        }
        
        List<T> rotatedList = new ArrayList<>(list);
        Collections.rotate(rotatedList, distance);
        return rotatedList;
    }
    
    public static <T> boolean copyList(List<T> source, List<T> dest) {
        if (source == null || dest == null) {
            return false;
        }
        
        if (dest.size() < source.size()) {
            return false;
        }
        
        Collections.copy(dest, source);
        return true;
    }
    
    public static <T extends Comparable<T>> Map<String, T> findMinAndMax(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        
        Map<String, T> result = new HashMap<>();
        result.put("Min", Collections.min(list));
        result.put("Max", Collections.max(list));
        return result;
    }
    
    public static <T> void fillList(List<T> list, T value) {
        if (list == null) {
            return;
        }
        
        Collections.fill(list, value);
    }
    
    public static void main(String[] args) {
        //exo 01
        // Example with String arrays
        System.out.println("\n--- Exercise 1 ---");
        String[] arr1 = {"a", "b", "c"};
        String[] arr2 = {"a", "b", "c"};
        boolean result = compareArrays(arr1, arr2);  
        System.out.println("String arrays equal: " + result);

        // Example with Integer arrays
        Integer[] nums1 = {1, 2, 4};
        Integer[] nums2 = {1, 2, 3};
        boolean result2 = compareArrays(nums1, nums2); 
        System.out.println("Integer arrays equal: " + result2);
        //exo2
//         System.out.println("\n--- Exercise 2 ---");
//        List<Integer> integers = List.of(1, 2, 3, 4, 5);
//        List<Double> doubles = List.of(1.5, 2.0, 3.7, 4.2, 5.0);
//        
//        System.out.println("Integer results:");
//        sumOfEvenAndOdd(integers);
//        
//        System.out.println("\nDouble results:");
//        sumOfEvenAndOdd(doubles);
        //exo3
//        // Test with different types
//        System.out.println("\n--- Exercise 3 ---");
//        List<String> strings = List.of("apple", "banana", "cherry", "banana");
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 3);
//        
//        System.out.println(firstOccurrence(strings, "banana"));
//        System.out.println(firstOccurrence(strings, "orange")); 
//        System.out.println(firstOccurrence(numbers, 3)); 
//        System.out.println(firstOccurrence(numbers, 6)); 
//        System.out.println(firstOccurrence(null, "test")); 
//        
        //exo4 
//        System.out.println("\n--- Exercise 4 ---");
//         // Test with different types of lists
//        System.out.println("Original String List: " + strings);
//        System.out.println("Reversed String List: " + reverseList(strings));
//        
//        System.out.println("\nOriginal Number List: " + numbers);
//        System.out.println("Reversed Number List: " + reverseList(numbers));
//        
//        System.out.println("\nOriginal Double List: " + doubles);
//        System.out.println("Reversed Double List: " + reverseList(doubles));
//        
//        // Test with null list
//        System.out.println("\nNull List Test: " + reverseList(null));
        //exo 5
//        System.out.println("\n--- Exercise 5 ---");
//        List<String> strings1 = List.of("A", "B", "C");
//        List<String> strings2 = List.of("X", "Y", "Z", "W");
//        System.out.println("Merged Strings: " + alternateMerge(strings1, strings2));
//        
//        // Test with Integer lists
//        List<Integer> numbers1 = List.of(1, 3, 5);
//        List<Integer> numbers2 = List.of(2, 4);
//        System.out.println("Merged Numbers: " + alternateMerge(numbers1, numbers2));
//        
        //exo 6
//        System.out.println("\n--- Exercise 6: Filter by Predicate ---");
//        // Filter even numbers
//        List<Integer> evenNumbers = filterByPredicate(numbers, n -> n % 2 == 0);
//        System.out.println("Even numbers: " + evenNumbers);
//        
//        // Filter strings with length > 5
//        List<String> longStrings = filterByPredicate(strings, s -> s.length() > 2);
//        System.out.println("Strings longer than 5 characters: " + longStrings);
//        
        //exo 7
//        System.out.println("\n--- Exercise 7: Print Map ---");
//        Map<String, Integer> fruitCounts = new HashMap<>();
//        fruitCounts.put("Apple", 10);
//        fruitCounts.put("Banana", 20);
//        fruitCounts.put("Cherry", 15);
//        printMap(fruitCounts);
//        
        //exo 8
//        System.out.println("\n--- Exercise 8: Union of Sets ---");
//        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4));
//        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6));
//        Set<Integer> unionSet = unionSets(set1, set2);
//        System.out.println("Union of sets: " + unionSet);
//        
        //exo 9
//        System.out.println("\n--- Exercise 9: Intersection of Sets ---");
//        Set<Integer> intersectionSet = intersectionSets(set1, set2);
//        System.out.println("Intersection of sets: " + intersectionSet);
//        
        //exo 10
//        System.out.println("\n--- Exercise 10: Frequency Count ---");
//        List<String> fruits = List.of("apple", "banana", "apple", "cherry", "banana", "apple");
//        HashMap<String, Integer> fruitFrequency = frequencyCount(fruits);
//        System.out.println("Frequency count: " + fruitFrequency);
//        
        //exo 11
//        System.out.println("\n--- Exercise 11: Find Keys by Value ---");
//        HashMap<String, Integer> scores = new HashMap<>();
//        scores.put("Alice", 85);
//        scores.put("Bob", 90);
//        scores.put("Charlie", 85);
//        scores.put("David", 95);
//        List<String> studentsWithScore85 = findKeysByValue(scores, 85);
//        System.out.println("Students with score 85: " + studentsWithScore85);
//        
        //exo 12
//        System.out.println("\n--- Exercise 12: Find Maximum ---");
//        List<Integer> numbersList = List.of(10, 5, 23, 9, 46, 3);
//        Integer maxNumber = findMax(numbersList);
//        System.out.println("Maximum number: " + maxNumber);
//        
//        List<String> wordsList = List.of("apple", "zebra", "banana", "cat");
//        String maxWord = findMax(wordsList);
//        System.out.println("Maximum word: " + maxWord);
//        
        //exo 13
//        System.out.println("\n--- Exercise 13: Sort List ---");
//        List<Integer> unsortedNumbers = new ArrayList<>(List.of(5, 2, 9, 1, 7, 3));
//        List<Integer> sortedNumbers = sortList(unsortedNumbers);
//        System.out.println("Sorted numbers: " + sortedNumbers);
//        
//        List<String> unsortedWords = new ArrayList<>(List.of("zebra", "apple", "cat", "banana"));
//        List<String> sortedWords = sortList(unsortedWords);
//        System.out.println("Sorted words: " + sortedWords);
//        
        //exo 14
//        System.out.println("\n--- Exercise 14: Compare Lists and Find Greater Elements ---");
//        List<Integer> list1 = List.of(10, 5, 8, 2, 15);
//        List<Integer> list2 = List.of(8, 9, 5, 3, 10);
//        List<Integer> greaterInList1 = compareAndFindGreater(list1, list2);
//        System.out.println("Elements greater in first list: " + greaterInList1);
//        
        //exo 15
//        System.out.println("\n--- Exercise 15: Remove Duplicates ---");
//        List<Integer> duplicatesList = List.of(1, 2, 3, 2, 4, 1, 5, 3);
//        List<Integer> uniqueList = removeDuplicates(duplicatesList);
//        System.out.println("Original list with duplicates: " + duplicatesList);
//        System.out.println("List after removing duplicates: " + uniqueList);
//        
        //exo 16
//        System.out.println("\n--- Exercise 16: Shuffle List ---");
//        List<Integer> orderedList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        System.out.println("Original ordered list: " + orderedList);
//        List<Integer> shuffledList = shuffleList(orderedList);
//        System.out.println("Shuffled list: " + shuffledList);
//        
        //exo 17
//        System.out.println("\n--- Exercise 17: Rotate List ---");
//        List<String> fruitsList = new ArrayList<>(List.of("apple", "banana", "cherry", "date", "elderberry"));
//        System.out.println("Original fruit list: " + fruitsList);
//        List<String> rotatedFruits = rotateList(fruitsList, 2);
//        System.out.println("Rotated fruit list (distance 2): " + rotatedFruits);
//        
        //exo 18
//        System.out.println("\n--- Exercise 18: Copy List ---");
//        List<Integer> sourceList = List.of(1, 2, 3, 4);
//        List<Integer> destList = new ArrayList<>(List.of(0, 0, 0, 0, 0, 0));
//        System.out.println("Source list: " + sourceList);
//        System.out.println("Destination list before copy: " + destList);
//        boolean copySuccess = copyList(sourceList, destList);
//        System.out.println("Copy successful: " + copySuccess);
//        System.out.println("Destination list after copy: " + destList);
//        
        //exo 19
//        System.out.println("\n--- Exercise 19: Find Min and Max ---");
//        List<Integer> numList = List.of(38, 15, 92, 7, 23, 41, 56);
//        Map<String, Integer> minMaxResult = findMinAndMax(numList);
//        System.out.println("Numbers list: " + numList);
//        System.out.println("Minimum value: " + minMaxResult.get("Min"));
//        System.out.println("Maximum value: " + minMaxResult.get("Max"));
//        
        //exo 20
//        System.out.println("\n--- Exercise 20: Fill List ---");
//        List<String> emptyStringList = new ArrayList<>(List.of("", "", "", "", ""));
//        System.out.println("String list before fill: " + emptyStringList);
//        fillList(emptyStringList, "filled");
//        System.out.println("String list after fill: " + emptyStringList);
//        
//        List<Integer> numericList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
//        System.out.println("Number list before fill: " + numericList);
//        fillList(numericList, 0);
//        System.out.println("Number list after fill: " + numericList);
    }
}
