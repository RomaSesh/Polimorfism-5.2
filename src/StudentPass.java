// Класс для пропусков студентов.
public class StudentPass extends Pass {
    private int yearOfAdmission; // Год поступления студента

    /**
     * Конструктор для инициализации данных пропуска студента.
     *
     * @param lastName Фамилия студента.
     * @param firstName Имя студента.
     * @param patronymic Отчество студента.
     * @param faculty Факультет, к которому принадлежит студент.
     * @param yearOfAdmission Год поступления студента.
     */
    public StudentPass(String lastName, String firstName, String patronymic, String faculty, int yearOfAdmission) {
        super(lastName, firstName, patronymic, faculty);
        this.yearOfAdmission = yearOfAdmission;
    }

    /**
     * Реализация метода для получения информации о пропуске студента.
     *
     * @return Строка с информацией о пропуске студента, включая фамилию, имя, отчество,
     *         факультет и год поступления.
     */
    @Override
    public String getInfo() {
        return "Студент: " + getLastName() + " " + getFirstName() + " " + getPatronymic() +
                ", Факультет: " + getFaculty() + ", Год поступления: " + yearOfAdmission;
    }
}

