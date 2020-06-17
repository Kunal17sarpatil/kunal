class Pattern35 {
    public static void main(String[] args) {
        int no=1;
        for(int i=0;i<5;i++) {
            for(int j=0;j<9;j++) {
                if((i+j)<=3||(j-i)>=5) {
                    System.out.print(" ");
                } else {
                    System.out.print(no);
                }
            }
            no++;
            System.out.println();
        }
    }
}