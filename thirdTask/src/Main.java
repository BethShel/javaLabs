import java.util.Iterator;
public class Main {

    public static void main(String[]args)
    {
        myHashSet<String> h = new myHashSet<String>();

        // Добавляем элементы в HashSet с помощью метода add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");// пытаемся добавить еще один такой же элемент

        // Выводим элементы HashSet в консоль
        System.out.println(h);
        System.out.println("List contains India or not:" +
                h.contains("India"));

        // Удаляем элементы из множества с помощью метода remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:"+h);

        // Проходимся по элементам HashSet с помощью итератора:
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
