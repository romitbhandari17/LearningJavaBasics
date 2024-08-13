public class ControlFlow {
    public static void main(String[] args) {

        int a = 3;
        int b=5;
        if (a==b) {
            System.out.println("inside if");
        } else if (a<b) {
            System.out.println("inside else if");
        } else {
            System.out.println("inside else");
        }

        switch (a) {

            case 1:
                System.out.println("code 1");
                break;

            case 2:
                System.out.println("code 2");
                break;

//            case 3:
//                System.out.println("code 3");
//                break;

            case 4:
                System.out.println("code 4");
                break;

            default:
                System.out.println("default");
                break;
        }

//        int[] numbers = {1, 2, 3, 4, 5};
//        for (int i = 0; i < numbers.length; i=i+2) {
//            System.out.println("Element at index " + i + ": " + numbers[i]);
//        }
//
//        for (Integer num : numbers) {
//            System.out.println("Element: " + num);
//        }

//        int i = 0;
//        while (i < -1) {
//            i++;
//            System.out.println(i);
//        }

//        int i=0;
//        do{
//            System.out.println(i);
//        }while(i<0);

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // Exit the current iteration
            }
            System.out.println(i);
        }



    }
}
