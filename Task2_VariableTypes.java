class Task2_VariableTypes {
    public static void main(String[] args) {
        int    age        = 25;
        double salary    = 55000.50;
        boolean employed  = true;
        char   grade     = 'A';

        System.out.println(age);
        System.out.println(salary);
       System.out.println(employed);
       System.out.println(grade);


        final int   MAX_SCORE = 100;
         // MAX_SCORE = 5;     // ERROR — cannot reassign final
        System.out.println(MAX_SCORE);



    }
}