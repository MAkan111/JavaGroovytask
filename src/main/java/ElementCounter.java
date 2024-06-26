import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementCounter {
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (Integer element : list) {
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        return elementCountMap;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> result = countElements(list);
        System.out.println(result);
    }
}

/*

Тоже самое но на языке Groovy

    def countElements(List<Integer> list) {
        def elementCountMap = [:].withDefault { 0 }

        list.each { element ->
                elementCountMap[element] += 1
        }

        return elementCountMap
    }

    def list = [1, 3, 4, 5, 1, 5, 4]
        def result = countElements(list)
        println result*/
