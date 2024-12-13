// Класс для пропусков преподавателей.
public class TeacherPass extends Pass {
    private String department; // Кафедра, к которой принадлежит преподаватель

    /**
     * Конструктор для инициализации данных пропуска преподавателя.
     *
     * @param lastName Фамилия преподавателя.
     * @param firstName Имя преподавателя.
     * @param patronymic Отчество преподавателя.
     * @param faculty Факультет, к которому принадлежит преподаватель.
     * @param department Кафедра, к которой принадлежит преподаватель.
     */
    public TeacherPass(String lastName, String firstName, String patronymic, String faculty, String department) {
        super(lastName, firstName, patronymic, faculty);
        this.department = department;
    }

    /**
     * Реализация метода для получения информации о пропуске преподавателя.
     *
     * @return Строка с информацией о пропуске преподавателя, включая фамилию, имя, отчество,
     *         факультет и кафедру.
     */
    @Override
    public String getInfo() {
        return "Преподаватель: " + getLastName() + " " + getFirstName() + " " + getPatronymic() +
                ", Факультет: " + getFaculty() + ", Кафедра: " + department;
    }
}
