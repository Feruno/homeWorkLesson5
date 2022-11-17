package org.example;
/*Создать класс House
- Создать HashMap
- Заполнить ее жильцами по принципу (ФИО, Возраст)
- Пройти по Мапе и найти всех жильцов кому больше 18ти лет
- Найденных жильцов записать в ArrayList (Возраст указывать необязательно)
- Получившийся ArrayList отсортировать и вывести в консоль
*/
import java.util.*;

public class House {
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (K key: map.keySet())
        {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> residents = new HashMap<String, Integer>();
        residents.put("Виктор Викторов Викторович", 12);
        residents.put("Александв Алесандров Александрович", 18);
        residents.put("Лидия Аркадьевна Бубликова", 28);
        residents.put("Дональд Джон Трамп", 22);

        ArrayList<String> residentsAge18 = new ArrayList<>();

        Set<String> keysResidents = residents.keySet();
        //System.out.println("ключи" + keysResidents);
        ArrayList<Integer> valuesResidents = new ArrayList<>(residents.values());
        //System.out.println("Значения" + valuesResidents);

        for (int i = 0; i < valuesResidents.size(); i++) {
            if (valuesResidents.get(i) >= 18){
                //System.out.println("test " + getKey(residents, valuesResidents.get(i)));
                residentsAge18.add(getKey(residents, valuesResidents.get(i)));
            }
        }
        Collections.sort(residentsAge18);
        System.out.println(residentsAge18);
    }
}
