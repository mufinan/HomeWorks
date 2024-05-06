package Week2;

import java.time.Year;

    public class MaasHesaplama {
        // Nitelikler
        private String name;
        private double salary;
        private int workHours;
        private int hireYear;

        // Kurucu Metot
        public MaasHesaplama(String name, double salary, int workHours, int hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }

        // Vergi Hesaplama Metodu
        public double tax() {
            if (salary <= 1000) {
                return 0;
            } else {
                return salary * 0.03;
            }
        }

        // Bonus Hesaplama Metodu
        public double bonus() {
            if (workHours > 40) {
                int extraHours = workHours - 40;
                return extraHours * 30;
            } else {
                return 0;
            }
        }

        // Maaş Artışı Hesaplama Metodu
        public double raiseSalary() {
            int yearsWorked = Year.now().getValue() - hireYear;
            if (yearsWorked < 10) {
                return salary * 0.05;
            } else if (yearsWorked >= 10 && yearsWorked < 20) {
                return salary * 0.1;
            } else {
                return salary * 0.15;
            }
        }

        // toString Metodu
        @Override
        public String toString() {
            double tax = tax();
            double bonus = bonus();
            double raise = raiseSalary();
            double totalSalary = salary - tax + bonus + raise;

            return STR."""
          Adı: \{name}
          Maaşı: \{salary}
          Çalışma Saati: \{workHours}
          Başlangıç Yılı: \{hireYear}
          Vergi: \{tax}
          Bonus: \{bonus}
          Maaş Artışı: \{raise}
          Vergi ve Bonuslar ile birlikte maaş: \{salary - tax + bonus}
          Toplam Maaş: \{totalSalary}""";
        }

        // Ana Metod
        public static void main(String[] args) {
            MaasHesaplama employee = new MaasHesaplama("Kemal", 2000.0, 45, 1985);
            System.out.println(employee.toString());
        }
    }


