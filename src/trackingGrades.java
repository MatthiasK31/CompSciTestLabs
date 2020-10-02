import java.util.Scanner;

class trackingGrades {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            //setup variables
            String studentName;
            double grades;
            int nOfGrades = 0;

            //ask for the student 1's name
            System.out.println("Enter the student's name");
            studentName = s.next();
            Student s1 = new Student(studentName);

            System.out.println("Enter the number of tests this marking period: ");
            nOfGrades = s.nextInt();
            s1.getAmount(nOfGrades);
            for (int j = 0; j < nOfGrades; j++) {
                System.out.println("Enter test grade #" + (nOfGrades + 1) + " for " + s1.printName());
                grades = s.nextDouble();
                s1.inputGrades(grades);
            }

            //print out the average
            System.out.println("The average for " + s1.printName() + ": " + s1.getAverage());
        }


    }
}

class Student {
    public String name;
    public double sum = 0,
            average = 0,
            amount;

    public Student(String studentName) {
        name = studentName;
    }

    public void inputGrades(double n) {
        sum += n;
    }

    public double getAverage() {
        average = sum / amount;
        return average;
    }

    public void getAmount(double n) {
        amount = n;
    }

    public String printName() {
        return name;
    }
}
