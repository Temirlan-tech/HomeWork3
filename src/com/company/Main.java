public class Main {

    public static void main(String[] args) {
        float [] num  = new float[15];
        num [0] = 1.3f;
        num [1] = 2.7f;
        num [2] = 3.5f;
        num [3] = -4.0f;
        num [4] = 5.1f;
        num [5] = 6.6f;
        num [6] = 7.8f;
        num [7] = 8.4f;
        num [8] = 9.9f;
        num [9] = 10.2f;
        num [10] = 11.0f;
        num [11] = 12.3f;
        num [12] = 9.7f;
        num [13] = 7.6f;
        num [14] = 11.4f;



        float sum = 0;

        for (int i = 0; i < num.length; i++){

            if (num[i] < 0){

                for (int j = i+1; j < num.length; j++){
                    if (num [j] > 0 ){
                        sum = sum + num[j];
                    }
                    else  break;
                }

                break;
            }




        }

        System.out.println("Сумма = " + sum);



        float average = sum / num.length;
        System.out.println("Среднее арифметическое = " + average);
    }

}