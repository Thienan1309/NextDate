
package testing_nextdate;

import java.util.Scanner;

public class Testing_NextDate {


    public static int[] nextDate(int d, int m, int y) {
        int daysInMonth = daysInMonth(m, y);

        if (d < daysInMonth) {
            return new int[]{d + 1, m, y};
        } else {
            // d == daysInMonth
            if (m < 12) {
                return new int[]{1, m + 1, y};
            } else {
                // 31/12 -> 1/1/(y+1)
                return new int[]{1, 1, y + 1};
            }
        }
    }

  
    public static boolean isValidDate(int d, int m, int y) {
        if (y <= 0 || m < 1 || m > 12) return false;
        // dim = day + in + month
        int dim = daysInMonth(m, y);
        return d >= 1 && d <= dim;
    }

 
    public static int daysInMonth(int m, int y) {
        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
             case 4, 6, 9, 11 -> {
               return 30;
            }
             case 2 ->  {
                return isLeap(y) ? 29 : 28;
            }
            default -> throw new IllegalArgumentException("Thang khong hop le: " + m);
        }
    }

   
    public static boolean isLeap(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }
    public static String nextDateStr(int d, int m, int y) {
        int[] nd = nextDate(d, m, y);
        return nd[0] + "/" + nd[1] + "/" + nd[2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay (d m yyyy), vi du 28 2 2024: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (!Testing_NextDate.isValidDate(d, m, y)) {
            System.out.println("Ngay khong hop le.");
            return;
        }

        int[] next = Testing_NextDate.nextDate(d, m, y);
        System.out.println("Ngay ke tiep: " + next[0] + "/" + next[1] + "/" + next[2] + "\n");


        
    }
    }

