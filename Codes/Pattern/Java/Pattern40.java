class Pattern40 {
    public static void main(String[] args) {
        int no=1;
        for(int i=0;i<5;i++) {
            int temp = no;
            for(int j=0;j<9;j++) {
                
                if((i+j)<=3||(j-i)>=5) {
                    System.out.print(" ");
                }else {
                    System.out.print(temp);
                    temp--;
                }
            }
            no = no + 2;
            System.out.println();
        }
    }
}