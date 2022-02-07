package Week5;



// Task 1
// public class Test
// {
//    public static void print(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//          System.out.println(student[i].name);
//    }
// }

// Task 2
// public class Test
// {
//    public static void print(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//          System.out.println(student[i].mark);
//    }
// }

// Task 3
// public class Test
// {
//    public static void print(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//          System.out.println(student[i].mark + " (" + student[i].name + ")");
//    }
// }

//Task 4
// public class Test
// {
//    public static void print(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//          System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }
// }

// Task 5
// public class Test
// {
//    public static void print(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//          System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }

//    public static void printHonours(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//         if (student[i].getMark() >= 55)
//             System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }
// }

// Task 6
// public class Test
// {
//    public static void print(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//          System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }

//    public static void printHonours(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//         if (student[i].getMark() >= 55)
//             System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }

//     public static void printForties(Student [] student)
//     {
//         for(int i = 0; i < student.length; i++)
//         if (student[i].getMark() >= 40 && student[i].getMark() <= 49)
//             System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//     }
// }

// Task 7
// public class Test
// {
//    public static void print(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//          System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }

//    public static void printHonours(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//         if (student[i].getMark() >= 55)
//             System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }

//     public static void printForties(Student [] student)
//     {
//         for(int i = 0; i < student.length; i++)
//         if (student[i].getMark() >= 40 && student[i].getMark() <= 49)
//             System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//     }

//     public static int numberPasses(Student [] student) {
//         int count = 0;
//         for(int i = 0; i < student.length; i++) {
//             if (student[i].getMark() >= 40) count++;
//         }
//         return count;
//     }
// }

// Task 8
// public class Test
// {
//    public static void print(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//          System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }

//    public static void printHonours(Student [] student)
//    {
//       for(int i = 0; i < student.length; i++)
//         if (student[i].getMark() >= 55)
//             System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//    }

//     public static void printForties(Student [] student)
//     {
//         for(int i = 0; i < student.length; i++)
//         if (student[i].getMark() >= 40 && student[i].getMark() <= 49)
//             System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
//     }

//     public static int numberPasses(Student [] student) {
//         int count = 0;
//         for(int i = 0; i < student.length; i++) {
//             if (student[i].getMark() >= 40) count++;
//         }
//         return count;
//     }

//     public static Student getBestStudent(Student [] student) {
//         Student best = student[0];
//         for(int i = 1; i < student.length; i++) {
//             if (student[i].getMark() > best.getMark()) best = student[i];
//         }
//         return best;
//     }
// }

// Task 9
public class Test
{
   public static void print(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
         System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
   }

   public static void printHonours(Student [] student)
   {
      for(int i = 0; i < student.length; i++)
        if (student[i].getMark() >= 55)
            System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
   }

    public static void printForties(Student [] student)
    {
        for(int i = 0; i < student.length; i++)
        if (student[i].getMark() >= 40 && student[i].getMark() <= 49)
            System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
    }

    public static int numberPasses(Student [] student) {
        int count = 0;
        for(int i = 0; i < student.length; i++) {
            if (student[i].getMark() >= 40) count++;
        }
        return count;
    }

    public static Student getBestStudent(Student [] student) {
        Student best = student[0];
        for(int i = 1; i < student.length; i++) {
            if (student[i].getMark() > best.getMark()) best = student[i];
        }
        return best;
    }

    public static double getPassingAverage(Student [] student) {
        double total = 0;
        int studentCount = 0;
        for(int i = 0; i < student.length; i++) {
           if (student[i].getMark() >= 40) {
               total += student[i].getMark();
                studentCount++;
            }
        }
        return (total / studentCount);
    }
}

