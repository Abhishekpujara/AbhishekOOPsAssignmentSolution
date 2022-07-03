package Main;


import static SuperClassImplementation.SuperDepartment.*;


public class DriverClass {

    public static void main(String[] args) {

        AdminDepartment s = new AdminDepartment();
        System.out.println("welcome to the " + s.DepartmentName());
        System.out.println(s.getTodaysWork());
        System.out.println(s.getWorkDeadline());
        System.out.println(s.isTodayHoliday());
        System.out.println();
        HrDepartment h = new HrDepartment();
        System.out.println("welcome to the " + h.DepartmentName());
        System.out.println(h.getTodaysWork());
        System.out.println(h.getWorkDeadline());
        System.out.println(h.doActivity());
        System.out.println(h.isTodayHoliday());
        System.out.println();
        TechDepartment t = new TechDepartment();
        System.out.println("welcome to the " + t.DepartmentName());
        System.out.println(t.getTodaysWork());
        System.out.println(t.getWorkDeadline());
        System.out.println(t.getTechStackInformation());
        System.out.println(t.isTodayHoliday());
    }
}
