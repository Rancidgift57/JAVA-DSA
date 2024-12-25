public class pattern{
    public static void main(String[] args){
        int a = 5;
        pattern obj = new pattern();
        obj.pat1(a);
        obj.pat2(a);
        obj.pat3(a);
        obj.pat4(a);
        obj.pat5(a);

        
    }

    public void pat5(int a){
        for(int i=0;i<(2*a);i++){
            int totalRow = i > a ? 2 * a -i : i;
            int nospace = a - totalRow;
            for(int s=0;s<nospace;s++){
                System.out.print(" ");
            }
            for(int j=0;j<totalRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pat4(int a){
        for(int i=0;i<(2*a);i++){
            int totalRow = i > a ? 2 * a -i : i; 
            for(int j=0;j<totalRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pat1(int a){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void pat2(int a){
        for(int i=0;i<=a;i++){
            for(int j=0;j<=a-i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public void pat3(int a){
        for(int i=0;i<=a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}