package HomeWork.Lesson7;

public class Therapist {
    // У терапевта создать метод, который будет назначать врача пациенту согласно плану
// лечения:
// Если план лечения имеет код 1– назначить хирурга и выполнить метод лечить.
// Если план лечения имеет код 2– назначить дантиста и выполнить метод лечить.
// Если план лечения имеет любой другой код– назначить терапевта и выполнить метод
// лечить
   public void Treat() {
        System.out.println("Лечить");
    }

    public void AppointDoctor(int a) {
        for (int i = 0; i < 2; i++) {
            if (a == 1) {
                System.out.println("Идите к хирургу");

            }
            if (a == 2) {
                System.out.println("Идите к дантисту");
            }
            if (a < 1) {
                System.out.println("Повторный осмотр");

            }
            if (a > 2){
                System.out.println("Повторный осмотр");
            }
                break;

        }
    }

}
