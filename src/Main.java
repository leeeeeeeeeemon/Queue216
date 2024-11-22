import java.util.ArrayDeque;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> cities = new ArrayDeque<String>();

        //стандартное добавление элементов
        cities.add("Kazan");
        cities.addFirst("Moscow"); //добавлвяем в самое начало
        cities.push("Amerika"); //добавлвяем в самое начало
        cities.addLast("SPB"); // добавляем элемент в конец
        cities.add("EKB");

        String sFirst = cities.getFirst(); // первый элемент без удаления
        System.out.println(sFirst);
        String sLast = cities.getLast(); //последний элемент без удаления
        System.out.println(sLast);

        System.out.println(cities.size()); //размер очереди

        //перебор без удаления
        for (String str : cities){
            System.out.println(str);
        }

        //перебор коллекции с удалением
        while (cities.peek()!=null){
            //извлечение с начала
            System.out.println(cities.pop());
        }


    }


}