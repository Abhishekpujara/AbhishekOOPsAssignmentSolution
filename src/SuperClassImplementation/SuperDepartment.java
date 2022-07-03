package SuperClassImplementation;


public abstract class SuperDepartment {
    String Name;
    String Work;
    String Deadline;
    String Holiday;
    String Activity;
    String StackInformation;

    public String DepartmentName() {

        Name = "Super Department";
        return Name;
    }

    public String getTodaysWork() {

        Work = "No Work Today";
        return Work;
    }

    public String getWorkDeadline() {

        Deadline = "Nil";
        return Deadline;


    }

    public String isTodayHoliday() {

        Holiday = "Today is not a holiday";
        return Holiday;

    }

    public static class AdminDepartment extends SuperDepartment {

        public String DepartmentName() {


            Name = "Admin Department";
            return Name;
        }

        public String getTodaysWork() {


            Work = "Complete your documents Submission";
            return Work;
        }

        public String getWorkDeadline() {


            Deadline = "Complete by EOD ";
            return Deadline;


        }
    }

    public static class HrDepartment extends SuperDepartment {


        public String DepartmentName() {


            Name = "Hr Department ";
            return Name;
        }

        public String getTodaysWork() {


            Work = "Fill today’s worksheet and mark your attendance";
            return Work;
        }

        public String getWorkDeadline() {


            Deadline = "Complete by EOD ";
            return Deadline;


        }

        public String doActivity() {

            Activity = "team Lunch";
            return Activity;

        }

    }

    public static class TechDepartment extends SuperDepartment {

        public String DepartmentName() {


            Name = "Tech Department ";
            return Name;
        }

        public String getTodaysWork() {


            Work = "Complete coding of module 1";
            return Work;
        }

        public String getWorkDeadline() {


            Deadline = "Complete by EOD ";
            return Deadline;


        }

        public String getTechStackInformation() {

            StackInformation = "core Java";
            return StackInformation;

        }

    }


}
