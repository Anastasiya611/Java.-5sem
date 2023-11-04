// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена с разными телефонами,
//  их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;


public class phone {
    public static void main(String[] args) {
HashMap<String, ArrayList<Integer>> phone = new HashMap<String, ArrayList<Integer>>();

ArrayList<Integer> mashaList = new ArrayList<Integer>();
mashaList.add(896586);
mashaList.add(252566);
mashaList.add(569762);
Collections.sort(mashaList, Collections.reverseOrder());


phone.put("Masha", mashaList);

ArrayList<Integer> pashaList = new ArrayList<Integer>();
pashaList.add(462566);
pashaList.add(655762);
Collections.sort(pashaList, Collections.reverseOrder());

phone.put("Pasha", pashaList);

ArrayList<Integer> sashaList = new ArrayList<Integer>();
sashaList.add(996586);
Collections.sort(sashaList, Collections.reverseOrder());

phone.put("Sasha", sashaList);
System.out.println(phone);
}
}