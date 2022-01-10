package task7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Days {
    public static void main(String[] args) {
        Map<Integer, String> days = new HashMap<>();
        days.put(1,"Понедельник");
        days.put(2,"Вторник");
        days.put(3,"Среда");
        days.put(4,"Четверг");
        days.put(5,"Пятница");
        days.put(6,"Суббота");
        days.put(7,"Воскресение");

        Random random=new Random();
        System.out.println(days.get(1+ random.nextInt(6)));
    }
}
