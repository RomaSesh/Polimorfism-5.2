// Главный класс для работы с системой пропусков университета.
public class register {
    public static void main(String[] args) {
        // Создание массива для хранения пропусков
        Pass[] register = new Pass[4];

        // Инициализация объектов пропусков
        register[0] = new TeacherPass("Лешуков", "Иван", "Иванович", "Физический", "Кафедра физики");
        register[1] = new TeacherPass("Акакий", "Петр", "Петрович", "Математический", "Кафедра математики");
        register[2] = new StudentPass("Кисилёв", "Дмитрий", "Сидорович", "Физический", 2021);
        register[3] = new StudentPass("Кузнецова", "Ксения", "Сергеевна", "Математический", 2022);

        // Вывод информации о всех пропусках
        for (Pass pass : register) {
            System.out.println(pass.getInfo());
        }

        // Вывод информации только о пропусках студентов
        System.out.println("Информация о пропусках студентов:");
        for (Pass pass : register) {
            if (pass instanceof StudentPass) { // Проверка, является ли объект студентом
                System.out.println(pass.getInfo());
            }
        }

        // Подсчет количества аннулируемых пропусков (студентов)
        int annulledCount = 0;
        for (Pass pass : register) {
            if (pass instanceof StudentPass) {
                annulledCount++;
            }
        }

        // Вывод количества аннулируемых пропусков
        System.out.println("Количество аннулируемых пропусков: " + annulledCount);
    }
}


