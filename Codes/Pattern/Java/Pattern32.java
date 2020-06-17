class Pattern32 {

    public static void main(String[] args) {
        int ch=69;
        for(int i=0;i<5;i++) {
            for(int j=0;j<5;j++) {

                if((i-j)>=1) {
                    System.out.print(" ");
                } else {
                    System.out.print((char)ch);
                }
            }
            ch--;
            System.out.println();
        }
    }
}