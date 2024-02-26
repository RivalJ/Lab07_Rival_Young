public class Lab07 {
    public static void main(String[] args) {

        for (int row = 1; row <= 6; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.printf("%1s", "*");
            }
            System.out.println();
        }



        for (int row = 6; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.printf("%1s", "*");
            }
            System.out.println();
        }



        for (int row = 6; row >= 1; row--) {

            for (int col = 1; col <= 6; col++) {
                System.out.printf("%1s", "*");
            }
            System.out.println();
        }

        for(int cnt = 0; cnt <= 30; cnt++){
            System.out.println(cnt);
        }



        for(int cnt = 30; cnt >= 0; cnt--){
            System.out.println(cnt);
        }



        for(int cnt = 0; cnt <= 18;){
            System.out.println(cnt);
            cnt = cnt+3;
        }


        for(int cnt = 10; cnt >= 0;){
            System.out.println(cnt);
            cnt = cnt-2;
        }


    }

}