class Pattern31 {

    public static void main(String[] args) {
        for(int i=0;i<5;i++) {
            int no=1;
            for(int j=0;j<5;j++) {

                if((i-j)>=1) {
                    System.out.print(" ");
                } else {
                    System.out.print(no);
                    no++;
                }
            }
            System.out.println();
        }
    }
}