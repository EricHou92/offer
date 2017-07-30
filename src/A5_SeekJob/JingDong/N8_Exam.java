package A5_SeekJob.JingDong;

import java.util.Scanner;

/**
 * Created by ciciya on 2017/4/7.
 */
public class N8_Exam {

    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int d,sumTime,sum1,sum2;
        while(scan.hasNextInt()){
            d=scan.nextInt();
            sumTime=scan.nextInt();
            sum1=0;
            sum2=0;
            int iminTime[]=new int[d];
            int imaxTime[]=new int[d];
            for(int i=0;i<d;i++){
                iminTime[i]=scan.nextInt();
                imaxTime[i]=scan.nextInt();
                sum1=sum1+iminTime[i];
                sum2=sum2+imaxTime[i];
            }
            if(sumTime>=sum1&&sumTime<=sum2){
                System.out.println("Yes");
                sumTime=sumTime-sum1;
                for(int i=0;i<d;i++){
                    if(sumTime>imaxTime[i]-iminTime[i]){
                        if(i!=d-1)
                            System.out.print(imaxTime[i]+" ");
                        else System.out.print(imaxTime[i]+"\n");
                        sumTime=sumTime-imaxTime[i]+iminTime[i];
                    }
                    else{
                        if(i!=d-1)
                            System.out.print(iminTime[i]+sumTime+" ");
                        else System.out.print(iminTime[i]+sumTime+"\n");
                        sumTime=0;
                    }
                }
            }else
                System.out.println("No");
        }
    }
}
