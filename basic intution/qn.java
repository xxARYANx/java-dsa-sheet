
import java.util.Scanner;


public class qn{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            int x=s.nextInt();
            for(int y=1;y<x;y++){
                    for(int rem=1;rem<=y;rem++){
                        if(x%rem==0 && y%rem==0 && rem+y==x){
                            System.out.println(y);
                           
                        }
                        break;
                    }
                }
            }
        }
    }
