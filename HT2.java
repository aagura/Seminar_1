

public class HT2 {
    //     Вывести все простые числа от 1 до 1000
public static void main(String[] args) {
    System.out.println("Простые числа от 1 до 1000: ");
    boolean flag = false;
    for (int i = 2; i <= 1000; i++){
            for  (int j = 2; j <= i/2; j++){
                if (i%j ==0 & i != j) {
                    flag = true;
                }
            }
            if (flag == false){
            System.out.print(i);
            System.out.print(' ');
            }
            flag = false;
            
        }
    
        }
           
    }
