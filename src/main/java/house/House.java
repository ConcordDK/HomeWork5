package house;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House {
    public static void main(String[] args) {
        Map<String, Integer> nameAndAge = new HashMap<>();
        nameAndAge.put("Иванов Иван Иванович", 25);
        nameAndAge.put("Петрова Мария Васильевна", 35);
        nameAndAge.put("Сидоров Александр Петрович", 40);
        nameAndAge.put("Кузнецова Ольга Александровна", 30);
        nameAndAge.put("Васильев Сергей Игоревич", 28);
        nameAndAge.put("Никитина Анна Дмитриевна", 32);
        nameAndAge.put("Михайлов Антон Владимирович", 15);
        nameAndAge.put("Козлов Максим Андреевич", 13);
        nameAndAge.put("Лебедева Юлия Олеговна", 31);
        nameAndAge.put("Егоров Дмитрий Анатольевич", 29);

        List<String> adults = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : nameAndAge.entrySet()) {
            if (entry.getValue() > 18) {
                adults.add(entry.getKey());
            }
        }
        System.out.println("Этим жильцам дома есть 18 лет: " + adults);
    }
}