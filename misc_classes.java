import java.util.*;
import java.io.*;

class misc_classes {
    public static void main(String[] args) {
        oddeven.messi(5);
    };
}

class oddeven {
    static void messi(int a) {
        if (a % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

class vowelcounter {
    static void ghkl() {
        int t = 0;
        String s = "APPLICATIONS";
        int l = s.length();
        for (int j = 0; j <= l - 1; j++) {
            char ch = s.charAt(j);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                t = t + 1;
        }
        System.out.println("Number of vowels=" + t);
    }
}

class scan {
    static void fn() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}

class stringfunc {
    static void kgfl() {
        String s = "COMPUTER";
        int l = s.length();
        for (int i = 0; i <= l - 1; i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
    }
}

class reader {
    static void fn() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        int n = Integer.parseInt(br.readLine());
        int o = Integer.parseInt(br.readLine());
        if (n >= o) {
            if (n > o)
                System.out.println(n);
            else
                System.out.println("Both are equal");
        }
        if (n <= o) {
            if (n < o)
                System.out.println(o);
            else
                System.out.println("Both are equal");
        }
    }
}

class wordcounter{
    static void poiw(){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=0,w=1,d=0,a=0,c=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {char ch=s.charAt(i);
            if(ch==' ')
            {n=n+1;
            w=w+1;}
            if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
            {d=d+1;}
            if(ch=='.'||ch=='!'||ch==',')
            c=c+1;}
            a=l-(n+d+c);
        System.out.println("Number of alphabets are "+a);
        System.out.println("Number of digits are "+d);
        System.out.println("Number of spaces are "+n);
        System.out.println("Number of words are "+w);
        }
    }

class sumofsqofdigit{
    static void digit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int s=0;
        for( ;a>0;a=a/10)
        {int d=a%10;
         int b=d*d;
         s=s+b;
         }
        System.out.println(s);
        }
}

class squareroot{
    static void root(){
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter a number");
        int a=sc.nextInt();
        for(int i=0;i<=a;i++)
        {if((i*i)==a)
          flag=1;
         else
          continue;
        }
        if(flag==1)
        System.out.println("It is perfect square");
        else
        System.out.println("Not a perfect square");
    }
}

class lettercounter{
    static void ktjh(){
        int a=0;
        String s="APPLICATIONS";
        int l=s.length();
        for(int i=0;i<=l-1;i++)
        {char ch=s.charAt(i);
            if(ch=='A')
            a=a+1;}
            System.out.println("Number of A's="+a);
        }
    }

    class revletter{
    static void kygf(){
        String s="COMPUTER";
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {char ch=s.charAt(i);
            System.out.println(ch);
        }
    }
}

class funcoverload{
    static void SumSeries(int n,double x){
        double s=0;
        for(int i=1;i<=n;i++)
        {if(i%2==0)
            s=s-(x/i);
            else
            s=s+(x/i);
            }
            System.out.println(s);
    }
    static void SumSeries(){
        int s=0,p=1;
        for(int i=1;i<=20;i++)
        {p=p*i;
            s=s+p;
        } System.out.println(s);
        
    }
}

class min{
    static void name(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=9;i++)
        {int n=sc.nextInt();
            if(n<=a)
            a=n;
        }
        System.out.println(a);
   }
}

class nestedloop{
    static void beckham(){
         int i,d; 
      for(i=10;i>0;i--)
        {for(d=0;d<i;d++)
           { System.out.print("*");
        }
        System.out.println();
    }
}
}
