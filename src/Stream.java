import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(8);
        list.add(60);
        list.add(4);
        list.add(83);
        list.add(68);

        list.stream()
                .map(a -> a + 15)
                .filter(a -> a > 50)
                .reduce((a, b) -> a + b);


        List<String> strings = new ArrayList<>();
        strings.add("Hallo, how are you?");
        strings.add("world");
        strings.add("Programming");
        strings.add("Yes");
        strings.add("No");

        List<Integer> result = strings.stream()
                .filter(str -> str.length() <= 15)
                .collect(Collectors.toList())
                .max((c, d) -> Integer.compare(c.length(), d.length()));
                .toList();

    }}





        //Есть список чисел (заполнить как угодно)
//К каждому числу добавить 15
//Оставить числа, большие 50
//Найти сумму чисел

//Есть список строк
//отсеять строки, больше 15 символов
//Найти самую большую строку



