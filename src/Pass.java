// Базовый класс для пропусков.
public abstract class Pass {
    private String lastName; // Фамилия
    private String firstName; // Имя
    private String patronymic; // Отчество
    private String faculty; // Факультет

    /**
     * Конструктор для инициализации данных пропуска.
     *
     * @param lastName Фамилия владельца пропуска.
     * @param firstName Имя владельца пропуска.
     * @param patronymic Отчество владельца пропуска.
     * @param faculty Факультет, к которому принадлежит владелец пропуска.
     */
    public Pass(String lastName, String firstName, String patronymic, String faculty) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.faculty = faculty;
    }

    // Геттеры для получения данных о пропуске

    /**
     * Получает фамилию владельца пропуска.
     *
     * @return Фамилия.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Получает имя владельца пропуска.
     *
     * @return Имя.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Получает отчество владельца пропуска.
     *
     * @return Отчество.
     */
    public String getPatronymic() {
        return patronymic;
    }

    /**
     * Получает факультет, к которому принадлежит владелец пропуска.
     *
     * @return Факультет.
     */
    public String getFaculty() {
        return faculty;
    }

    /**
     * Абстрактный метод для получения информации о пропуске.
     * Должен быть реализован в подклассах.
     *
     * @return Строка с информацией о пропуске.
     */
    public abstract String getInfo();
}