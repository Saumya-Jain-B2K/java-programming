public class functions {
    //method to print 2 ka table
        static void print2Table(){
            for(int i =1; i<=10; i++){
                System.out.println(i*2+ " ");
            }
        }

    // method to print sum of two numbers without parameters
    static void sumTwo(){
        int a = 5;
        int b = 6;
        int sum = a+b;
        System.out.println(sum);
    }

    //sum with parameters
    static void parSum(int x, int y){
        System.out.println(x+y);
    }

    //using return statement in void
    static void multiply(int a, int b){
        System.out.println("Result:" + a*b);
    }

    //using return with non-void function
    static int multiply1(int a, int b){
        //System.out.println("Result:" + a*b);
        return a*b;
    }

    //homework
    //1
    static void printWelcomeMessage(){
        System.out.println("Hello welcome to the first program!");
    }

    //2
    static int add(int a, int b ){
        int sum = a+b;
        return sum;
    }

    //3
    static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    //4
    static int getmax(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    //5
    static int calculatePercentage(int obt, int total){
        int percentage = (obt*100)/total;
        return percentage;
    }

    //6
    static int display(int num){
        return num;
    }

    static String display(String str){
        return str;
    }

    //7
    static void updateValue(int num){
        num = num+1;
         System.out.println(num);    
    }

    public static void main(String[] args) {
        // sumTwo();
        // parSum(5, 6);
        // int ans = multiply1(5, 6);
        // System.out.println(ans);
        // printWelcomeMessage();
        // int ans= add(23, 34);
        // System.out.println("ans:"+ans);
        // boolean ans= isEven(19);
        // System.out.println(ans);

        // int ans = getmax(10, 7);
        // System.out.println(ans);

        // int ans = calculatePercentage(482, 500);
        // System.out.println(ans);

        // int ans = display(10);
        // System.out.println(ans);

        // String ans1 = display("My name is saumya");
        // System.out.println(ans1);

        int num = 10;
        updateValue(num);
        System.out.println(num);

    }
}
