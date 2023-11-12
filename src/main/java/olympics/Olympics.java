package olympics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Olympics {
    public static void main(String[] args) {

        Student ivanIvanov = new Student("Иван", "Иванов", "Иванович", score());
        Student dmitriyKuznetsov = new Student("Дмитрий", "Кузнецов", "Александрович", score());
        Student pavelSidorov = new Student("Павел", "Сидоров", "Сергеевич", score());
        Student sergeyArtemyev = new Student("Сергей", "Артемьев", "Петрович", score());

        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(ivanIvanov);
        studentsList.add(dmitriyKuznetsov);
        studentsList.add(pavelSidorov);
        studentsList.add(sergeyArtemyev);
        scoring(studentsList);

    }
    public static void scoring(List<Student> studentsList) {
        studentsList.sort((s1, s2) -> Double.compare(s2.calculateAverageScore(), s1.calculateAverageScore()));
        String[] places = {"Первое", "Второе", "Третье"};
        for (int i = 0; i < 3; i++) {
            System.out.println(places[i] + " место: " + studentsList.get(i).getSurname() + " "
                    + studentsList.get(i).getName() + " " + studentsList.get(i).getPatronymic() + " " + studentsList.get(i).getScore());
        }
    }
    private static ArrayList<Integer> score() {               //производим очки у каждого студента
        ArrayList<Integer> score = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            score.add(random.nextInt(100));
        }
        return score;
    }
}