import java.util.Scanner;

// Создать класс Ноутбук для магазина техники. 
// Добавить атрибуты класса с соответствующими типами. 
// Например, 
// - идентификатор 
// - производитель 
// - название модели 
// - RAM 
// - объем HD 
// - операционная система 
// - и т.д. 
// Добавить конструктор класса. 
// Добавить необходимые методы класса. 
 
// Создать множество ноутбуков (множество объектов класса ноутбук). 
// 3-10 штук 
 
// Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию. 
// Например: 
 
// “Введите цифру, соответствующую необходимому критерию: 
// 1 - RAM 
// 2 - Объем HD 
// 3 - Операционная система 
// 4 - Цвет … 
 
// Для критериев объем и память необходимо запросить дополнительно диапазон. 
// Например, 
// "Введите минимальное значение" 
// "Введите максимальное значение" 
 
// Отфильтровать ноутбуки и вывести проходящие по критерию. 
// Пример вывода: 
 
// Ноутбуки с объем HD от 256 до 512 
// 1 HP EliteBook... 
// 2.. 
// 3... 
 
// Пример вывода: 
 
// Ноутбуки с цвет Серебристый 
// 1 Honor ... 
// 2.. 
// 3...


public class Task_6_4 {
    public static void main(String[] args) {
        // (int id, String firm, String model, int ramVolume, int hdVolume, String os, String color)
        NoteBook nb1 = new NoteBook(1,"HP", "Probook", 8, 256, "Windows 10", "Silver");
        NoteBook nb2 = new NoteBook(2,"HP", "Probook", 8, 512, "Windows 10", "Black");
        NoteBook nb3 = new NoteBook(3,"MSI", "Creator", 16, 1024, "Windows 10", "Silver");
        NoteBook nb4 = new NoteBook(4,"DELL", "XPS15", 16, 512, "Linux", "Black");
        NoteBook nb5 = new NoteBook(5,"Apple", "MacBook", 8, 256, "Mac OS", "Silver");
        NoteBook nb6 = new NoteBook(6,"Huawei", "D15", 8, 512, "Windows 10", "Red");
        NoteBook nb7 = new NoteBook(7,"ASUS", "TUF Gaming", 16, 1024, "Linux", "Black");

        NoteBook[] nb = new NoteBook[]{nb1, nb2, nb3, nb4, nb5, nb6, nb7};

        

        

        System.out.println("Введите цифру, соответствующую необходимому критерию: \n 1 - Объем HD \n 2 - Операционная система \n 3 - Цвет");
        Scanner iScanner = new Scanner(System.in);
        Integer tmp = iScanner.nextInt();

        if (tmp == 1) {
            System.out.print("Введи минимальный объем HDD: ");
            Scanner iScanner1 = new Scanner(System.in);
            Integer hddMin = iScanner1.nextInt();
            System.out.print("Введи максимальный объем HDD: ");
            Scanner iScanner2 = new Scanner(System.in);
            Integer hddMax = iScanner2.nextInt();
            System.out.println(NoteBook.getHDD(nb, hddMin, hddMax));
            iScanner1.close();
            iScanner2.close();
        }

        if (tmp == 2) {
            System.out.println("Выбери операционную систему: \n 1 - Windows 10 \n 2 - Linux \n 3 - Mac OS");
            Scanner iScannerNew = new Scanner(System.in);
            Integer temp = iScannerNew.nextInt();
            if (temp == 1) {
                System.out.println(NoteBook.getOS(nb, "Windows 10"));
            }
            else if (temp == 2) {
                System.out.println(NoteBook.getOS(nb, "Linux"));
            }
            else if (temp == 3) {
                System.out.println(NoteBook.getOS(nb, "Mac OS"));
            }            
            iScannerNew.close();
        }

        if (tmp == 3) {
            System.out.println("Выбери цвет: \n 1 - Black \n 2 - Silver \n 3 - Red");
            Scanner iScannerNew = new Scanner(System.in);
            Integer temp = iScannerNew.nextInt();
            if (temp == 1) {
                System.out.println(NoteBook.getColor(nb, "Black"));
            }
            else if (temp == 2) {
                System.out.println(NoteBook.getColor(nb, "Silver"));
            }
            else if (temp == 3) {
                System.out.println(NoteBook.getColor(nb, "Red"));
            }            
            iScannerNew.close();
        }


        iScanner.close();
        
    }
}