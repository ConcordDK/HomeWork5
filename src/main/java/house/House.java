package house;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class House {
    public static void main(String[] args) {
        Map<Integer, String> nameAndAge = new HashMap<>();
        nameAndAge.put(25, "Иванов Иван Иванович");
        nameAndAge.put(35, "Петрова Мария Васильевна");
        nameAndAge.put(40, "Сидоров Александр Петрович");
        nameAndAge.put(30, "Кузнецова Ольга Александровна");
        nameAndAge.put(28, "Васильев Сергей Игоревич");
        nameAndAge.put(32, "Никитина Анна Дмитриевна");
        nameAndAge.put(15, "Михайлов Антон Владимирович");
        nameAndAge.put(13, "Козлов Максим Андреевич");
        nameAndAge.put(31, "Лебедева Юлия Олеговна");
        nameAndAge.put(29, "Егоров Дмитрий Анатольевич");

        List<String> adults = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : nameAndAge.entrySet()) {
            if (18 > entry.getKey()) {
                adults.add(entry.getValue());
            }
        }
        System.out.println("Этим жильцам дома нет 18 лет: " + adults);
    }
}