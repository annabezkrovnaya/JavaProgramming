package ua.org.oa.annabezkrovnaya.task1;

import lombok.Data;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;


@Data
public class Date {

    private Day usedDay;
    private Month usedMonth;
    private Year usedYear;


    public Date(int day, int month, int year){//constructor for Date class using inner classes
        usedDay = new Day(day);
        usedMonth = new Month(month);
        usedYear = new Year(year);
    }

    public void printFullDate(){ //output full date with month name
        System.out.println("Your chosen date is " + usedDay.dayNum + " " + usedMonth.monthName + " " + usedYear.yearNum);
    }

    public String getDayOfWeek()throws DateTimeException{//find week's day name of the setting date

        LocalDate localDate = LocalDate.of(usedYear.yearNum, usedMonth.monthNum, usedDay.dayNum);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return WeekDay.valueOf(dayOfWeek.toString()).name;
    }

    public int getDayOfYear(){
        return usedYear.dayOfYear;
    } //return number of days in the year

    public  int getDayOfMonth(){//set number of days in each month
        int dayOfMonth = 0;
        switch (usedMonth.monthNum){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dayOfMonth = 31;
                break;
            case 2:
                if(usedYear.leapYear) dayOfMonth = 29;
                else dayOfMonth = 28;
                break;
            case 4: case 6: case 9: case 11:
                dayOfMonth = 30;
                break;

        }
        return dayOfMonth;
    }

    public int daysBetween(LocalDate date){//count number of days between two setting dates

        LocalDate date1 = LocalDate.of(usedYear.yearNum, usedMonth.monthNum, usedDay.dayNum);
        Period period = date1.until(date);
        return period.getDays();
    }

    public class Year{//inner class
        private int yearNum;
        int dayOfYear = 365;
        boolean leapYear;

        Year(int year){//check year with leaping
            yearNum = year;
            if ((yearNum% 400 == 0 && yearNum % 4 == 0)|| (yearNum % 4 == 0 && yearNum % 100 != 0)){
                dayOfYear = dayOfYear + 1;
            }
        }
    }

    public class Month{//inner class
        private int monthNum;
        private String monthName;
        Month(int month){//class constructor using month enumeration for setting month's name
            this.monthNum = month;
            for (MonthEnum monthEnum : MonthEnum.values()){
                if(monthEnum.monthNumber == month){
                    this.monthName = monthEnum.name();
                }
            }
        }
    }

    public enum MonthEnum { //month enumeration
        JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

        int monthNumber;
        MonthEnum(int monthNumber){
            this.monthNumber = monthNumber;
        }

    }
    public class Day{//inner class
        private int dayNum;
        private String dayName;
        Day(int day){
            this.dayNum = day;
        }

    }
    public enum WeekDay {//week's day enumeration
        SUNDAY(6), MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5);

        int weekDayNumber;
        String name;

        WeekDay(int weekDayNumber){
            this.weekDayNumber = weekDayNumber;
            this.name = name().substring(0, 1).toUpperCase().concat((name()).substring(1).toLowerCase());
        }
    }
}
