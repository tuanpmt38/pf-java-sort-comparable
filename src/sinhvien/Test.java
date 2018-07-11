package sinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuan", 13));
        list.add(new Student("An", 15));
        list.add(new Student("Hung", 17));
        Collections.sort(list);

        for (Student st:list) {
            System.out.println(st.toString());
        }
    }
}
