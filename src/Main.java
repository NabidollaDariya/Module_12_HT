
class Vacancy {
    boolean approved;

    Vacancy(boolean approved) {
        this.approved = approved;
    }
}

class Candidate {
    boolean passedHRInterview;
    boolean passedTechInterview;

    Candidate(boolean hr, boolean tech) {
        this.passedHRInterview = hr;
        this.passedTechInterview = tech;
    }
}

class HiringProcess {
    void startProcess(Vacancy vacancy, Candidate candidate) {
        System.out.println(" Процесс найма ");

        if (!vacancy.approved) {
            System.out.println("Заявка требует доработки.");
            return;
        }

        System.out.println("Вакансия опубликована. Кандидаты подают заявки.");

        if (candidate.passedHRInterview && candidate.passedTechInterview) {
            System.out.println("Кандидат успешно прошёл собеседования. Отправлен оффер.");
            System.out.println("Кандидат подтверждает оффер.");
            System.out.println("Система добавляет сотрудника в базу.");
            System.out.println("HR уведомляет IT о настройке рабочего места.");
        } else {
            System.out.println("Кандидат не прошёл собеседование. Отправлен отказ.");
        }
    }
}

class BookingSystem {
    boolean checkAvailability(String date) {
        return date.equals("2026-05-01");
    }

    boolean processPayment(double amount) {
        return amount > 0;
    }

    void bookEvent(String date, double amount) {
        System.out.println("=== Процесс бронирования мероприятия ===");

        if (checkAvailability(date)) {
            System.out.println("Площадка доступна. Отправлена информация клиенту.");
            if (processPayment(amount)) {
                System.out.println("Платеж успешен. Бронирование подтверждено.");
                System.out.println("Уведомление клиенту и администратору площадки.");
                System.out.println("Администратор готовит задачи. Подрядчики получают уведомления.");
                System.out.println("Подрядчики подтверждают выполнение задач.");
                System.out.println("Система отправляет отчёт администратору.");
                System.out.println("После мероприятия клиент получает запрос на отзыв.");
                System.out.println("Система собирает отзывы и отправляет менеджеру.");
            } else {
                System.out.println("Платеж отклонён. Клиенту предложено повторить оплату.");
            }
        } else {
            System.out.println("Площадка недоступна. Клиенту предложено выбрать другую дату.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Vacancy vacancy = new Vacancy(true);
        Candidate candidate = new Candidate(true, true);
        HiringProcess hiring = new HiringProcess();
        hiring.startProcess(vacancy, candidate);

        System.out.println();

        BookingSystem booking = new BookingSystem();
        booking.bookEvent("2026-05-01", 1000.0);
    }
}
